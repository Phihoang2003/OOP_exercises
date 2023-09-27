package bai8;

public class SinhVien {
	private String maSV;
	private String hoTen;
	public SinhVien(String maSV,String hoTen) {
		this.maSV=maSV;
		this.hoTen=hoTen;
	}
	public String getHoTen() {
		return hoTen;
	}
	public String getMaSV() {
		return maSV;
	}
	public void setHoTen(String hoTen) {
		this.hoTen=hoTen;
	}
	public void setMaSV(String maSV) {
		this.maSV=maSV;
	}
	public String toString() {
		return String.format("%10s %10s", maSV,hoTen);
	}
}
