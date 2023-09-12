package bai5;

public class Main {
	public static void main(String[] args) {
		Account acc1 = new Account(72354, "Ted Murphy", 100000);
		Account acc2 = new Account(69713, "Jane Smith", 40000);
		Account acc3 = new Account(93757, "Edward Demsey", 70000);
		
		System.out.println(String.format("%-20s,%15s,%20s", "Ten","So tai khoan","So du"));
		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println(acc3);
		System.out.println("-------Gui them tien-------");
		if (acc1.deposit(250000)) 
			System.out.println(acc1);
		if (acc2.deposit(500000));
			System.out.println(acc2);
		System.out.println("----------Rut tien--------");
		if (acc2.withdraw(430000, 2000))
			System.out.println(acc2);
		System.out.println("----------Tien lai------");
		acc3.addInterest();
		System.out.println(acc3);
		System.out.println("---------Kiem tra ket qua--------");
		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println(acc3);
		System.out.println("---------------Chuyen tien---------");
		if (acc2.transfer(acc1, 100000))
			System.out.println(acc3);
		else 
			System.out.println("ko du tien de chuyen");
		System.out.println("--------Kiem tra acc1 vs acc2-------");
		System.out.println(acc1);
		System.out.println(acc2);
		
	}
}
