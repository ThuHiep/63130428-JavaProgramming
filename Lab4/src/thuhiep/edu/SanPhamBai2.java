/**
 * 
 */
package thuhiep.edu;

import java.util.Scanner;

/**
 * 
 */
public class SanPhamBai2 {


	/**
	 * @param args
	 */
	 String tenSP;
	 double donGia;
	 double giamGia;
		
	public SanPhamBai2(String tenSP,double donGia, double giamGia ) {
		this.tenSP=tenSP;
		this.giamGia=giamGia;
		this.donGia=donGia;
	}
	public double getThueNhapKhau() {
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
		
		SanPhamBai2 sp1 = new SanPhamBai2("", 0, 0);
		SanPhamBai2 sp2 = new SanPhamBai2("", 0, 0);
		System.out.println("Nhập thông tin sản phẩm thứ nhất: ");
		sp1.Nhap();
		System.out.println("Nhập thông tin sản phẩm thứ 2: ");
		sp2.Nhap();
		System.out.println("Thông tin sản phẩm thứ nhất:");
		sp1.Xuat();
		System.out.println("Thông tin sản phẩm thứ 2:");
		sp2.Xuat();
		
	}
	

}
