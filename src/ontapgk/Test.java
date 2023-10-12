package ontapgk;

import java.time.LocalDate;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		DanhSachSach dsSach=new DanhSachSach(0);
		Scanner sc=new Scanner(System.in);
		int chon;
		do {
			System.out.println("----------MENU----------");
			System.out.println("1.Tao constructor khoi tao n sach.\r\n"
								+"2.Them sach vao danh sach.\r\n"
								+"3.Xuat ra toan bo sach.\r\n"
								+"4.Tim sach.\r\n"
								+"5.Xoa sach.\r\n"
								+"Ban chon: ");
			chon=sc.nextInt();
			switch (chon) {
			case 1: {
				System.out.println("Nhap vao so phan tu mang: ");
				int n=sc.nextInt();
				dsSach=new DanhSachSach(n);
				break;
			}
			case 2:{
				System.out.println("Nhap so luong sach muon them");
				int n=sc.nextInt();
				
				for(int i=0;i<n;i++) {
					System.out.println("\nNhap vao sach thu "+(i+1));
					System.out.println("Nhap vao ma sach: ");
					int maSach=sc.nextInt();
					sc.nextLine();
					System.out.println("Nhap vao tua sach: ");
					String tuaSach=sc.nextLine();
					System.out.println("Nhap vao gia sach: ");
					double giaSach=sc.nextDouble();
					System.out.println("Nhap vao ngay nhap: ");
					System.out.print("Ngay: ");
					int ngay=sc.nextInt();
					System.out.print("Thang: ");
					int thang=sc.nextInt();
					System.out.print("Nam: ");
					int nam=sc.nextInt();
					LocalDate ngayNhap=LocalDate.of(nam, thang, ngay);
					sc.nextLine();
					System.out.println("Nhap vao ten tac gia");
					String tacGia=sc.nextLine();
					try {
						Sach sach=new Sach(maSach,tuaSach,giaSach,ngayNhap,tacGia);
						if(dsSach.themSach(sach)) {
							System.out.println("\nThem Sach Thanh Cong.");
						}
					} catch (Exception e) {
						System.out.println("\nThem Sach that bai. ");
					}
				}
				break;
			}
			case 3:{
				System.out.println(String.format("%15s %15s %15s %15s %15s", "Ma Sach","Tua Sach","Gia Sach","Ngay Nhap","Ten Tac Gia"));
				System.out.println(dsSach.xuatToanBoSach());
				break;
			}
			case 4:{
				System.out.println("Nhap vao ma sach can tim: ");
				int maSach=sc.nextInt();
				sc.nextLine();
				Sach sach=dsSach.timSach(maSach);
				if(sach==null) {
					System.out.println("Khong tim thay sach.");
				}
				else {
					System.out.println(String.format("%15s %15s %15s %15s %15s", "Ma Sach","Tua Sach","Gia Sach","Ngay Nhap","Ten Tac Gia"));
					System.out.println(sach);
				}
				break;
			}
			case 5:{
				System.out.println("Nhap vao ma sach muon xoa: ");
				int maSach=sc.nextInt();
				if(dsSach.xoaSach(maSach)) {
					System.out.println("xoa thanh cong.");
				}
				else {
					System.out.println("Xoa that bai.");
				}
				break;
				
			}
			default:
				System.out.println("Lua chon khong hop le");
				break;
			}
		} while (chon!=0);
	}
}
