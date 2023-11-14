package bai9;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		DanhSachPhongHoc ds=new DanhSachPhongHoc();
		ds.themPhongHoc(new PhongLyThuyet("2302", "G", 50, 5, true));
		ds.themPhongHoc(new PhongMayTinh("203233", "B", 30, 3, 20));
		ds.themPhongHoc(new PhongThiNghiem("23293", "C", 60, 6, "KTPM", 1000, true));
		ds.themPhongHoc(new PhongThiNghiem("2323433", "K", 70, 7, "KTPM", 1000, true));
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Nhap vao ma phong can tim: ");
//		String ma=sc.nextLine();
//		
//		PhongHoc ph=ds.timPhong(ma);
//		if(ph==null) {
//			System.out.println("Khong co ma phong nay");
//		}
//		else {
//			System.out.println(ph);
//		}
		
		System.out.println("Danh sach phong dat chuan");
		System.out.println(ds.layPhongHocDatChuan());
		System.out.println("Sap xep tang dan theo day nha: ");
		System.out.println(ds.sapXepTangDanTheoDayNha());
		System.out.println("Sap xep tang dan theo dien tich: ");
		System.out.println(ds.sapXepGiamDanTheoDienTich());
		System.out.println("Sap xep giam dan theo so bong den lon hon 3: ");
		System.out.println(ds.sapXepBongDenLonHon2());
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhap vao ma may muon cap nhat: ");
		String ma=sc.nextLine();
		System.out.print("Nhap vao so may muon cap nhat: ");
		int soMayTinh=sc.nextInt();
		System.err.println(ds.capNhatSoMayTinh(ma,soMayTinh)?"Cap nhat thanh cong":"Cap Nhat that bai");
		System.out.println(ds.xuatToanBoPhongHoc());
		
		
	}
	public static void getTieuDe() {
		System.out.println(String.format("%-10s %-10s %-10s %-10s ","Ma Phong","Day Nha","Dien Tich","So Bong Den"));
	}
	
}
