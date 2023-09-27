package bai2;

import java.time.LocalDate;

public class SachThamKhao extends Sach {
	private double thue;
	public SachThamKhao(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan,double thue) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
		this.thue=thue;
	}
	public double thanhTien() {
		return super.thanhTien()+thue;
	}

	@Override
	public String toString() {
		return String.format("%-60s%-10.2f", super.toString(), thue);
	}
	
}
