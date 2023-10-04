package bai8;

import java.time.LocalDate;

public class Main {
 public static void main(String[] args) throws Exception {
  DanhSachHangHoa ds=new DanhSachHangHoa(5);
  ds.themHangHoa(new HangThucPham("1111", "Muoi", 5000, 12, "Hoang Khoi", LocalDate.of(2022,9,12), LocalDate.of(2024,12,1)));
  ds.themHangHoa(new HangThucPham("2222", "Gao", 6000, 12, "Hoang Nhung", LocalDate.of(2022,9,12), LocalDate.of(2024,12,1)));
  ds.themHangHoa(new HangSanhSu("333", "Bong den", 5000, 13, "Hoang Ngoc",  LocalDate.of(2022,12,1)));
  ds.themHangHoa(new HangThucPham("4444", "Nep", 3000, 12, "Hoang Hieu", LocalDate.of(2022,9,12), LocalDate.of(2023,1,10)));
  ds.themHangHoa(new HangThucPham("5555", "Lua", 3000, 11, "Hoang Hau", LocalDate.of(2022,9,12), LocalDate.of(2023,1,12)));
  System.out.println( String.format("%10s %10s %10s %12s %20s","MaHang","TenHang","DonGia","Ton Kho","Muc do ban buon"));
	 
  System.out.println(ds);
  System.out.println("Thong tin hang dien may: "+"\n"+ds.thongTinHangDienMay());
  System.out.println("Thong tin hang thuc pham: "+"\n"+ds.thongTinHangThucPham());
  System.out.println("Thong tin hang sanh su: "+"\n"+ds.thongTinHangSanhSu());
  
  ds.sapXepTheoTenHangHoaTangDan();
  ds.sapXepTheoSLTGiamDan();
//  System.out.println("Hang hoa sap xep theo so luong ton giam dan dan: "+"\n"+ds);
  System.out.println("Thong tin hang thuc pham kho ban: "+"\n"+ds.layThongTinHangThucPhamKhoBan());
  ds.xoaHangHoa("5555");
  ds.suaDonGia("4444", 4000);
  System.out.println("Danh sach hang hoa sau khi sua don gia: "+"\n"+ds);
  
 }
 
	
}
