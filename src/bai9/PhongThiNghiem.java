package bai9;

public class PhongThiNghiem extends PhongHoc {
	private String chuyenNganh;
	private double sucChua;
	private boolean coBonRua;
	
	public PhongThiNghiem(String maPhong, String dayNha, double dienTich, int soBongDen, String chuyenNganh,
			double sucChua, boolean coBonRua) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.chuyenNganh = chuyenNganh;
		this.sucChua = sucChua;
		this.coBonRua = coBonRua;
	}
	public String getChuyenNganh() {
		return chuyenNganh;
	}
	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}
	public double getSucChua() {
		return sucChua;
	}
	public void setSucChua(double sucChua) {
		this.sucChua = sucChua;
	}
	public boolean isCoBonRua() {
		return coBonRua;
	}
	public void setCoBonRua(boolean coBonRua) {
		this.coBonRua = coBonRua;
	}
	@Override
	public boolean xetDatChuan() {
		// TODO Auto-generated method stub
		if(super.coDuAnhSang()&&coBonRua) {
			return true;
		}
		else {
			return false;
		}
	}
	public String toString() {
		return String.format("%-10s %-10s %-10.2f %-10s", super.toString(),chuyenNganh,sucChua,coBonRua?"Co bon rua":"Khong co bon rua");
	}
	
}
