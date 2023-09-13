package bai9;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class SoTietKiem {
	private String maSo;
	private LocalDate ngayMoSo;
	private double soTienGoi;
	private int kyHan;
	private float laiSuat;
	
	public SoTietKiem(String maSo,LocalDate ngayMoSo,double soTienGoi,int kyHan,float laiSuat) {
		setMaSo(maSo);
		this.ngayMoSo=ngayMoSo;
		this.laiSuat=laiSuat;
		this.soTienGoi=soTienGoi;
		this.kyHan=kyHan;
		this.laiSuat=laiSuat;
	}
	public String getMaSo() {
		return maSo;
	}

	public void setMaSo(String maSo) {
		this.maSo = maSo==null?"chua co":maSo;
	}

	public LocalDate getNgayMoSo() {
		return ngayMoSo;
	}

	public void setNgayMoSo(LocalDate ngayMoSo) {
		this.ngayMoSo = ngayMoSo;
	}

	public double getSoTienGoi() {
		return soTienGoi;
	}

	public void setSoTienGoi(double soTienGoi) {
		this.soTienGoi = soTienGoi;
	}

	public int getKyHan() {
		return kyHan;
	}

	public void setKyHan(int kyHan) {
		this.kyHan = kyHan;
	}

	public float getLaiSuat() {
		return laiSuat;
	}

	public void setLaiSuat(float laiSuat) {
		this.laiSuat = laiSuat;
	}
	public int tinhSoThangGoiThuc() {
		Period age = Period.between(ngayMoSo, LocalDate.now());
		int dt_nam = age.getYears();
		int dt_thang = age.getMonths();
		int soThangGoi = dt_nam * 12 + dt_thang;
		if (soThangGoi % kyHan == 0)
			return soThangGoi;
		else
			return soThangGoi / kyHan * kyHan;
	}

	public double tinhTienLai() {
		return soTienGoi * laiSuat * tinhSoThangGoiThuc();
	}
	
	public String toString() {
		LocalDate now = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DecimalFormat df = new DecimalFormat("#,###.00");
		return String.format("\nSTK %s[%s-%s]KH %d thang, "
				+ "so thang tinh lai: %d, ls %.3f, so tien: %s --> Tien lai: %s"
				, maSo, dtf.format(getNgayMoSo()), dtf.format(now), kyHan, 
				tinhSoThangGoiThuc(), laiSuat, df.format(soTienGoi),df.format(tinhTienLai()));
	}
}
