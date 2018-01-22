package io.spring.sample.branch;

import org.springframework.data.repository.CrudRepository;

//actually spring data jpa is going to provide the class so we no need to provide any class and curd repository is already present spring jpa so we just extends it 
// curd repository is generic type(branch ,id).
public interface BranchRepository extends CrudRepository<Branch,String> {

}
