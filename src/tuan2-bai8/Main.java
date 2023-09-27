package bai6;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) throws Exception {
		HoaDon [] a=new HoaDon[4];
		a[0]=new HoaDonTheoNgay("11111",LocalDate.now(),"Hai","010",2000,3);
		a[1]=new HoaDonTheoNgay("22222",LocalDate.now(),"Hao","011",3000,5);
		a[2]=new HoaDonTheoGio("33333",LocalDate.now(),"Hieu","012",4000,25);
		a[3]=new HoaDonTheoGio("44444",LocalDate.now(),"Hau","013",5000,22);
		
		System.out.println("Thong ke hoa don theo gio: "+thongKeSoLuongHoaDonTheoGio(a));
		System.out.println("Thong ke hoa don theo ngay: "+thongKeSoLuongHoaDonTheoNgay(a));
		
	}
	public static int thongKeSoLuongHoaDonTheoNgay( HoaDon[] a) {
		int s=0;
		for(HoaDon item:a) {
			if(item instanceof HoaDonTheoNgay) {
				s++;
			}
		}
		return s;
	}
	public static  int thongKeSoLuongHoaDonTheoGio(HoaDon [] a) {
		int s=0;
		for(HoaDon item:a) {
			if(item instanceof HoaDonTheoGio) {
				s++;
			}
		}
		return s;
	}
	
}
