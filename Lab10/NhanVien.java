package Lab10;

import java.time.LocalDate;
//Code mang tính chất tham khảo, thằng nào copy y nguyên, giữa kì auto < 5đ -> Đéo qua môn <3
public class NhanVien {
	public String hoTen;
	public LocalDate ngaySinh;
	public double heSoLuong;
	public String phongBan;
	
	public NhanVien() {
		
	}
	
	public NhanVien(String hoTen, LocalDate ngSinh, double heSoLuong, String phongBan) {
		this.hoTen = hoTen;
		this.ngaySinh = ngSinh;
		this.heSoLuong = heSoLuong;
		this.phongBan = phongBan;
	}
	public NhanVien(String hoTen, LocalDate ngSinh, double heSoLuong) {
		this.hoTen = hoTen;
		this.ngaySinh = ngSinh;
		this.heSoLuong = heSoLuong;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getPhongBan() {
		return phongBan;
	}
	public void setPhongBan(String phongBan) {
		this.phongBan = phongBan;
	}
	public LocalDate getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(LocalDate ngSinh) {
		this.ngaySinh = ngSinh;
	}
	public double getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	//Code mang tính chất tham khảo, thằng nào copy y nguyên, giữa kì auto < 5đ -> Đéo qua môn <3
	@Override
	public String toString() {
		return "NhanVien [hoTen=" + hoTen + ", ngSinh=" + ngaySinh + ", heSoLuong=" + heSoLuong + "]";
	}
}
