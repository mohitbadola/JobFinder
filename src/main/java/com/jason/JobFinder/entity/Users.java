package com.jason.JobFinder.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String userId;

    @Column(unique = true)
    private String email;

    @NotEmpty
    private String password;

    private String isActive;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private String registrationDate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userTypeId", referencedColumnName = "userTypeId")
    private UsersType userTypeId;

    public Users(String userId, String email, String password, String isActive, String registrationDate, UsersType userTypeId) {
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.isActive = isActive;
        this.registrationDate = registrationDate;
        this.userTypeId = userTypeId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public UsersType getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(UsersType userTypeId) {
        this.userTypeId = userTypeId;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId='" + userId + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", isActive='" + isActive + '\'' +
                ", registrationDate='" + registrationDate + '\'' +
                ", userTypeId=" + userTypeId +
                '}';
    }
}
