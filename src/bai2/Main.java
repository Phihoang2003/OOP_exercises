package bai2;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		SinhVien sv1=new SinhVien(11111,"Nguyen Thi Lan",8.2f,6.3f);
		SinhVien sv2=new SinhVien(22222,"Nguyen Van Hau",9.1f,2.1f);
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Nhap vao mssv sv3: ");
		int massv=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Nhap vao ten sv3: ");
		String name=scanner.nextLine();
		System.out.println("Nhap vao diem LT sv3: ");
		float diemLT=scanner.nextFloat();
		System.out.println("Nhap vao diem TH sv3: ");
		float diemTH =scanner.nextFloat();
		SinhVien sv3=new SinhVien();
		sv3.setMSSV(massv);
		sv3.setName(name);
		
		sv3.setDiemLT(diemLT);
		sv3.setDiemTH(diemTH);
		
		
		System.out.println(String.format("%-5s %-30s %10s %10s %10s", "maSV","HoTen","DiemLt","DiemTH","DiemTb"));
		System.out.println(sv1.toString());
		System.out.println(sv2.toString());
		System.out.println(sv3.toString());
		scanner.close();
		
		
		
	}
}
