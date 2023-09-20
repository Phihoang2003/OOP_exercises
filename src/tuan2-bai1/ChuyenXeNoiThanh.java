package bai1;

public class ChuyenXeNoiThanh extends ChuyenXe {
	private int soTuyen;
	private int soKmDiDuoc;
	
	public ChuyenXeNoiThanh(String maSoChuyen,String hoTenTaiXe, int soXe,double doanhThu,int soTuyen,int soKmDiDuoc) {
		super(maSoChuyen,hoTenTaiXe,soXe,doanhThu);
		this.soTuyen=soTuyen;
		this.soKmDiDuoc=soKmDiDuoc;
	}
	public String toString() {
		return String.format("%s% %10d %10d", super.toString(),soTuyen,soKmDiDuoc);
	}
}
