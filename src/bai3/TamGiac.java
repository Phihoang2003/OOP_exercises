package bai3;

public class TamGiac {
	private float ma,mb,mc;
	public TamGiac() {
		this(0,0,0);
	}
	public TamGiac(float ma,float mb,float mc) {
		if(ma<0||mb<0||mc<0||(ma+mb<mc)||(ma+mc<mb)||(mc+mb<ma)) {
			this.ma=0;
			this.mb=0;
			this.mc=0;
		}
		if(ma>0&&mb>0&&mc>0&&(ma+mb>mc)&&(ma+mc>mb)&&(mc+mb>ma)) {
			this.ma=ma;
			this.mb=mb;
			this.mc=mc;
		}
	}
	public void setTamGiac(float ma,float mb,float mc) {
		if(ma>0&&mb>0&&mc>0&&(ma+mb>mc)&&(ma+mc>mb)&&(mc+mb>ma)) {
			this.ma=ma;
			this.mb=mb;
			this.mc=mc;
			
		}
	}
	public float TinhChuVi() {
		return (ma+mb+mc)/2;
	}
	public double TinhDienTich() {
		float p=TinhChuVi();
		float result=p*(p-ma)*(p-mb)*(p-mc);
		return Math.sqrt(result);
		
	}
	public String loaiTamGiac() {
        if (ma <= 0 || mb <= 0 || mc <= 0) {
            return "Khong phai tam giac";
        } else if (ma == mb && mb == mc) {
            return "Tam giac deu";
        } else if (ma == mb || mb == mc || ma == mc) {
            return "Tam giac can";
        } else if (ma + mb > mc && ma + mc > mb && mc + mb > ma) {
            return "Tam giac thuong";
        } else {
            return "Khong phai tam giac";
        }
    }
	public String toString() {
		return String.format("%20.2f %20.2f %20.2f %20s %20.2f %20.2f" , ma,mb,mc,loaiTamGiac(),TinhChuVi(),TinhDienTich());
	}
}
