package io.spring.sample.branch;

public class Branch {
	private String id;
	private String name;
	private String course;
	private String studentno;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Branch(String id, String name, String course, String studentno) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.studentno = studentno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Branch() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getStudentno() {
		return studentno;
	}
	public void setStudentno(String studentno) {
		this.studentno = studentno;
	}

}
