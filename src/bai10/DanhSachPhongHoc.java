package bai10;

import java.util.ArrayList;
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
	public DanhSachPhongHoc sapXepTangDanTheoDayNha() {
		DanhSachPhongHoc temp=new DanhSachPhongHoc();
		temp.ds=new ArrayList<PhongHoc>(ds);
		Comparator<PhongHoc> id=Comparator.comparing(PhongHoc::getDayNha);
		Collections.sort(temp.ds,id);
		return temp;
	}
//	public DanhSachPhongHoc sapXepGiamDanTheoNgayMoPhong() {
//		DanhSachPhongHoc temp=new DanhSachPhongHoc();
//		temp.ds=new ArrayList<PhongHoc>(ds);
//		
//		Comparator<PhongHoc> id=Comparator.comparing(PhongHoc::getNgayMoPhong);
//		temp.ds.removeIf(PhongHoc->!(PhongHoc instanceof PhongLyThuyet));
//		Collections.sort(temp.ds,id.reversed());
//		return temp;
//		
//	}
	public DanhSachPhongHoc sapXepGiamDanTheoDienTich() {
		DanhSachPhongHoc temp=new DanhSachPhongHoc();
		temp.ds=new ArrayList<PhongHoc>(ds);
		Comparator<PhongHoc> id=Comparator.comparing(PhongHoc::getDienTich);
		Collections.sort(temp.ds,id.reversed());
		return temp;
	}
	public boolean capNhatSoMayTinh(String ma,int soMayTinh) {
		for(PhongHoc ph:ds) {
			if(ph instanceof PhongMayTinh&&ph.getMaPhong().equalsIgnoreCase(ma)) {
				((PhongMayTinh)ph).setSoMayTinh(soMayTinh);
				return true;
			}
		}
		return false;
	}
	public String toString() {
		String s="";
		for(PhongHoc ph:ds) {
			s+=ph+"\n";
		}
		return s;
	}
}
