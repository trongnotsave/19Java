public class Student implements Comparable{
	
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
	//nap phuong thuc compareTo() cua lop Comparable de su dung Arrays.sort() trong class StudentManagement
	@Override
	public int compareTo(Object o) {
		
		Student std = (Student) o;
		
		return (int) (std.getAver() - this.aver);
	}
	
}
