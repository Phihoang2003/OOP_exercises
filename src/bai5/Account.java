package bai5;
import java.text.NumberFormat;
import java.util.Locale;
public class Account {
	private long accountNumber;
	private String name;
	private double balance;
	private final double RATE=0.035;
	
	
	private Locale local=new Locale("vi","VN");
	private NumberFormat formatter=NumberFormat.getCurrencyInstance(local);
	public Account() {
		this.accountNumber=999999;
		this.name="";
		this.balance=50000;
	}
	public Account(long accountNumber,String name) {
		this.accountNumber=accountNumber;
		this.name=name;
	}
	public Account(long accountNumber,String name,double balance) {
		this.accountNumber=accountNumber;
		this.name=name;
		this.balance=balance;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public boolean deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			return true;
		}
		return false;
	}
	public boolean withdraw(double amount,double fee) {
		if(amount>0&&amount+fee<=balance) {
			balance-=amount+fee;
			
			return true;
		}
		return false;
	}
	public void addInterest() {
		balance=balance+balance*RATE;
	}
	public boolean transfer(Account acc2,double amount ) {
		if(amount>0) {
			balance-=amount;
			acc2.balance+=amount;
			return true;
		}
		return false;
	}
	
	public String toString() {
		String number=formatter.format(balance);
		return String.format("%-20s %15d %20s",name,accountNumber,number);
	}
	
	
	
}
