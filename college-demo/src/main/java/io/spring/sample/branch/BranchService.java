package io.spring.sample.branch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BranchService {
	//in order to edit the list here we added ArrayList<> otherwise this array.aslist will acts like immutable where we cant add any list extra from postman.
	public List<Branch>  branches= new ArrayList<>(Arrays.asList(
			new Branch("ECE","Electronics and Communication", "The transmission of information across the channel","200"),
			new Branch("EEE","Electrical and Electronics", "High Voltage and High Currents","300"),
			new Branch("CSE","Computer Science", "Deal with the theory and design of algorithms","400")
		));

public List<Branch> getAllBranches(){
return branches;
}

public Branch getBranch(String id){
return branches.stream().filter(b -> b.getId().equals(id)).findFirst().get();
}

public void addBranch(Branch branch) {
	branches.add(branch);
	
}

public void updateBranch(Branch branch, String id) {
	// TODO Auto-generated method stub
	for(int i=0; i<branches.size();i++) {
	Branch b= branches.get(i)	;
	if(b.getId().equals(id)) {
		branches.set(i,branch);
		return;
	}
	}
}

public  void deleteBranch(String id) {
 branches.removeIf(b->b.getId().equals(id));
	
}


}
