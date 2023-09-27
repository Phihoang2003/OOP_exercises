package bai8;

public abstract class HangHoa {
	private String maHang;
	private String tenHang;
	private double donGia;
	private int soLuongTon;
	
	public HangHoa(String maHang,String tenHang,double donGia,int soLuongTon) throws Exception {
		setMaHang(maHang);
		setDonGia(donGia);
		setSoLuongTon(soLuongTon);
		this.tenHang=tenHang;
	}
	
	public String getMaHang() {
		return maHang;
	}
	public void setMaHang(String maHang) throws Exception {
		if(maHang.equals("")) 
			throw new Exception("Ma hang khong duoc de trong");
		this.maHang=maHang;
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) throws Exception {
		if(donGia<0) 
			throw new Exception("Ma hang phai lon hon 0");
		this.donGia = donGia;
	}
	public int getSoLuongTon() {
		return soLuongTon;
	}
	public void setSoLuongTon(int soLuongTon) throws Exception {
		if(soLuongTon<0)
			throw new Exception("So luong ton phai lon hon 0");
		this.soLuongTon = soLuongTon;
	}
	public abstract String danhGiaMucDoBanBuon();
	public abstract double tinhTienVAT();
	
	public String toString() {
		return String.format("%10s %10s %10.2f %10d", maHang,tenHang,donGia,soLuongTon);
	}
}	
