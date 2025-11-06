package com.soletsgo.JobAppRest.repository;

import com.soletsgo.JobAppRest.model.JobPost;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
//@NoArgsConstructor
public interface JobPostRepo extends JpaRepository<JobPost, Integer> {
    List<JobPost> findByPostProfileContainingIgnoreCaseOrPostDescContainingIgnoreCase(String postProfile, String postDesc);
//    private final List<JobPost> jobPosts = new ArrayList<>(
//            Arrays.asList(
//                    new JobPost(1, "Java Dev", "Must have a good experience with spring boot", 4, Arrays.asList("Java", "HTML", "CSS")),
//                    new JobPost(2, "React Dev", "Must have a good experience with React, Next js", 4, Arrays.asList("Javascript", "HTML", "CSS"))
//            )
//    );

//    public List<JobPost> getAllJobPosts(){
//        return this.jobPosts;
//    }
//
//    public void addJobPost(JobPost jobPost){
//        this.jobPosts.add(jobPost);
//    }
//
//    public JobPost getJobPostById(int postId) {
//        for(JobPost job : jobPosts){
//            if(job.getPostId() == postId){
//                return job;
//            }
//        }
//        return null;
//    }
//
//    public void updatePost(JobPost jobPost) {
//        for(JobPost job : jobPosts){
//            if(job.getPostId() == jobPost.getPostId()){
//                job.setPostDesc(jobPost.getPostDesc());
//                job.setPostProfile(jobPost.getPostProfile());
//                job.setPostTechStack(jobPost.getPostTechStack());
//                job.setReqExperience(jobPost.getReqExperience());
//            }
//        }
//    }
//
//    public boolean deleteJobPost(int jobPostId) {
//        for(JobPost job : jobPosts){
//            if(job.getPostId() == jobPostId){
//               jobPosts.remove(job);
//               return true;
//            }
//        }
//        return false;
//    }
}
