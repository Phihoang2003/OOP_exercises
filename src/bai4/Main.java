package bai4;

public class Main {
	public static void main(String[] args) throws Exception {
		HangThucPham hang1=new HangThucPham("001","Gao",100.000,"10/07/2023","10/10/2023");
		HangThucPham hang2=new HangThucPham("002","Lua",200.000,"05/07/2023","18/10/2023");
		
		HangThucPham hang3=new HangThucPham("003","Thoc",500.000,"10/07/2023","10/08/2023");
		System.out.println(String.format("%20s %20s %20s %20s %20s %20s", "MaHang","TenHang","Dongia","Ngay san xuat","Ngay het han","Ghi chu"));
		System.out.println(hang1.toString());
		System.out.println(hang2.toString());
		System.out.println(hang3.toString());
		
	}
}
