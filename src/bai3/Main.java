package bai3;

public class Main {
	public static void main(String[] args) {
		TamGiac tg1=new TamGiac(0,0,0);
		TamGiac tg2=new TamGiac(-2,0,1);
		TamGiac tg3=new TamGiac(3,4,5);
		TamGiac tg4=new TamGiac(3,3,4);
		TamGiac tg5=new TamGiac(1,1,1);
		
		System.out.println(String.format("%20s %20s %20s %20s %20s %20s", "Canh 1","Canh 2","Canh 3","Loai Tam Giac","Chu Vi","Dien Tich"));
		System.out.println(tg1.toString());
		System.out.println(tg2.toString());
		System.out.println(tg3.toString());
		System.out.println(tg4.toString());
		System.out.println(tg5.toString());
		
	}
}
