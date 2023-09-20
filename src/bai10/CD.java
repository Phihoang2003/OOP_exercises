package bai10;

public class CD {
	private int maCD;
	private String tuaCD;
	private int soBaiHat;
	private float giaThanh;
	
	public CD(int maCD,String tuaCD,int soBaiHat,float giaThanh) throws Exception {
		setMaCD(maCD);
		setTuaCD(tuaCD);
		setSoBaiHat(soBaiHat);
		setGiaThanh(giaThanh);
	}
	public void setMaCD(int maCD) {
		if(maCD>0) {
			this.maCD=maCD;
		}
		this.maCD=999999;
	}
	public void setTuaCD(String tuaCD) {
		if(!tuaCD.isEmpty()) {
			this.tuaCD=tuaCD;
		}
		this.tuaCD="Chua Xac Dinh";
	}
	public void setSoBaiHat(int soBaiHat) throws Exception  {
		if(soBaiHat>0) {
			this.soBaiHat=soBaiHat;
		}
		throw new Exception("So bai phai hat lon hon 0");
	}
	public void setGiaThanh(float giaThanh) throws Exception {
		if(giaThanh>0) {
			this.giaThanh=giaThanh;
		}
		throw new Exception("Gia thanh phai lon hon 0");
	}
	public int getMaCD() {
		return maCD;
	}
	public String getTuaCD() {
		return tuaCD;
	}
	public int getSoBaiHat() {
		return soBaiHat;
	}
	public float getGiaThanh() {
		return giaThanh;
	}
	
	
}
