package ontapgk;

import java.util.Arrays;
import java.util.Comparator;

public class DanhSachSach {
	private Sach[] dsSach;
	private int count;
	public DanhSachSach(int n) {
		dsSach=new Sach[n];
		count=0;
	}
	public boolean searchTrungMa(int maSach) {
		for(int i=0;i<count;i++) {
			if(dsSach[i].getMaSach()==maSach) {
				return true;
			}
		}
		return false;
	}
	public String xuatToanBoSach() {
		
		String s="";
		for(Sach sach:dsSach) {
			if(sach!=null) {
				s+=sach+"\n";
			}
		}
		return s;
	}
	public double tongTriGiaSachHienCo() {
		double s=0;
		for(Sach sach:dsSach) {
			s+=sach.getGiaSach();
		}
		return s;
	}
//	public void sapXepTheoTuaSachTangDan() {
//		Arrays.sort(dsSach,new Comparator<Sach>() {
//			public int compare(Sach sach1,Sach sach2) {
//				return sach1.getTuaSach().compareTo(sach2.getTuaSach());
//			}
//		});
//	}
	public void sapXepTheoTuaSachTangDan() {
	    Arrays.sort(dsSach, new Comparator<Sach>() {
	        public int compare(Sach sach1, Sach sach2) {
	            if (sach1 == null && sach2 == null) {
	                return 0;
	            } else if (sach1 == null) {
	                return 1; // Đưa phần tử null lên cuối danh sách
	            } else if (sach2 == null) {
	                return -1; // Đưa phần tử null lên cuối danh sách
	            } else {
	                return sach1.getTuaSach().compareTo(sach2.getTuaSach());
	            }
	        }
	    });
	}

	public void sapXepGiamDanTheoMaGia() {
	    Arrays.sort(dsSach, new Comparator<Sach>() {
	        public int compare(Sach sach1, Sach sach2) {
	            if (sach1 == null && sach2 == null) {
	                return 0; // Nếu cả hai đều là null, coi chúng bằng nhau.
	            } else if (sach1 == null) {
	                return 1; // Nếu sach1 là null, coi sach1 lớn hơn sach2.
	            } else if (sach2 == null) {
	                return -1; // Nếu sach2 là null, coi sach1 nhỏ hơn sach2.
	            } else {
	                return Double.compare(sach2.getGiaSach(), sach1.getGiaSach());
	            }
	        }
	    });
	}

	

	public Sach timSach(int maSach) {
		for(Sach sach:dsSach) {
			if(sach.getMaSach()==maSach) {
				return sach;
			}
		}
		return null;
		
	}
	public boolean capNhatGiaSach(int maSach,double giaSach) {
		for(Sach sach:dsSach) {
			if(sach.getMaSach()==maSach) {
				sach.setGiaSach(giaSach);
				return true;
			}
		}
		return false;
	}
	public boolean xoaSach(int maSach) {
		if(searchTrungMa(maSach)==false) {
			return false;
		}
		Sach[] temp=new Sach[count-1];
		int j=0;
		for(Sach sach:dsSach) {
			if(!(sach.getMaSach()==maSach)) {
				temp[j]=sach;
				j++;
			}
		}
		dsSach=temp;
		count--;
		return true;
		
	}
	public boolean themSach(Sach sach) throws Exception {
		if(count<dsSach.length) {
			if(searchTrungMa(sach.getMaSach())) {
				return false;
			}
			dsSach[count++]=sach;
			return true;
		}
		else {
//			//Tang mang len gap doi neu mang bi day
			Sach[] newDsSach = new Sach[dsSach.length * 2];
            System.arraycopy(dsSach, 0, newDsSach, 0, count);
            dsSach = newDsSach;
            dsSach[count++] = sach;
            return true;
		}
	}
	public Sach[] timSachTheoTuaSach(String keyword) {
	    Sach[] ketQua = new Sach[count];
	    int ketQuaCount = 0;

	    for (Sach sach : dsSach) {
	        if (sach.getTuaSach().toLowerCase().contains(keyword.toLowerCase())) {
	            ketQua[ketQuaCount] = sach;
	            ketQuaCount++;
	        }
	    }

	    Sach[] finalKetQua = new Sach[ketQuaCount];
	    System.arraycopy(ketQua, 0, finalKetQua, 0, ketQuaCount);

	    return finalKetQua;
	}

	public Sach[] timSachGiaCaoNhat() {
	    if (count == 0) {
	        return new Sach[0]; // Danh sách sách trống
	    }

	    double giaCaoNhat = dsSach[0].getGiaSach();

	    for (int i = 1; i < count; i++) {
	        if (dsSach[i].getGiaSach() > giaCaoNhat) {
	            giaCaoNhat = dsSach[i].getGiaSach();
	        }
	    }

	    int soLuongSachGiaCaoNhat = 0;

	    for (int i = 0; i < count; i++) {
	        if (dsSach[i].getGiaSach() == giaCaoNhat) {
	            soLuongSachGiaCaoNhat++;
	        }
	    }

	    Sach[] sachGiaCaoNhat = new Sach[soLuongSachGiaCaoNhat];
	    int index = 0;

	    for (int i = 0; i < count; i++) {
	        if (dsSach[i].getGiaSach() == giaCaoNhat) {
	            sachGiaCaoNhat[index] = dsSach[i];
	            index++;
	        }
	    }

	    return sachGiaCaoNhat;
	}

}
