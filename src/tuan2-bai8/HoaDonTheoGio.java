package bai6;

import java.time.LocalDate;

public class HoaDonTheoGio extends HoaDon {
	private float soGioThue;
	private double thanhTien;

	public float getSoGioThue() {
		return soGioThue;
	}

	public void setSoGioThue(float soGioThue) {
		if(soGioThue>24&&soGioThue<30) {
			this.soGioThue=24;
		}
	}

	public HoaDonTheoGio(String maHoaDon, LocalDate ngayHoaDon, String tenKhachHang, String maPhong, double donGia,float soGioThue) {
		super(maHoaDon, ngayHoaDon, tenKhachHang, maPhong, donGia);
		setSoGioThue(soGioThue);
	}
	public double getThanhTien() {
		thanhTien=soGioThue*super.getDonGia();
		return thanhTien;
	}
	public String toString() {
		return String.format("%s-%10.2f-%10.2f", super.toString(),soGioThue,thanhTien);
	}
	
	
	
}
