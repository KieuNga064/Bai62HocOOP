package kieunga.com.model;

public class SinhVien {
	private String hoTen;
	private double diem;
	
	public String getHoTen() {
		return this.hoTen;		
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public SinhVien(String hoTen, double diem)
	{
		this.hoTen=hoTen;
		this.diem=diem;
		System.out.println("Đây là constructor có đối số.");
	}

	public double getDiem() {
		return this.diem;
	}

	public void setDiem(double diem) {
		this.diem = diem;
	}

	public SinhVien()
	{
		this.hoTen="XZY";
		System.out.println("Đây là constructor mặc định.");
	}
	public void xuatThongTin()
	{
		System.out.println(this.hoTen+"-->"+this.diem);
	}
@Override
	public String toString() {
	// TODO Auto-generated method stub
	return "Họ tên = "+this.hoTen+"\nĐiểm = "+this.diem;
	}
}
