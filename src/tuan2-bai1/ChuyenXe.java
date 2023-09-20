package bai1;

public class ChuyenXe {
	private String maSoChuyen;
	private String hoTenTaiXe;
	private int soXe;
	private double doanhThu;
	public ChuyenXe() {
		this.maSoChuyen="chuaco";
		this.doanhThu=0;
	}
	
	public ChuyenXe(String maSoChuyen,String hoTenTaiXe,int soXe,double doanhThu) {
		this.maSoChuyen=maSoChuyen;
		this.hoTenTaiXe=hoTenTaiXe;
		this.soXe=soXe;
		this.doanhThu=doanhThu;
		
	}
	public double getDoanhThu() {
		return doanhThu;
	}
	public String toString() {
		return String.format("%10s %10s %10d %10.2f", maSoChuyen,hoTenTaiXe,soXe,doanhThu);
	}
}
