package mid;

public class QuanDoc extends Person{
	public QuanDoc(int luong) {
		super(luong);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void In() {
		System.out.println("Luong Quan doc ne: " + super.luong);
	}
}
