package mid;

public class GiamDoc extends Person{

	int hesochucvu;
	String ten;
	
	public GiamDoc(String ten, int luong, int hesochucvu) {
		super(luong);
		// TODO Auto-generated constructor stub
		this.hesochucvu = hesochucvu;
		this.ten = ten;
	}

	@Override
	public void In() {
		System.out.println("Ten tao ne: " + this.ten);
		System.out.println("Luong Giam doc ne: " + (hesochucvu * super.luong) );
	}
	@Override
	public int luong() {
		return (hesochucvu * super.luong);
	}

}
