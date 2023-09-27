package bai8;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) throws Exception {
		DanhSachHangHoa ds=new DanhSachHangHoa(4);
		ds.themHangHoa(new HangThucPham("1111", "Muoi", 5000, 12, "Hoang Khoi", LocalDate.of(2022,9,12), LocalDate.of(2024,12,1)));
		ds.themHangHoa(new HangThucPham("2222", "Gao", 6000, 12, "Hoang Nhung", LocalDate.of(2022,9,12), LocalDate.of(2024,12,1)));
//		ds.themHangHoa(new HangSanhSu("333", "Bong den", 5000, 13, "Hoang Ngoc",  LocalDate.of(2022,12,1)));
		
		System.out.println(String.format("%10s %10s %10s %10s","maHang","TenHang","DonGia","Ton Kho"));
	}
}
