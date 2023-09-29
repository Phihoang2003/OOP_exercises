package bai8;


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
		   	return false;}
	   dsHangHoa[count++]=hh;
	   
	   return true;
	  }
	  throw new Exception("Loi mang day");
	 }
	 public DanhSachHangHoa thongTinHangThucPham() throws Exception {
		 
		 DanhSachHangHoa dsThucPham=new DanhSachHangHoa(2);
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
	 public String toString() {
		 String s="";
		 for(HangHoa hh:dsHangHoa) {
			 s+=hh+"\n";
		 }
		 return String.format("%s", s);
	 }
}
