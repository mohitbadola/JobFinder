package com.jason.JobFinder.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "job_seeker_profile")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobSeekerProfile {

    @Id
    private Integer userAccountId;

    @OneToOne
    @JoinColumn(name = "user_account_id")
    @MapsId
    private Users userId;

    private String firstName;
    private String lastName;
    private String city;
    private String state;
    private String country;
    private String workAuthorization;
    private String employmentType;
    private String resume;
    @Column(nullable = true, length = 64)
    private String profilePhoto;

    @OneToMany(targetEntity = Skills.class, cascade = CascadeType.ALL, mappedBy = "jobSeekerProfile")
    private List<Skills> skills;


    public JobSeekerProfile(Users users) {
        this.userId = users;
    }

    @Transient
    public String getPhotosImagePath(){
        if(profilePhoto == null || userAccountId == null)return null;
        return "/photos/candidate/" + userAccountId + "/" + profilePhoto;
    }
}
