package io.spring.sample.branch;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BranchController {

	@Autowired
	private BranchService branchService;
	
	@RequestMapping("/branches")
	public List<Branch>  getAllBranches(){
		return branchService.getAllBranches();
	}
	
	@RequestMapping("/branches/{id}")
	public Branch getBranch(@PathVariable String id){
		return branchService.getBranch(id);
	}
	//with the help of this method we are able to add extra  branches externally with the help of postman
	@RequestMapping(method=RequestMethod.POST , value="/branches")// here we are not using get method so fetch the values we write method in annotation
	public void addBranch(@RequestBody Branch branch) {
		branchService.addBranch(branch);
	}
		//updated the already existing one
		@RequestMapping(method=RequestMethod.PUT , value="/branches/{id}")
		public void updateBranch(@RequestBody Branch branch,@PathVariable String id) {
			branchService.updateBranch(branch,id);
	}
		@RequestMapping(method=RequestMethod.DELETE , value="/branches/{id}")
		public void  deleteBranch(@PathVariable String id){
			 branchService.deleteBranch(id);	
}}
