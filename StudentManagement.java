import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class StudentManagement {
	
	Vector<Student> listStudents = new Vector<Student>();
	Scanner scanner = new Scanner(System.in);
	
	public StudentManagement() {
		System.out.print("Nhap so sinh vien: ");
		int elements = scanner.nextInt();
		for(int i = 0; i < elements; i++) {
			System.out.print("Thong tin sinh vien thu [" + (i + 1) + "]");
			nhap();
		}
		xuat();
	}
	
	public void nhap() {
		
		Student student = new Student();
		
		System.out.print("\nNhap ID: ");
		int id = Integer.parseInt(scanner.next());
		student.setId(id);
		scanner.nextLine();
		
		System.out.print("Nhap Ten: ");
		String name = scanner.nextLine();
		student.setName(name);
		
		System.out.print("Nhap Diem Trung Binh: ");
		float aver = scanner.nextFloat();
		student.setAver(aver);
		
		listStudents.add(student);
	}

	public void xuat() {
		Enumeration vectorEnum = listStudents.elements();
		int i = 0;
		while(vectorEnum.hasMoreElements()) {
			
			Student studentLocal = (Student)vectorEnum.nextElement();
			
			System.out.println("Day la student [" + i + "]: \n" + studentLocal.getId());
			System.out.println(studentLocal.getName());
			System.out.println(studentLocal.getAver());
			i++;
		}
	}
	public static void main(String[] args) {
		
		new StudentManagement();
	}

}
