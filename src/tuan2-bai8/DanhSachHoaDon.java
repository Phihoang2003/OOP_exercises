package bai6;

import java.time.LocalDate;

public class DanhSachHoaDon {
	private HoaDon[] danhSach;
	private int count;
	public DanhSachHoaDon(int n) {
		danhSach=new HoaDon[n];
		count=0;
	}
	public boolean searchHoaDon(String maHoaDon) {
		for (int i = 0; i < count; i++) {
			if (danhSach[i].getMaHoaDon() == maHoaDon)
				return true;
		}
		return false;
	}
	public boolean addHoaDon(String maHoaDon, LocalDate ngayHoaDon, String tenKhachHang, String maPhong,double donGia) throws Exception {
		if(count<danhSach.length) {
			if(searchHoaDon(maHoaDon)) 
				return false;
			danhSach[count++]=new HoaDon(maHoaDon,ngayHoaDon,tenKhachHang,maPhong,donGia);
			return true;
		}
		throw new Exception("Loi mang day");
	}
	
	
}
