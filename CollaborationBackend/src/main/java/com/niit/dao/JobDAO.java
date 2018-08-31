package com.niit.dao;

import java.util.List;

import com.niit.model.AppliedJobs;
import com.niit.model.Job;

public interface JobDAO {
	

	public List<Job>list();

	public Job saveOrUpdate(Job job);
	
	public void delete (int jobId);
	
	public Job getByJobid(int jobId);
	
	public List<Job>getMyAppliedJobs(String email);
	
	 public Job getJobDetails(int jobId);
	 
	 public AppliedJobs getJobApplication(String userID, int jobID);
		


}
