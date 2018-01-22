package com.example.DemoHib;

import javax.persistence.Embeddable;

@Embeddable // this StudentName table will be embeddable in student table.
public class StudentName {
	private String fname;
	private String lname;
	@Override
	public String toString() {
		return "StudentName [fname=" + fname + ", lname=" + lname + ", mname=" + mname + ", getFname()=" + getFname()
				+ ", getLname()=" + getLname() + ", getMname()=" + getMname() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	private String mname;
	

}
