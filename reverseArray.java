package collegeAssignment1;


public class reverseArray {
	
	public static void main(String[] args) {
		
		int arr[] = {3,4,2,6,9,7,8};
		
		int size= arr.length;
		
		printArray(arr ,size);
		
		reverse(arr ,0 , size-1);
		printArray(arr ,size-1);
	
}
	public static void reverse(int arr[] ,int start ,int end) {
		
		int temp;
		
		if(start<end) {
			temp=arr[start];
			arr[start] = arr[end];
			arr[end]= temp;
			
			
			start++;
			end--;
			
			System.out.println("reverse is done . now u can print array");
			
		}		
		}
	
	 public static void printArray(int arr[] ,int size) {
		 System.out.print("elements in array =" );
		 for(int i=0;i<=size;i++) {
			 
			 System.out.print(arr[i]);
			 System.out.print(" ");
			 
		 }
		 
	 }
		
	}
