package bai10;

public class PhongThiNgiem extends PhongHoc {
	private String chuyenNganh;
	private double sucChua;
	private boolean coBonRua;
	public PhongThiNgiem(String maPhong, String dayNha, double dienTich, int soBongDen,String chuyenNganh,double sucChua,boolean coBonRua) {
		super(maPhong, dayNha, dienTich, soBongDen);
		// TODO Auto-generated constructor stub
		setChuyenNganh(chuyenNganh);
		setCoBonRua(coBonRua);
		setSucChua(sucChua);
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
		return String.format("%15s %15s %15.2f %15.2s", super.toString(),chuyenNganh,sucChua,coBonRua?"Co bon rua":"Khong co bon rua");
	}
	
}
