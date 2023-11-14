package bai9;

public class PhongLyThuyet extends PhongHoc {
	private boolean coMayChieu;
	public PhongLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen,boolean coMaychieu) {
		super(maPhong, dayNha, dienTich, soBongDen);
		// TODO Auto-generated constructor stub
		this.coMayChieu=coMaychieu;
	}
	public boolean isCoMayChieu() {
		return coMayChieu;
	}
	public void setCoMayChieu(boolean coMayChieu) {
		this.coMayChieu = coMayChieu;
	}
	@Override
	public boolean xetDatChuan() {
		// TODO Auto-generated method stub
		if(super.coDuAnhSang()&&coMayChieu) {
			return true;
		}
		return false;
	}
	public String toString() {
		return String.format("%-10s %-10s", super.toString(),coMayChieu?"Co may chieu":"Khong co may chieu");
	}
	
	

	
	
}
