package bai10;

import java.time.LocalDate;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		DanhSachPhongHoc ds=new DanhSachPhongHoc();
		ds.themPhongHoc(new PhongLyThuyet("2322", "G", 50, 5, true,LocalDate.of(2023,5,3)));
		ds.themPhongHoc(new PhongLyThuyet("4543", "L", 50, 5, true,LocalDate.of(2023,10,10)));
		ds.themPhongHoc(new PhongMayTinh("8583", "A", 30, 3, 60));
		ds.themPhongHoc(new PhongMayTinh("3498", "L", 30, 3, 60));
		ds.themPhongHoc(new PhongThiNgiem("2382", "K", 70, 7, "KTPM", 1000, true));
		ds.themPhongHoc(new PhongThiNgiem("345843", "F", 70, 7, "KTPM", 1000, true));
		System.out.println(ds);
		System.out.println("Sap xep tang dan theo day nha: ");
		System.out.println(ds.sapXepTangDanTheoDayNha());
		System.out.println("Sap xep giam dan theo dien tich");
		System.out.println(ds.sapXepGiamDanTheoDienTich());
		Scanner sc=new Scanner(System.in);
		
//		System.out.println("Nhap vao ma may tinh muon cap nhat");
//		String ma=sc.nextLine();
//		System.out.println("Nhap vao so may tinh muon cap nhat");
//		int soMayTinh=sc.nextInt();
//		System.out.println(ds.capNhatSoMayTinh(ma, soMayTinh)?"Cap Nhat thanh cong":"Cap nhat that bai");
		System.out.println(ds);
	}
}
