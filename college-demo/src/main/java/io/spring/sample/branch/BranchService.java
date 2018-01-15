package io.spring.sample.branch;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BranchService {
	public List<Branch>  branches=Arrays.asList(
			new Branch("ECE","Electronics and Communication", "The transmission of information across the channel","200"),
			new Branch("EEE","Electrical and Electronics", "High Voltage and High Currents","300"),
			new Branch("CSE","Computer Science", "Deal with the theory and design of algorithms","400")
		);

public List<Branch> getAllBranches(){
return branches;
}

public Branch getBranch(String id){
return branches.stream().filter(t -> t.getId().equals(id)).findFirst().get();
}


}
