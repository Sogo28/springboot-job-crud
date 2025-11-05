package com.soletsgo.JobAppRest.controller;
import com.soletsgo.JobAppRest.model.JobPost;
import com.soletsgo.JobAppRest.service.JobPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobPostController {

    private final JobPostService jobPostService;

    @Autowired
    public JobPostController(JobPostService jobPostService){
        this.jobPostService = jobPostService;
    }

    @GetMapping("jobPosts")
    public List<JobPost> getAllJobPosts(){
        return jobPostService.getAllJobPosts();
    }

    @GetMapping("jobPosts/{postId}")
    public JobPost getJobPost(@PathVariable("postId")  int postId){
        return jobPostService.getJobPostById(postId);
    }

    @PostMapping("jobPosts")
    public JobPost addJobPost(@RequestBody JobPost jobPost){
        jobPostService.addJob(jobPost);
        return jobPostService.getJobPostById(jobPost.getPostId());
    }

    @PutMapping("jobPosts/{postId}")
    public JobPost updateJobPost(@RequestBody JobPost jobPost){
        jobPostService.updateJob(jobPost);
        return jobPostService.getJobPostById(jobPost.getPostId());
    }

    @DeleteMapping("jobPosts/{postId}")
    public String deleteJobPost(@PathVariable("postId") int jobPostId){
        boolean isDeleted = jobPostService.deleteJobPost(jobPostId);
        return isDeleted ? "Deleted" : "Not Deleted";
    }


}
