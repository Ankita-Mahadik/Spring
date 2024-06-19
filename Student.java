package com.studentXML;

public class Student {
	
	private int StudentRollNo;
	private String StudentName;
	private String StudentClass;
	private Double StudentMarks;
	
	public Student(int studentRollNo, String studentName, String studentClass, Double studentMarks) {
		super();
		StudentRollNo = studentRollNo;
		StudentName = studentName;
		StudentClass = studentClass;
		StudentMarks = studentMarks;
	}

	public Student() {
		super();
	}

	public int getStudentRollNo() {
		return StudentRollNo;
	}

	public void setStudentRollNo(int studentRollNo) {
		StudentRollNo = studentRollNo;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getStudentClass() {
		return StudentClass;
	}

	public void setStudentClass(String studentClass) {
		StudentClass = studentClass;
	}

	public Double getStudentmarks() {
		return StudentMarks;
	}

	public void setStudentmarks(Double studentmarks) {
		StudentMarks = getStudentmarks();
	}

	@Override
	public String toString() {
		return "Student [StudentRollNo=" + StudentRollNo + ", StudentName=" + StudentName + ", StudentClass="
				+ StudentClass + ", Studentmarks=" + StudentMarks + "]";
	}
	
	
	

}
