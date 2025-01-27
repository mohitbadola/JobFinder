package com.jason.JobFinder.repository;

import com.jason.JobFinder.entity.JobPostActivity;
import com.jason.JobFinder.entity.JobSeekerApply;
import com.jason.JobFinder.entity.JobSeekerProfile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobSeekerApplyRepository extends JpaRepository<JobSeekerApply, Integer> {

    List<JobSeekerApply> findByUserId(JobSeekerProfile userId);
    List<JobSeekerApply> findByJob(JobPostActivity job);


}
