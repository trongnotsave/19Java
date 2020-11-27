package mid;

import java.util.ArrayList;
import java.util.List;

public class Runn {

	public static void main(String[] args) {
		QuanDoc qd = new QuanDoc(10000);
		GiamDoc gd = new GiamDoc("ABC", 20000, 2);
		GiamDoc gd2 = new GiamDoc("DEF", 10000, 3);
		GiamDoc gd3 = new GiamDoc("IJK", 50000, 2);
		// TODO Auto-generated method stub
		List<Person> persons = new ArrayList<Person>();
		persons.add(qd);
		persons.add(gd);
		persons.add(gd2);
		persons.add(gd3);
		
		int maxLuong = 0;
		for (Person p: persons) {
			if (p.luong() > maxLuong) {
				maxLuong = p.luong();	
			}
		}
		
		for(Person p: persons) {
			if (p.luong() == maxLuong) {
				p.In();
			}
		}
		
		//System.out.println(persons.get(6));
	}

}
