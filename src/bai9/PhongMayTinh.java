package bai9;

public class PhongMayTinh extends PhongHoc {
	private int soMayTinh;
	public PhongMayTinh(String maPhong, String dayNha, double dienTich, int soBongDen,int soMayTinh) {
		super(maPhong, dayNha, dienTich, soBongDen);
		// TODO Auto-generated constructor stub
		this.soMayTinh=soMayTinh;
	}
	
	public int getSoMayTinh() {
		return soMayTinh;
	}

	public void setSoMayTinh(int soMayTinh) {
		this.soMayTinh = soMayTinh;
	}

	@Override
	public boolean xetDatChuan() {
		// TODO Auto-generated method stub
		if(super.coDuAnhSang()&&getDienTich()/soMayTinh<=1.5) {
			return true;
		}
		return false;
	}
	public String toString() {
		return String.format("%-10s %-10d", super.toString(),soMayTinh);
	}
	

	
}
