package Day4;

public class Motobike {
	public  String hangSanXuat;
	public  String mauXe ;
	public  String bienSo ;
	public  String ngayDangKy ;
	
	public void LayThongTinXe ()
	{
		System.out.println("\n Hang San Xuat:" + hangSanXuat +"\n Mau xe:" + mauXe +"\n Bien so:" +bienSo+"\n Ngay Dang Ky:" +ngayDangKy);
	}
	public static void main(String[] args) {
		Motobike xeSH = new Motobike();
		xeSH.hangSanXuat = "HonDa" ;
		xeSH.mauXe = "Black" ;
		xeSH.bienSo = "29K1.001";
		xeSH.ngayDangKy = "11-12-23";
		xeSH.LayThongTinXe();

	}

}
