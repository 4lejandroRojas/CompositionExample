package compositionClasses;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String args[]) {
		List<College> colleges = new ArrayList<>();
		College c1 = new College("College 1", "This is the first college");
		colleges.add(c1);
		College c2 = new College("College 2", "This is the second college");
		colleges.add(c2);
		College c3 = new College("College 3", "This is the third college");
		colleges.add(c3);
		
		University university = new University(colleges);
		
		for(College college: university.getColleges()) {
			System.out.printf("college: %s with description: %s \n", college.getName(), college.getDescription());
		}
	}
	/**
	 * Output:
	 * college: College 1 with description: This is the first college 
	 * college: College 2 with description: This is the second college 
	 * college: College 3 with description: This is the third college 
	 */
}

