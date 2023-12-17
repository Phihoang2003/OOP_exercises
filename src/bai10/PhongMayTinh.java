package bai10;

public class PhongMayTinh extends PhongHoc {
	private int soMayTinh;
	public PhongMayTinh(String maPhong, String dayNha, double dienTich, int soBongDen,int soMayTinh) {
		super(maPhong, dayNha, dienTich, soBongDen);
		// TODO Auto-generated constructor stub
		setSoMayTinh(soMayTinh);
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
		if(super.coDuAnhSang()&&super.getDienTich()/soMayTinh<=1.5) {
			return true;
		}
		else {
			return false;
		}
	}
	public String toString() {
		return String.format("%15s %15d", super.toString(),soMayTinh);
	}
	
	
}
