package collegeAssignment1;
import java.util.*;
public class vowel {
	
	
	
	public static void main(String[] args) {
		
		String str= "welcome 2 the world of ru2tj";
		int vowels =0;
		int con =0;
		int digits =0;
		int spaces =0;
		str =str.toLowerCase();
		
		for(int i=0;i<str.length();i++) {
			
		         char ch=str.charAt(i);
		         
		if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ) {
			
			vowels++;
		}else if(ch>= 'a'  && ch<= 'z') {
			con++;
		}else if(ch>= '0'  && ch <= '9') {
			digits++;
			
		}else if(ch == ' ') {
			spaces++;
		}
			
		}
		
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + con);
        System.out.println("Digits: " + digits);
        System.out.println("White spaces: " + spaces);
		
	}

}
