package bai7;

public class HinhTron {
	private ToaDo[] tam;
	private double banKinh;
	public HinhTron(ToaDo []tam,double bankinh) {
		this.tam=tam;
		this.banKinh=bankinh;
	}
	public ToaDo[] getTam() {
		return tam;
	}
	public void setTam(ToaDo[] tam) {
		
		this.tam=tam;
	}
	public double getBanKinh() {
		return banKinh;
	}
	public void setBanKinh(double bankinh) {
		this.banKinh=bankinh;
	}
	public double tinhChuVi() {
		return 3.14*banKinh*2;
	}
	public double tinhDienTich() {
		return 3.14*banKinh*banKinh;
	}
	public String toString() {
		String ds = "";
		for (ToaDo toaDo : tam) {
			ds+=toaDo+" ";
		}
		return String.format("Dien tich va chu vi hinh tron tam %s co ban kinh %f la %f va %f", ds, banKinh,tinhDienTich(),tinhChuVi());
	}
}
