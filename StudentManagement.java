import java.util.Arrays;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class StudentManagement {
	
	Vector<Student> listStudents = new Vector<Student>();
	Scanner scanner = new Scanner(System.in);
	
	public StudentManagement() {
		
		listStudents.add(new Student(1, "Nam bede", 2));
		listStudents.add(new Student(2, "Tu bede", 5));
		listStudents.add(new Student(3, "Tran dan", 4));
		listStudents.add(new Student(4, "tran tiger", 7));
		listStudents.add(new Student(5, "Ricardo milos", 9));
		
		listStudents.forEach(std -> {
			System.out.print("ID:" + std.getId() + " \n");
			System.out.print("Name:" + std.getName() + " \n");
			System.out.print("Diem TB:" + std.getAver() + " \n");
			System.out.println("-----------------");
		});
		
//		System.out.print("Nhap so sinh vien: ");
//		int elements = scanner.nextInt();
//		for(int i = 0; i < elements; i++) {
//			System.out.print("Thong tin sinh vien thu [" + (i + 1) + "]");
//			nhap();
//		}
//		xuat();
	}
	
	public void search() {
		Scanner k = new Scanner(System.in);
		System.out.print("Nhap ten can tim: ");
		String inputName = k.nextLine();
		
		Enumeration enumStudent = listStudents.elements();
		//kiem tra xem co ten can tim hay khong
		int count = 0;
		while(enumStudent.hasMoreElements()) {
			Student childStudent = (Student)enumStudent.nextElement();
			//chuye chu in hoa thanh in thuong
			String studentName = childStudent.getName().toLowerCase();
			//kiem tra ten nhap vao co nam trong ten cua tung phan tu hay khong
			if(studentName.indexOf(inputName.toLowerCase()) != -1) {
				System.out.print("ID:" + childStudent.getId() + " \n");
				System.out.print("Name:" + childStudent.getName() + " \n");
				System.out.print("Diem TB:" + childStudent.getAver() + " \n");
				System.out.println("-----------------");
				count ++;
			}
		}
		if(count == 0) {
			System.out.println("Deo tim thay ten");
		}

	}
	
	public void sort() {
		
		Enumeration enumStudent = listStudents.elements();
		//khoi tao mang arrayStudent()
		Student[] arrayStudent = new Student[listStudents.size()];

		int i = 0;
		
		while(enumStudent.hasMoreElements()) {
			//Copy phan tu Student cua Vector listStudent vao mang arrayStudent
			arrayStudent[i] = (Student)enumStudent.nextElement();
			i++;
		}
		//tro toi ham compareTo() tai class Student
		Arrays.sort(arrayStudent);
		
		for(int j = 0; j < arrayStudent.length;j++) {
			System.out.println("AFTER SORT");
			System.out.print("ID:" + arrayStudent[j].getId() + " \n");
			System.out.print("Name:" + arrayStudent[j].getName() + " \n");
			System.out.print("Diem TB:" + arrayStudent[j].getAver() + " \n");
			System.out.println("-----------------");
		}
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
