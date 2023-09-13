package tuan1;
import java.util.Scanner;


//public class bai1 {
//	public static void main(String[] args) {
//		System.out.println("Hello world");
//		
//	}
//}

//bai2
//public class bai1 {
//	public static void main(String[] args) {
//		Scanner scanner=new Scanner(System.in);
//		System.out.print("Nhap ten cua ban: ");
//		String name=scanner.nextLine();
//		System.out.println("Hello"+" "+name);
//		
//		System.out.print("Nhap vao so thuc: ");
//		Double number=scanner.nextDouble();
//		System.out.println(number);
//	}
//}
//noi chuỗi

//public class bai1 {
//	public static void main(String[] args) {
//		String a="Hello Phi. ";
//		String b="Chao mung ban den voi java";
//		String result=a+b;
//		System.out.println(result);
//	}
//}

//Giai phuong trinh bac 1
//public class bai1 {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Giải phương trình bậc 1: ax + b = 0");
//        
//        // Nhập hệ số a và b
//        System.out.print("Nhập hệ số a: ");
//        double a = scanner.nextDouble();
//        
//        System.out.print("Nhập hệ số b: ");
//        double b = scanner.nextDouble();
//        
//        // Giải phương trình
//        if (a == 0) {
//            if (b == 0) {
//                System.out.println("Phương trình có vô số nghiệm.");
//            } else {
//                System.out.println("Phương trình vô nghiệm.");
//            }
//        } else {
//            double x = -b / a;
//            System.out.println("Nghiệm của phương trình là x = " + x);
//        }
//        
//        scanner.close();
//	}
//}
//Viết chương trình tìm USCLN của 2 số nhập vào.
//Tach chuoi
public class bai1 {
	public static void main(String[] args) {
		String chuoi="Bai Tap Mon Lap Trinh Java";
		String[] mangchuoicon=tachchuoi(chuoi);
		for(String item:mangchuoicon) {
			System.out.println(item);
		}
		
	}
	public static String[] tachchuoi(String chuoi){
		String [] mangchuoicon=chuoi.split(" ");
		return mangchuoicon;
	}
}






