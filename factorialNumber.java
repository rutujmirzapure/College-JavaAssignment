package collegeAssignment1;

public class factorialNumber {
	
	public static void main(String[] args) {
		int n = 3;
		int factorial = 1;
		for(int i=1; i<=n;++i) {
			
			factorial = factorial * i;
			
			//factorial *= i
		}
		
		System.out.println("factorial of "+ n +"= " +factorial);
		
	}

}
