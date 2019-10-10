public class Student {
	
	private int id;
	
	private String name;
	
	private float aver;
	
	public Student() {	
	}
	
	public Student(int id, String name, float aver) {
		this.id = id;
		this.name = name;
		this.aver = aver;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public float getAver() {
		return aver;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAver(float aver) {
		this.aver = aver;
	}
	
}
