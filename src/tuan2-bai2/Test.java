package bai2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static double tongTienSachGiaoKhoa(ArrayList<Sach> s) {
		return s.stream().filter(Sach->Sach instanceof SachGiaoKhoa)
				.mapToDouble(Sach->Sach.thanhTien())
				.sum();
	}
	public static double tongTienSachThamKhao(ArrayList<Sach> s) {
		return s.stream().filter(Sach->Sach instanceof SachThamKhao)
				.mapToDouble(Sach->Sach.thanhTien())
				.sum();
	}
	public static double trungBinhGiaSachThamKhao(ArrayList<Sach>s) {
		return s.stream().filter(Sach->Sach instanceof SachThamKhao)
				.mapToDouble(Sach->Sach.getDonGia())
				.sum()/s.size();
	}
	
	
	public static List<Sach> XuatSachGiaoKhoa(ArrayList<Sach>s,String k) {
		return s.stream().filter(Sach->Sach instanceof SachGiaoKhoa)
				.filter(Sach->Sach.getNhaXuatBan().equals(k))
				.collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		ArrayList<Sach> dsSach = new ArrayList<Sach>(6);
		dsSach.add(new SachGiaoKhoa("111", LocalDate.now(), 1000, 2, "Bo Giao Duc", "moi"));
		dsSach.add(new SachGiaoKhoa("112", LocalDate.now(), 2000, 3, "Bo Cong Thuong", "cu"));
		dsSach.add(new SachGiaoKhoa("113", LocalDate.now(), 3000, 4, "Bo Giao Duc", "cu"));
		dsSach.add(new SachThamKhao("114", LocalDate.now(), 2000, 2, "Bo Giao Duc", 500));
		dsSach.add(new SachThamKhao("115", LocalDate.now(), 2000, 2, "Bo Giao Duc", 600));
		dsSach.add(new SachThamKhao("116", LocalDate.now(), 2000, 2, "Bo Giao Duc", 700));
		
		System.out.println("Tong thanh tien sach giao khoa la: "+tongTienSachGiaoKhoa(dsSach));
		System.out.println("Tong thanh tien sach giao khoa la: "+tongTienSachThamKhao(dsSach));
		System.out.println("Trung binh gia sach tham khao la: " +trungBinhGiaSachThamKhao(dsSach));
		List<Sach> dsSGK=XuatSachGiaoKhoa(dsSach, "Bo Giao Duc");
		for(Sach x:dsSGK) {
			System.out.println(x);
		}
	}
	
}
