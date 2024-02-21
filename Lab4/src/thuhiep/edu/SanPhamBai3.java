/**
 * 
 */
package thuhiep.edu;

import java.util.Scanner;

/**
 * 
 */
public class SanPhamBai3 {

	/**
	 * @param args
	 */
	 String tenSP;
	 double donGia;
	 double giamGia;
		
	public SanPhamBai3(String tenSP,double donGia, double giamGia ) {
		this.tenSP=tenSP;
		this.giamGia=giamGia;
		this.donGia=donGia;
	}
	public SanPhamBai3(String tenSp, double donGia) {
        this(tenSp, donGia, 0); 
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
		SanPhamBai3 sp1 = new SanPhamBai3("iphone", 20000000);
		System.out.println("Thông tin sản phẩm thứ nhất:");
		sp1.Xuat();
		SanPhamBai3 sp2 = new SanPhamBai3("Samsung", 17000000,15000000);
		System.out.println("Thông tin sản phẩm thứ nhất:");
		sp2.Xuat();
	}
	

}
