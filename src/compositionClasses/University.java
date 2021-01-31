package compositionClasses;

import java.util.List;

//An University has colleges
public class University {
	private List<College> colleges;

	public University(List<College> colleges) {
		super();
		this.colleges = colleges;
	}

	public List<College> getColleges() {
		return colleges;
	}

	public void setColleges(List<College> colleges) {
		this.colleges = colleges;
	}
	
	public int getNumberTotalColleges() {
		return colleges.size();
	}
	
	@Override
	public String toString() {
		return "University [colleges=" + colleges + "]";
	}
}
