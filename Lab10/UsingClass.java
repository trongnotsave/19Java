package Lab10;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class UsingClass {

	public static void main(String[] args) {
		//Scanner k = new Scanner(System.in);
//		int year = k.nextInt();
//		int month = k.nextInt();
//		int day = k.nextInt();
//		LocalDate localDate = LocalDate.of(year, month, day);
//		NhanVien nv1 = new NhanVien("Nguyen Van A", LocalDate.of(1999, 9, 24), 1.2, "Phong 1");
		//System.out.println(localDate);
		
		//Code mang tính chất tham khảo, thằng nào copy y nguyên, giữa kì auto < 5đ -> Đéo qua môn <3
		
		Vector list = new Vector();
		list.add(new NhanVien("A", LocalDate.of(1999, 9, 24), 1.0, "Ke Toan"));
		list.add(new GiamDoc("A", LocalDate.of(1999, 9, 24), 1.0, 2.0));
		list.add(new QuanLy("A", LocalDate.of(1999, 9, 24), 1.0, 10));
		list.add(new NhanVien("A", LocalDate.of(1999, 9, 24), 1.0, "Ke Toan"));
		list.forEach(e ->{
			System.out.println(e.toString());
		});
		//Code mang tính chất tham khảo, thằng nào copy y nguyên, giữa kì auto < 5đ -> Đéo qua môn <3
	}

}
