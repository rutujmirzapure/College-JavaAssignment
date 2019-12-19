package collegeAssignment1;

import java.util.Arrays;
import java.util.Collections;



public class sortInAscending {
	
	public static void main(String[] args) {
		

		Integer arr1[] = {1,3,5,2,7,6,8,4};
		
		Arrays.sort(arr1);
		System.out.println("the ascending order"+Arrays.toString(arr1));
		
		Arrays.sort(arr1 ,Collections.reverseOrder());
		System.out.println("the decending order"+Arrays.toString(arr1));
		
		
	}
	
	
	

}
