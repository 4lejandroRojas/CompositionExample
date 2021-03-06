package compositionClasses;

//A college belongs to university
public class College {
	private String name;
	private String description;
	
	public College(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "College [name=" + name + ", description=" + description + "]";
	}
}
