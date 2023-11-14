package bai9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachPhongHoc {
	ArrayList<PhongHoc> ds;
	public DanhSachPhongHoc() {
		ds=new ArrayList<PhongHoc>();
	}
	public boolean themPhongHoc(PhongHoc ph) {
		if(ds.contains(ph)) {
			return false;
		}
		ds.add(ph);
		return true;
	}
	public PhongHoc timPhong(String ma) {
		for(PhongHoc ph:ds) {
			if(ph.getMaPhong().equalsIgnoreCase(ma)) {
				return ph;
			}
		}
		return null;
	}
	public DanhSachPhongHoc layPhongHocDatChuan() {
		DanhSachPhongHoc temp=new DanhSachPhongHoc();
		for(PhongHoc ph:ds) {
			if(ph.xetDatChuan()) {
				temp.themPhongHoc(ph);
			}
		}
		return temp;
	}
	public DanhSachPhongHoc sapXepTangDanTheoDayNha() {
		DanhSachPhongHoc temp=new DanhSachPhongHoc();
		temp.ds=new ArrayList<PhongHoc>(ds);
		Comparator<PhongHoc> id=Comparator.comparing(PhongHoc::getDayNha);
		Collections.sort(temp.ds,id);
		return temp;
		
	}
	public DanhSachPhongHoc sapXepGiamDanTheoDienTich() {
		DanhSachPhongHoc temp=new DanhSachPhongHoc();
		temp.ds=new ArrayList<PhongHoc>(ds);
		Comparator<PhongHoc> id=Comparator.comparing(PhongHoc::getDienTich);
		Collections.sort(temp.ds,id.reversed());
		return temp;
		
	}
	public DanhSachPhongHoc sapXepBongDenLonHon2() {
		DanhSachPhongHoc temp=new DanhSachPhongHoc();
		temp.ds=new ArrayList<PhongHoc>(ds);
		DanhSachPhongHoc temp1=new DanhSachPhongHoc();
		for(PhongHoc ph:ds) {
			if(ph.getSoBongDen()>3) {
				temp1.themPhongHoc(ph);
			}
		}
		Comparator<PhongHoc> id=Comparator.comparing(PhongHoc::getSoBongDen);
		Collections.sort(temp1.ds,id.reversed());
		return temp1;
	}
	public boolean capNhatSoMayTinh(String ma,int soMayTinh) {
		for(PhongHoc ph:ds) {
			if(ph instanceof PhongMayTinh&&ph.getMaPhong().equals(ma)) {
				((PhongMayTinh)ph).setSoMayTinh(soMayTinh);;
				return true;
			}
		}
		return false;
	}
	
	public String xuatToanBoPhongHoc() {
		String s="";
		for(PhongHoc ph:ds) {
			s+=ph+"\n";
		}
		return s;
	}
	public static String getTitle1() {
		return String.format("%-10s%-10s%-10s%-10s%-10s\n", "Ma phong","Day nha","Dien tich","So BDen", "So MChieu");
	}
	public static String getTitle2() {
		return String.format("%-10s%-10s%-10s%-10s%-10s\n", "Ma phong","Day nha","Dien tich","So BDen", "So MTinh");
	}
	public static String getTitle3() {
		return String.format("%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n", "Ma phong","Day nha","Dien tich","So BDen", "CNganh","Suc chua","Bon rua");
	}

	public String toString() {
//		String s = "Phong ly thuyet:\n"+getTitle1();
//		for (PhongHoc phongHoc : ds) {
//			if (phongHoc instanceof PhongLyThuyet)
//				s += phongHoc + "\n";
//		}
//		s += "\nPhong May Tinh\n"+getTitle2();
//		for (PhongHoc phongHoc : ds) {
//			if (phongHoc instanceof PhongMayTinh)
//				s += phongHoc + "\n";
//		}
//		s += "\nPhong Thi Nghiem\n"+getTitle3();
//		for (PhongHoc phongHoc : ds) {
//			if (phongHoc instanceof PhongThiNghiem)
//				s += phongHoc + "\n";
//		}
//
//		return s;
//	}
		String s="";
		for(PhongHoc ph:ds) {
			s+=ph+"\n";
		}
		return s;
	}
}
