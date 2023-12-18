package bai8;


import java.time.LocalDate;

public class HangSanhSu extends HangHoa {
 private String nhaSanXuat;
 private LocalDate ngayNhapKho;
 public HangSanhSu(String maHang, String tenHang, double donGia, int soLuongTon,String nhaSanXuat,LocalDate ngayNhapKho) throws Exception {
  super(maHang, tenHang, donGia, soLuongTon);
  setNgayNhapKho(ngayNhapKho);
  this.nhaSanXuat=nhaSanXuat;
  // TODO Auto-generated constructor stub
 }
 public String getNhaSanXuat() {
  return nhaSanXuat;
 }
 public void setNhaSanXuat(String nhaSanXuat) {
  this.nhaSanXuat = nhaSanXuat;
 }
 public LocalDate getNgayNhapKho() {
  return ngayNhapKho;
 }
 public void setNgayNhapKho(LocalDate ngayNhapKho) {
  if(ngayNhapKho.isBefore(LocalDate.now()))
  {
	  this.ngayNhapKho = ngayNhapKho;
  }
  else {
	  throw new Error("Ngay nhap kho phai truoc ngay hien tai");
  }
 }
 @Override
 public String danhGiaMucDoBanBuon() {
  LocalDate ngayHienTai=LocalDate.now();
  if(getSoLuongTon()>50 && ngayNhapKho.isBefore(ngayHienTai.minusDays(10))) {
   return "Ban cham";
  }
  return "Khong danh gia";
 }
 @Override
 public double tinhTienVAT() {
  return 0.1*getDonGia();
  // TODO Auto-generated method stub
  
 }
 public String toString() {
  return String.format("%15s %15s %15s", super.toString(),nhaSanXuat,ngayNhapKho);
 }
 
 
 
}