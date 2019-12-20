package collegeAssignment1;

import java.util.Arrays;

public class StudentDiaryMain {
	

	public static void main(String[] args) {
		
		
		StudentDiary[] arr = {
				
				              new  StudentDiary(7777,"rutuj","pune"),
				              new  StudentDiary(1111,"kuldeep","221b"),
				              new  StudentDiary(8888,"ankush","andheri")
				
		};
		
	//	StudentDiary s1 = new StudentDiary(0, null, null);
//		
//		for(int i=0;i<=arr.length;i++) {
//			System.out.println(arr[i]);
//			
//		}
		
		Arrays.sort(arr, new StudentRollSort());
		
		for(int i=0;i<=arr.length;i++) {
			System.out.println(arr[i]+" the sorted array by rollno");
			
		}
		
		
}

}