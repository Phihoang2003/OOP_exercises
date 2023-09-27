package bai6;

import java.time.LocalDate;

public class HoaDonTheoNgay extends HoaDon {
	private float soNgayThue;
	private double thanhTien;

	public HoaDonTheoNgay(String maHoaDon, LocalDate ngayHoaDon, String tenKhachHang, String maPhong, double donGia,float soNgayThue) {
		super(maHoaDon, ngayHoaDon, tenKhachHang, maPhong, donGia);
		
	}

	public float getSoNgayThue() {
		return soNgayThue;
	}

	public void setSoNgayThue(float soNgayThue) {
		if(soNgayThue>7) {
			double donGia=super.getDonGia()*0.8;
			super.setDonGia(donGia);
		}
	}

	public double getThanhTien() {
		thanhTien=soNgayThue*super.getDonGia();
		return thanhTien;
	}

	
	
	
	
	
	
	
}
