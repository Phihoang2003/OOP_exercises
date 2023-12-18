package bai8;

public class HangDienMay extends HangHoa {
 private int thoiGianBaoHanh;
 private double congSuat;
 public HangDienMay(String maHang, String tenHang, double donGia, int soLuongTon,int thoiGianBaoHanh,double congSuat) throws Exception {
  super(maHang, tenHang, donGia, soLuongTon);
  setThoiGianBaoHanh(thoiGianBaoHanh);
  setCongSuat(congSuat);
 }
 public int getThoiGianBaoHanh() {
  return thoiGianBaoHanh;
 }
 public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
  if(thoiGianBaoHanh>=0)
	  this.thoiGianBaoHanh = thoiGianBaoHanh;
  throw new Error("thoi gian bao hanh lon hon bang 0");
 }
 public double getCongSuat() {
  return congSuat;
 }
 public void setCongSuat(double congSuat) {
  if(congSuat >=0)
	  this.congSuat = congSuat;
  throw new Error("Cong suat lon hon bang 0");
 }
 @Override
 public String danhGiaMucDoBanBuon() {
  // TODO Auto-generated method stub
  if(getSoLuongTon()<3)
	  return "BanDuoc";
  return "Khong danh gia";
 }
 @Override
 public double tinhTienVAT() {
  // TODO Auto-generated method stub
  return 0.1*getDonGia();
 }
 public String toString() {
  return String.format("%15s %15s %15s", super.toString(),thoiGianBaoHanh,congSuat);
 }
 
}