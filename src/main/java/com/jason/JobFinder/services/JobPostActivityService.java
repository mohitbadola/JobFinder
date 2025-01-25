package com.jason.JobFinder.services;

import com.jason.JobFinder.entity.JobPostActivity;
import com.jason.JobFinder.repository.JobPostActivityRepository;
import org.springframework.stereotype.Service;

@Service
public class JobPostActivityService {

    public final JobPostActivityRepository jobPostActivityRepository;

    public JobPostActivityService(JobPostActivityRepository jobPostActivityRepository) {
        this.jobPostActivityRepository = jobPostActivityRepository;
    }

    public JobPostActivity addNew(JobPostActivity jobPostActivity){
        return jobPostActivityRepository.save(jobPostActivity);
    }
}
