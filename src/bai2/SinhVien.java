package bai2;

public class SinhVien {
	private String name;
	private int mssv;
	private float diemTH,diemLT;
	public int getMSSV() {
		return mssv;
	}
	public void setMSSV(int mssv) {
		this.mssv=mssv;
	}
	public String name() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setDiemTH(float diemTH) {
		this.diemTH=diemTH;
	}
	public void setDiemLT(float diemLT) {
		this.diemLT=diemLT;
	}
	public SinhVien() {
		this(0,"no-name",0.0f,0.0f);
	}
	public SinhVien(int mssv,String name,float diemLT,float diemTH) {
		this.mssv=mssv;
		this.name=name;
		this.diemLT=diemLT;
		this.diemTH=diemTH;
	}
	public float getDiemtb() {
		return (diemTH+diemTH)/2;
	}
	public String toString() {
		return String.format("%-5s %-30s %10.2f %10.2f %10.2f",mssv,name,diemLT,diemTH,getDiemtb());
	}
}
