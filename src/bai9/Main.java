package bai9;

import java.time.LocalDate;
public class Main {
	public static void main(String[] args) {
		LocalDate ngay1 = LocalDate.of(2023, 12, 9);
		LocalDate ngay2 = LocalDate.of(2023, 12, 9);

		KhachHang kh = new KhachHang("KH001", "Nguyen Van An", 2);

		kh.themSoTietKiem("111", ngay1, 1000000, 3, 0.005F);
		kh.themSoTietKiem("112", ngay2, 10000000, 6, 0.006F);
		kh.themSoTietKiem("113", ngay2, 20000000, 9, 0.007F);
		System.out.println(kh);

	}
}