package bai4;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class HangThucPham {
	private String mahang;
	private String name;
	private double price;
	private LocalDate ngaysx,ngayhethan;
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	public HangThucPham(String mahang,String name,double price,String ngaysx,String ngayhethan) throws Exception {
		setMahang(mahang);
		setName(name);
		setPrice(price);
		setNgaysx(ngaysx);
		setNgayhethan(ngayhethan);
		
	}
	
	private boolean hethan() {
		return ngayhethan.isBefore(LocalDate.now())?true:false;
	}
	private void setMahang(String mahang) throws Exception {
		if(!mahang.trim().equals("")) {
			this.mahang=mahang;
			
		}
		else {
			throw new Exception("Loi.Ma hang loi");
		}
	}
	public void setName(String name) throws Exception {
		if(!name.trim().equals("")) {
			this.name=name;
		}else {
			this.name="xxx";
			throw new Exception("Loi.Ma hang rong");
		}
	}
	
	public void setPrice(double price) {
		if(price>=0) {
			this.price=price;
		}else {
			this.price=0;
		}
	}
	public void setNgaysx(String ngaysxStr) {
		
			LocalDate ngaysx=LocalDate.parse(ngaysxStr,formatter);
			
			if(ngaysx.isBefore(LocalDate.now())) {
				this.ngaysx=ngaysx;
			}
			else {
				this.ngaysx=LocalDate.now();
			}
			
	}
	
	public void setNgayhethan(String ngayhethanStr) {
		
		LocalDate ngayhethan=LocalDate.parse(ngayhethanStr,formatter);
		
		if(ngayhethan.isAfter(ngaysx)) {
			this.ngayhethan=ngayhethan;
		}
		else {
			this.ngayhethan=ngaysx;
		}
		
}
	
	public String toString() {
		return String.format("%20s %20s %20s %20s %20s %20s", mahang,name,price,ngaysx,ngayhethan,hethan()?"Hang het han":"");
	}
}
