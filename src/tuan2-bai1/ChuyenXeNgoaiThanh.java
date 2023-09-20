package bai1;

public class ChuyenXeNgoaiThanh extends ChuyenXe {
	private String noiDen; 
	private int soNgayDiDuoc;
	public ChuyenXeNgoaiThanh(String maSoChuyen, String hoTenTaiXe, int soXe, double doanhThu,String noiDen,int soNgayDiDuoc ) {
		super(maSoChuyen,hoTenTaiXe,soXe,doanhThu);
		this.noiDen=noiDen;
		this.soNgayDiDuoc=soNgayDiDuoc;
	}
	public String toString() {
		return String.format("%s% %10d %10d", super.toString(),noiDen,soNgayDiDuoc);
	}
}
