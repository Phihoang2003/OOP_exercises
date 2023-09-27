package bai2;

import java.time.LocalDate;

public class SachGiaoKhoa extends Sach {
	private String tinhTrang;
	public SachGiaoKhoa(String maSach,LocalDate ngayNhap,double donGia,int soLuong,String nhaXuatBan,String tinhTrang) {
		super(maSach,ngayNhap,donGia,soLuong,nhaXuatBan);
		this.tinhTrang=tinhTrang;
	}
	public double thanhTien() {
		if(tinhTrang=="moi") {
			return super.thanhTien();
			
		}
		else {
			return super.thanhTien()*0.5;
		}
	}
	@Override
	public String toString() {
		return String.format("%-60s%-5s", super.toString(), tinhTrang);
	}
}
