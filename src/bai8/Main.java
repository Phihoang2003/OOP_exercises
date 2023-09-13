package bai8;

public class Main {
	public static void main(String[] args) {
		SinhVien[] dssv=new SinhVien[3];
		dssv[0]=new SinhVien("23232","Hoang Hai");
		dssv[1]=new SinhVien("232312","Hoang Hau");
		dssv[2]=new SinhVien("23256","Hoang Khoi");
		
		LopHocPhan b = new LopHocPhan("123456", "LT Huong Doi tuong", "Co Ha", "Thu 7,tiet4-6,phong A1.1", dssv);
		
		System.out.println(b);
		
		
	}
}
