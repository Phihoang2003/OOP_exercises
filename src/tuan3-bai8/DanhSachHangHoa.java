package bai8;

import java.util.Arrays;
import java.util.Comparator;

public class DanhSachHangHoa {
	 private HangHoa[] dsHangHoa;
	 int count;
	 public DanhSachHangHoa(int n) {
		 this.dsHangHoa=new HangHoa[n];
		 count=0;
	 }
	 public boolean searchMahang(String mahang) {
	  for( int i=0;i<count;i++)
	   if(dsHangHoa[i].getMaHang()==mahang)
		   return true;;
	  return false;
	 }
	 public boolean themHangHoa(HangHoa hh) throws Exception   {
	  if(count<dsHangHoa.length) {
	   if(searchMahang(hh.getMaHang())) {
		   	return false;
	   }
	   dsHangHoa[count++]=hh;
	   return true;
	  }
	  else {
		  throw new Exception("Loi mang day");
	  }
	 }
	 public DanhSachHangHoa thongTinHangThucPham() throws Exception {
		 
		 DanhSachHangHoa dsThucPham=new DanhSachHangHoa(4);
		 for(HangHoa hh:dsHangHoa) {
			 if(hh instanceof HangThucPham) {
				 dsThucPham.themHangHoa(hh);
			 }
		 }
		 return dsThucPham;
		 
	}
	 public DanhSachHangHoa thongTinHangSanhSu() throws Exception {
		 DanhSachHangHoa dsSanhSu=new DanhSachHangHoa(1);
		 for(HangHoa hh:dsHangHoa) {
			 if(hh instanceof HangSanhSu) {
				 dsSanhSu.themHangHoa(hh);
			 }
		 }
		 return dsSanhSu;
		 
	}
	 public DanhSachHangHoa thongTinHangDienMay() throws Exception {
		 DanhSachHangHoa dsDienMay=new DanhSachHangHoa(0);
		 for(HangHoa hh:dsHangHoa) {
			 if(hh instanceof HangDienMay) {
					 dsDienMay.themHangHoa(hh);
			 }
		 }
		 return dsDienMay;
		 
	}
	public DanhSachHangHoa layThongTinHangThucPhamKhoBan() throws Exception {
		DanhSachHangHoa dsThucPham=new DanhSachHangHoa(2);
		for(HangHoa hh:dsHangHoa) {
			if(hh instanceof HangThucPham) {
				if(hh.danhGiaMucDoBanBuon().equals("Kho Ban")) {
					dsThucPham.themHangHoa(hh);
				}
			}
		}
		return dsThucPham;
	}
	public void sapXepTheoTenHangHoaTangDan() {
		Arrays.sort(dsHangHoa,new Comparator<HangHoa>() {
			public int compare(HangHoa hh1,HangHoa hh2) {
				return hh1.getTenHang().compareTo(hh2.getTenHang());
			}
		});
	}
	
	public void sapXepTheoSLTGiamDan() {
		Arrays.sort(dsHangHoa,new Comparator<HangHoa>() {
			public int compare(HangHoa hh1,HangHoa hh2) {
				int slt1=hh1.getSoLuongTon();
				int slt2=hh2.getSoLuongTon();
				
				return slt2-slt1;
			}
		});
	}
	public boolean xoaHangHoa(String maHang) {
		if(searchMahang(maHang)==false) {
			return false;
		}
		HangHoa[] temp=new HangHoa[count-1];
		int j=0;
		for(int i=0;i<count;i++) {
			if(!dsHangHoa[i].getMaHang().equals(maHang)) {
				temp[j]=dsHangHoa[i];
				j++;
			}
		}
		dsHangHoa=temp;
		count--;
		return true;
	}
	public boolean suaDonGia(String maHang,double donGia) throws Exception {
		for(int i=0;i<count;i++) {
			if(dsHangHoa[i].getMaHang().equals(maHang)) {
				dsHangHoa[i].setDonGia(donGia);
				return true;
			}
		}
		return false;
	}
	 public String toString() {
		
		 String s="";
		 for(HangHoa hh:dsHangHoa) {
			 s+=hh+"\n";
		 }
		 return String.format("%s", s);
	 }
}
