package bai7;

public class Main {
	public static void main(String[] args) {
		ToaDo[] P = new ToaDo[1];
		P[0] = new ToaDo("P",5,5);
		
		HinhTron a = new HinhTron(P, 10.5);
		
		
		System.out.println(a);
	}
}
