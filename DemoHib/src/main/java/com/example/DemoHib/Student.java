package com.example.DemoHib;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // if i want to give another table name which is not student then after entity (name=" ") is this case entity name is  changed
// want to change only table name but not entity name then @Table(name="")
public class Student {
	@Id
	private int rollno;
	//if i want to change the column name then @Column(name="")
	//if i dont want to show any column name in the table then @Transisent
	private StudentName  sname;
	public StudentName getSname() {
		return sname;
	}
	public void setSname(StudentName sname) {
		this.sname = sname;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + "]";
	}

}
