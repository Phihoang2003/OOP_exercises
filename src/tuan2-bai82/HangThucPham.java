package bai8;

import java.time.LocalDate;

public class HangThucPham extends HangHoa {
	 private String nhaCungCap;
	 private LocalDate ngaySx;
	 private LocalDate ngayHetHan;
	 public HangThucPham(String maHang, String tenHang, double donGia, int soLuongTon,String nhaCungCap,LocalDate ngaySx,LocalDate ngayHetHan) throws Exception {
	  super(maHang, tenHang, donGia, soLuongTon);
	  setNgaySx(ngaySx);
	  this.nhaCungCap=nhaCungCap;
	  setNgayHetHan(ngayHetHan);
	 }
	 public String getNhaCungCap() {
	  return nhaCungCap;
	 }
	 public void setNhaCungCap(String nhaCungCap) {
	  this.nhaCungCap = nhaCungCap;
	 }
	 public LocalDate getNgaySx() {
	  return ngaySx;
	 }
	 public void setNgaySx(LocalDate ngaySx) throws Exception {
	  if(ngaySx.isBefore(LocalDate.now()))
	  {
		  this.ngaySx = ngaySx;
	  }
	  else {
		  throw new Exception("Ngay san xuat phai truoc ngay hien tai");
	  }
	 }
	 public LocalDate getNgayHetHan() {
	  return ngayHetHan;
	 }
	 public void setNgayHetHan(LocalDate ngayHetHan) throws Exception {
	  if(ngayHetHan.isAfter(ngaySx))
	  {
		  this.ngayHetHan = ngayHetHan;
	  }
	  else{
		  throw new Exception("Ngay het han phai sau ngay san xuat");
	  }
	 }
	 @Override
	 public String danhGiaMucDoBanBuon() {
	  if(getSoLuongTon()>0&&ngayHetHan.isBefore(LocalDate.now())){
	   return "Kho Ban";
	  }
	  return "Khong danh gia";
	  
	 }
	 @Override
	 public double tinhTienVAT() {
	  
	  return 0.05*getDonGia();
	 }
	 public String toString() {
	  return String.format("%15s %15s %15s", super.toString(),nhaCungCap,ngaySx,ngayHetHan);
	 }
	 
	}
