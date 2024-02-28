package ThuHiep;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class SanPham{
	String tenSP;
	double dongia;
	public SanPham(String ten, double donGia) {
        this.tenSP = ten;
        this.dongia = donGia;
        
    }
	@Override
    public String toString() {
        return "Tên: " + tenSP + ", Đơn giá: " + dongia;
    }
}
public class Lab5Bai3 {
	static ArrayList<SanPham> danhsachsanpham = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu();
	}
	public static void Menu() {
		
		while(true) {
			System.out.println("1. Nhập danh sách sản phẩm");
			System.out.println("2. Sắp xếp giảm dần theo giá");
			System.out.println("3. Tìm và xóa sản phẩm");
			System.out.println("4. Xuất giá trị trung bình của các sản phẩm");
			int choose = scanner.nextInt();
			scanner.nextLine();
			switch(choose) {
				case 1: {
					nhap();
					break;
				}
				case 2: {
					sapxepvaxuat();
					break;
				}
				case 3: {
					timvaxoa();
					break;
				}
				case 4: {
					tb();
					break;
				}
				case 5: {
					System.out.println("Kết thúc");
					System.exit(0);
					break;
				}
				
				default:{
					System.out.println("Lựa chọn không hợp lệ");
					break;
				}
			}
		}
		
	}
	public static void nhap() {
		System.out.println("Nhập số lượng sản phẩm");
		int n = scanner.nextInt();
		scanner.nextLine();
		for(int i=0;i<n;i++) {
			System.out.println("Nhập tên sản phẩm thứ "+i);
			String tenSP = scanner.nextLine();
			double dongia = scanner.nextDouble();
			scanner.nextLine();
			SanPham sanPham = new SanPham(tenSP, dongia);
			danhsachsanpham.add(sanPham);
			
			
			
		}
		
		
	}
	public static void  xuat(ArrayList<SanPham>list) {
		for(SanPham sp:list) {
			System.out.println(sp);
		}
	}
	
	public static void sapxepvaxuat() {
		Comparator<SanPham> comparator = new Comparator<SanPham>() {
			
			@Override
			public int compare(SanPham o1, SanPham o2) {
				// TODO Auto-generated method stub
				return Double.compare(o2.dongia, o1.dongia);
			}
		};
		Collections.sort(danhsachsanpham,comparator);
		System.out.println("Danh sách sản phẩm sau khi sắp xếp giảm dần");
		xuat(danhsachsanpham);
		
	}
	public static void timvaxoa() {
		System.out.println("Nhập sản phẩm cần xóa");
		String tenspcanxoaString = scanner.nextLine();
		boolean found = false;
		for(int i=0;i<danhsachsanpham.size();i++) {
			if(danhsachsanpham.get(i).tenSP.equalsIgnoreCase(tenspcanxoaString)) {
				danhsachsanpham.remove(i);
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println("Không tìm thấy sản phẩm cần xóa");
			
		}
		else {
			System.out.println("Đã xóa sản phẩm ra khỏi danh sách");
			System.out.println("Danh sách sản phẩm sau khi xóa");
			xuat(danhsachsanpham);
		}
	
	}
	public static void tb() {
		if(danhsachsanpham.isEmpty()) {
			System.out.println("Không có sản phẩm nào trong danh sách");
			return;
		}
		double sum =0;
		for(SanPham sp:danhsachsanpham) {
			sum+=sp.dongia;
		}
		double giatritb = sum/danhsachsanpham.size();
		System.out.println("Giá trị trung bình: "+giatritb);
		
	}

}
