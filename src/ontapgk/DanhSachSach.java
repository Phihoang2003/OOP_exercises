package ontapgk;

import java.util.Arrays;
import java.util.Comparator;

public class DanhSachSach {
	private Sach[] dsSach;
	int count;
	public DanhSachSach(int n) {
		this.dsSach=new Sach[n];
		count=0;
	}
	public boolean searchSach(int maSach) {
		for(int i=0;i<count;i++) {
			if(dsSach[i].getMaSach()==maSach) {
				return true;
			}
		}
		return false;
	}
	public String xuatToanBoSach() {
		String s="";
		for(Sach sach:dsSach) {
			s+=sach+"\n";
		}
		return s;
	}
	public double tongTriGiaSachHienCo() {
		double s=0;
		for(Sach sach:dsSach) {
			s+=sach.getGiaSach();
		}
		return s;
	}
	public void sapXepTheoTuaSachTangDan() {
		Arrays.sort(dsSach,new Comparator<Sach>() {
			public int compare(Sach sach1,Sach sach2) {
				return sach1.getTuaSach().compareTo(sach2.getTuaSach());
			}
		});
	}
	public Sach timSach(int maSach) {
		for(Sach sach:dsSach) {
			if(sach.getMaSach()==maSach) {
				return sach;
			}
		}
		return null;
		
	}
	public boolean capNhatGiaSach(int maSach,double giaSach) {
		for(Sach sach:dsSach) {
			if(sach.getMaSach()==maSach) {
				sach.setGiaSach(giaSach);
				return true;
			}
		}
		return false;
	}
	public boolean xoaSach(int maSach) {
		if(searchSach(maSach)==false) {
			return false;
		}
		Sach[] temp=new Sach[count-1];
		int j=0;
		for(Sach sach:dsSach) {
			if(!(sach.getMaSach()==maSach)) {
				temp[j]=sach;
				j++;
			}
		}
		dsSach=temp;
		count--;
		return true;
		
	}
	public boolean themSach(Sach sach) throws Exception {
		if(count<dsSach.length) {
			if(searchSach(sach.getMaSach())) {
				return false;
			}
			dsSach[count++]=sach;
			return true;
		}
		else {
			throw new Exception("Loi Mang Day");
		}
	}
}
