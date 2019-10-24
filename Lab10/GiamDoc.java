package Lab10;

import java.time.LocalDate;
//Code mang tính chất tham khảo, thằng nào copy y nguyên, giữa kì auto < 5đ -> Đéo qua môn <3
public class GiamDoc extends NhanVien{
	
	public double heSoChucVu;

	public GiamDoc(String hoTen, LocalDate ngaySinh, double heSoLuong, double heSoChucVu) {
		super(hoTen, ngaySinh, heSoLuong);
		this.heSoChucVu = heSoChucVu;
	}

	public double getHeSoChucVu() {
		return heSoChucVu;
	}

	public void setHeSoChucVu(double heSoChucVu) {
		this.heSoChucVu = heSoChucVu;
	}

	@Override
	public String toString() {
		return "GiamDoc [heSoChucVu=" + heSoChucVu + ", hoTen=" + hoTen + ", ngSinh=" + ngaySinh + ", heSoLuong="
				+ heSoLuong + "]";
	}
	
}
