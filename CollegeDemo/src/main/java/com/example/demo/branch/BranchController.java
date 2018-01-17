package com.example.demo.branch;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController 
public class BranchController {

	@Autowired
	private BranchService branchservice;
	
	@RequestMapping("/branches")
	public List<Branch>  getAllBranches(){
		return branchservice.getAllBranches();
	}
	
	@RequestMapping("/brances/{id}")
	public Branch getBranch(@PathVariable String id){
		return branchservice.getBranch(id);
	}
	
}


