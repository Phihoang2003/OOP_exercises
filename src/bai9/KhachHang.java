package bai9;

import java.time.LocalDate;

public class KhachHang {
	private String maKH;
	private String hoTenKH;
	private SoTietKiem [] dsSoTietKiem;
	private int soLuongSoHienCo;
	
	
	public KhachHang(String maKH,String hoTenKH,int n) {
		this.maKH=maKH;
		setHoTenKH(hoTenKH);
		this.soLuongSoHienCo=0;
		this.dsSoTietKiem=new SoTietKiem[n];
	}
	public String getMaKH() {
		return maKH;
	}
	public String getHoTenKH() {
		return hoTenKH;
	}
	public SoTietKiem[] getDsSoTietKiem() {
		return dsSoTietKiem;
	}
	public int getSoLuongSoHienCo() {
		return soLuongSoHienCo;
	}
	public void setHoTenKH(String hoTenKH) {
		this.hoTenKH=hoTenKH;
	}
	public boolean themSoTietKiem(String maSo,LocalDate ngayMoSo,double soTienGoi,int kyHan,float laiSuat ) {
		if(soLuongSoHienCo<dsSoTietKiem.length) {
			this.dsSoTietKiem[soLuongSoHienCo++]=new SoTietKiem(maSo, ngayMoSo, soTienGoi, kyHan, laiSuat);
			return true;
		}
		return false;
	}
	public String toString() {
		String s="";
		for(int i=0;i<soLuongSoHienCo;i++) {
			s+=dsSoTietKiem[i];
		}
		return String.format("%s - %s%s", maKH,hoTenKH,s);
	}
	
}
