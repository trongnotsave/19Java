package Lab10;

import java.time.LocalDate;
//Code mang tính chất tham khảo, thằng nào copy y nguyên, giữa kì auto < 5đ -> Đéo qua môn <3
public class QuanLy extends NhanVien{

	public int soLuongNhanVien;
	
	public QuanLy(String hoTen, LocalDate ngSinh, double heSoLuong, int soLuongNhanVien) {
		super(hoTen, ngSinh, heSoLuong);
		this.soLuongNhanVien = soLuongNhanVien;
	}

	public int getSoLuongNhanVien() {
		return soLuongNhanVien;
	}

	public void setSoLuongNhanVien(int soLuongNhanVien) {
		this.soLuongNhanVien = soLuongNhanVien;
	}
//Code mang tính chất tham khảo, thằng nào copy y nguyên, giữa kì auto < 5đ -> Đéo qua môn <3
	@Override
	public String toString() {
		return "QuanLy [soLuongNhanVien=" + soLuongNhanVien + ", hoTen=" + hoTen + ", ngSinh=" + ngaySinh + ", heSoLuong="
				+ heSoLuong + "]";
	}
	
}
