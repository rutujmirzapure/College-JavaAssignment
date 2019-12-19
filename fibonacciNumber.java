package collegeAssignment1;

public class fibonacciNumber {
	
	
	public static void main(String[] args) {
		
		int n=100;
		
		int f1=0;
		int f2=1;
		int sum=0;
		for(int i =1 ;i<=n;++i) {
		
			System.out.print(+sum+ " + ");
			
			
			 sum =f1 + f2;
			 f1 = f2;
			 f2 = sum;
			 
			
			 
		}
		
	}
	
	

}
