package collegeAssignment1;

import java.util.Arrays;
import java.util.Comparator;

public class StudentDiary {
	

	int rollno;
	String name;
	String address;
	
	
	public StudentDiary(int rollno, String name, String address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
   
	public String toString() {
		return this.name +" , "+this.rollno+" , "+this.address;
		
	}
	
	




}
