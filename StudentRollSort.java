package collegeAssignment1;

import java.util.Comparator;

public class StudentRollSort implements Comparator<StudentDiary>  {
	
	@Override
	public int compare(StudentDiary a, StudentDiary b) {
		
		return a.rollno -b.rollno;
	}
		
	
}
