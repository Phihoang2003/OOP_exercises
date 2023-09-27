package bai8;

public class DanhSachHangHoa {
	private HangHoa[] dsHangHoa;
	int count;
	public DanhSachHangHoa(int n) {
		this.dsHangHoa=new HangHoa[n];
		count=0;
	}
	public boolean searchMahang(String mahang) {
		for(HangHoa item:dsHangHoa)
			if(item.getMaHang()==mahang)
				return false;
		return true;
	}
	public boolean themHangHoa(HangThucPham htp) throws Exception   {
		if(count<dsHangHoa.length) {
			
			dsHangHoa[count++]=htp;
			return true;
		}
		throw new Exception("Loi mang day");
	}
}
