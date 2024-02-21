/**
 * 
 */
package thuhiep.edu;

import java.util.Scanner;

/**
 * 
 */
public class SanPhamBai4 {


	/**
	 * @param args
	 */
	 private  String tenSP;
	 private double donGia;
	 private double giamGia;
		
	public SanPhamBai4(String tenSP,double donGia, double giamGia ) {
		this.tenSP=tenSP;
		this.giamGia=giamGia;
		this.donGia=donGia;
	}
	public SanPhamBai4(String tenSp, double donGia) {
        this(tenSp, donGia, 0); 
    }
	public String gettenSp() {
		return this.tenSP;
		
	}
	public void settenSp(String tenSp) {
		this.tenSP = tenSp;
	}
	public double getdonGia() {
		return this.donGia;
	}
	public void setdonGia(double donGia) {
		this.donGia=donGia;
	}
	public double getgiamGia() {
		return this.giamGia;
	}
	public void setgiamGia(double giamGia) {
		this.giamGia=giamGia;
	}
	private  double getThueNhapKhau() {
		return 0.1*donGia;
		
	}
	public void Xuat() {
		System.out.println("Tên sản phẩm: "+tenSP);
		System.out.println("Đơn giá: "+ donGia);
		System.out.println("Giảm giá: "+giamGia);
		System.out.println("Thuế nhập khẩu: "+getThueNhapKhau());
	}
	public void Nhap() {
		Scanner  scanner = new Scanner(System.in);
		System.out.println("Nhập tên sản phẩm: ");
		tenSP = scanner.nextLine();
		System.out.println("Nhập đơn giá: ");
		donGia = scanner.nextDouble();
		System.out.println("Nhập giảm giá: ");
		giamGia = scanner.nextDouble();
		
	}
	public static void main(String[] args) {
		SanPhamBai4 sp1 = new SanPhamBai4("iPhone 13", 10000000, 100);
        SanPhamBai4 sp2 = new SanPhamBai4("Samsung Galaxy S21", 29000);

        // Xuất thông tin sản phẩm
        System.out.println("Thông tin sản phẩm 1:");
        System.out.println("Tên sản phẩm: " + sp1.gettenSp());
        System.out.println("Đơn giá: " + sp1.getdonGia());
        System.out.println("Giảm giá: " + sp1.getgiamGia());

        System.out.println("Thông tin sản phẩm 2:");
        System.out.println("Tên sản phẩm: " + sp2.gettenSp());
        System.out.println("Đơn giá: " + sp2.getdonGia());
        System.out.println("Giảm giá: " + sp2.getgiamGia());
	}
	

}
