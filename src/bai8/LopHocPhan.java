package bai8;

public class LopHocPhan {
	private String maLHP;
	private String tenLHP;
	private String tenGV;
	private String thongTinLopHoc;
	private SinhVien[] dsSV;
	
	public LopHocPhan(String maLHP, String tenLHP, String tenGV, String thongTinLopHoc, SinhVien[] dsSV) {
		this.maLHP = maLHP;
		this.tenLHP = tenLHP;
		this.tenGV = tenGV;
		this.thongTinLopHoc = thongTinLopHoc;
		this.dsSV = dsSV;
	}
	public LopHocPhan() {
		
	}
	public String getMaLHP() {
		return maLHP;
	}
	public String getTenLHP() {
		return tenLHP;
	}
	public SinhVien[] getDSSV() {
		return dsSV;
	}
	public String getThongTinLopHoc() {
		return thongTinLopHoc;
	}
	public String getTenGV() {
		return tenGV;
	}
	public void setMaLHP(String maLHP) {
		this.maLHP=maLHP;
	}
	public void setTenGV(String tenGV) {
		this.tenGV=tenGV;
	}
	public void setTenLHP(String tenLHP) {
		this.tenLHP=tenLHP;
	}
	public void setDsSV(SinhVien[] dsSV) {
		this.dsSV=dsSV;
	}
	public void setThongTinLopHoc(String thongTinLopHoc) {
		this.thongTinLopHoc=thongTinLopHoc;
	}
	public String toString() {
		String s="";
		for(int i=0;i<dsSV.length;i++) {
			s+=dsSV[i]+"\n";
		}
		return String.format("-Ma LHP:"+maLHP
				+ "\n-Ten LHP: "
				+tenLHP+ "\n-GV giang day: "
				+tenGV+ "\n-Thong tin buoi hoc: "
				+thongTinLopHoc+ "\nDanh sach sinh vien\n"
				+ s+"\nTong so sinh vien: "+dsSV.length);
		
		
	}
	
}
