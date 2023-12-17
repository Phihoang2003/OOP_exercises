package bai10;

import java.time.LocalDate;

public class PhongLyThuyet extends PhongHoc {
	private boolean coMaychieu;
	private LocalDate ngayMoPhong;
	public PhongLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen,boolean coMayChieu,LocalDate ngayMoPhong) {
		super(maPhong, dayNha, dienTich, soBongDen);
		// TODO Auto-generated constructor stub
		setCoMaychieu(coMayChieu);
		setNgayMoPhong(ngayMoPhong);
	}
	
	
	
	public LocalDate getNgayMoPhong() {
		return ngayMoPhong;
	}



	public void setNgayMoPhong(LocalDate ngayMoPhong) {
		this.ngayMoPhong = ngayMoPhong;
	}



	public boolean isCoMaychieu() {
		return coMaychieu;
	}

	public void setCoMaychieu(boolean coMaychieu) {
		this.coMaychieu = coMaychieu;
	}



	@Override
	public boolean xetDatChuan() {
		// TODO Auto-generated method stub
		if(super.coDuAnhSang()&&coMaychieu) {
			return true;
		}
		else {
			return false;
		}
	}
	public String toString() {
		return String.format("%15s %15s %15s %15s", super.toString(),ngayMoPhong,coMaychieu?"Co May Chieu":"Khong co may chieu",xetDatChuan()?"Dat chuan":"Khong dat chuan");
	}
	
	
}
