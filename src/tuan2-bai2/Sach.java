package bai2;

import java.time.LocalDate;



public class Sach {
	private String maSach;
	private LocalDate ngayNhap;
	private double donGia;
	private int soLuong;
	private String nhaXuatBan;
	
	public Sach() {
		this.maSach="";
		this.ngayNhap=LocalDate.now();
		this.donGia=0;
		this.soLuong=0;
		this.nhaXuatBan="";
	}
	public Sach(String maSach,LocalDate ngayNhap,double donGia,int soLuong,String nhaXuatBan) {
		this.maSach=maSach;
		this.ngayNhap=ngayNhap;
		this.donGia=donGia;
		this.soLuong=soLuong;
		this.nhaXuatBan=nhaXuatBan;
	}
	public double getDonGia() {
		return donGia;
	}
	public String getNhaXuatBan() {
		
		return nhaXuatBan;
	}
	public double thanhTien() {
		return soLuong*donGia;
	}
	public String toString() {
		
		return String.format("%-5s%-15s%-10.2f%-10d%-10s", maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
	}
}
