package ontapgk;

import java.time.LocalDate;

public class Sach {
	private int maSach;
	private String tuaSach;
	private double giaSach;
	private LocalDate ngayNhap;
	private String tacGia;
	public Sach(int maSach, String tuaSach, double giaSach, LocalDate ngayNhap, String tacGia) throws Exception {
		super();
		setMaSach(maSach);
		setTuaSach(tuaSach);
		setGiaSach(giaSach);
		setNgayNhap(ngayNhap);
		setTacGia(tacGia);
	}
	public int getMaSach() {
		return maSach;
	}
	public void setMaSach(int maSach) {
		if(maSach>0) {
			this.maSach = maSach;
		}
		else {
			this.maSach=111;
		}
	}
	public String getTuaSach() {
		return tuaSach;
	}
	public void setTuaSach(String tuaSach) throws Exception {
		if(tuaSach.trim().equals("")) {
			throw new Exception("Tua sach khong duoc rong");
		}
		else {
			this.tuaSach = tuaSach;
		}
	}
	public double getGiaSach() {
		return giaSach;
	}
	public void setGiaSach(double giaSach) {
		if(giaSach>0) {
			this.giaSach = giaSach;
		}
		else {
			this.giaSach = 1000;
		}
	}
	public LocalDate getNgayNhap() {
		return ngayNhap;
	}
	public void setNgayNhap(LocalDate ngayNhap) {
		if(ngayNhap.isBefore(LocalDate.now())) {
			this.ngayNhap = ngayNhap;
		}else {
			this.ngayNhap=LocalDate.now();
		}
	}
	public String getTacGia() {
		return tacGia;
	}
	public void setTacGia(String tacGia) {
		if(!tacGia.trim().equals("")) {
			this.tacGia = tacGia;
		}else {
			this.tacGia ="nhom tac gia";
		}
	}
	
	@Override
	public String toString() {
		return String.format("%15d %15s %15.2f %15s %15s", maSach,tuaSach,giaSach,ngayNhap,tacGia);
	}
	

}
