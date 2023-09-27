package bai1;

import java.util.ArrayList;

public class Test {
	public static double tongDoanhThuTatCaXe(ArrayList<ChuyenXe> cx) {
		return cx.stream().mapToDouble(ChuyenXe::getDoanhThu).sum();
	}
	public static double tongDoanhThuXeNoiThanh(ArrayList<ChuyenXe> cx) {
		return cx.stream()
				.filter(ChuyenXe->ChuyenXe instanceof ChuyenXeNoiThanh )
				.mapToDouble(ChuyenXe->ChuyenXe.getDoanhThu())
				.sum();	
		}
	public static double tongDoanhThuXeNgoaiThanh(ArrayList<ChuyenXe> cx) {
		return cx.stream()
				.filter(ChuyenXe->ChuyenXe instanceof ChuyenXeNgoaiThanh )
				.mapToDouble(ChuyenXe->ChuyenXe.getDoanhThu())
				.sum();	
		}
	public static void main(String[] args) {
		ArrayList<ChuyenXe> dsChuyenXe = new ArrayList<ChuyenXe>(4);
		
		dsChuyenXe.add(new ChuyenXeNoiThanh("111","Nguyen Van A",1,1000,1,100));
		dsChuyenXe.add(new ChuyenXeNoiThanh("112","Nguyen Van B",2,2000,2,200));
		dsChuyenXe.add(new ChuyenXeNgoaiThanh("113","Nguyen Van C",3,3000,"Ben Tre",5));
		dsChuyenXe.add(new ChuyenXeNgoaiThanh("114","Nguyen Van D",4,4000,"Ben Tre",6));
		
		System.out.println("Tong doanh thu cua tat ca cac chuyen xe la: "+tongDoanhThuTatCaXe(dsChuyenXe));
		System.out.println("Tong doanh thu cua cac chuyen xe noi thanh la: "+tongDoanhThuXeNoiThanh
				(dsChuyenXe));
		System.out.println("Tong doanh thu cua cac chuyen xe ngoai thanh la: "+tongDoanhThuXeNgoaiThanh(dsChuyenXe));
		
	}
}
