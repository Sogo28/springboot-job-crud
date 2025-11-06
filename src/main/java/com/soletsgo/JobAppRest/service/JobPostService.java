package com.soletsgo.JobAppRest.service;

import com.soletsgo.JobAppRest.model.JobPost;
import com.soletsgo.JobAppRest.repository.JobPostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPostService {
    private final JobPostRepo jobPostRepo;

    @Autowired
    public JobPostService(JobPostRepo jobPostRepo) {
        this.jobPostRepo = jobPostRepo;
    }

    public List<JobPost> getAllJobPosts(){
        return jobPostRepo.findAll();
    }

    public void addJob(JobPost jobPost){
        jobPostRepo.save(jobPost);
    }

    public JobPost getJobPostById(int postId) {
        return jobPostRepo.findById(postId).orElse(null);
    }

    public void updateJob(JobPost jobPost) {
        jobPostRepo.save(jobPost);
    }

    public boolean deleteJobPost(int jobPostId) {
        jobPostRepo.deleteById(jobPostId);
        return true;
    }
}
