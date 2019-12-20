package collegeAssignment1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("rick");
		list.add("pickel rick");
		list.add("cool rick");
		list.add("angry rick");
		
		Iterator itr =list.iterator();
		while(itr.hasNext()) {
			 
			
			System.out.println(itr.next());
			
		}
		
		
	}
	

	
	
	

}
