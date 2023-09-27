package bai6;

import java.time.LocalDate;

public class HoaDon {
	private String maHoaDon;
	private LocalDate ngayHoaDon;
	private String tenKhachHang;
	private String maPhong;
	private double donGia;
	public HoaDon(String maHoaDon, LocalDate ngayHoaDon, String tenKhachHang, String maPhong, double donGia) {
		super();
		this.maHoaDon = maHoaDon;
		this.ngayHoaDon = ngayHoaDon;
		this.tenKhachHang = tenKhachHang;
		this.maPhong = maPhong;
		this.donGia = donGia;
	}
	
	public String getMaHoaDon() {
		return maHoaDon;
	}
	public void setMaHoaDon(String maHoaDon) {
		this.maHoaDon = maHoaDon;
	}
	public LocalDate getNgayHoaDon() {
		return ngayHoaDon;
	}
	public void setNgayHoaDon(LocalDate ngayHoaDon) {
		this.ngayHoaDon = ngayHoaDon;
	}
	public String getTenKhachHang() {
		return tenKhachHang;
	}
	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public String toString() {
		return String.format("%10s-%10s-%10s-%10s-%10.2f", maHoaDon,ngayHoaDon,tenKhachHang,maPhong,donGia);
	}
}
