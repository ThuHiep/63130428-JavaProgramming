package ThuHiep;
import java.util.Scanner;
import java.awt.Menu;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collections;

public class Lab5Bai2 {
	static ArrayList<String> danhsach = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu();
	}
	public static void Menu() {
		while(true) {
			System.out.println("MENU");
			System.out.println("1. Nhập danh sách họ và tên");
			System.out.println("2. Xuất danh sách vừa nhập");
			System.out.println("3. Xuất danh sách ngẫu nhiên");
			System.out.println("4. Sắp xếp giảm dần và xuất danh sách");
			System.out.println("5. Tìm và xóa họ tên nhập từ bàn phím");
			System.out.println("6. Kết thúc");
			int choose = scanner.nextInt();
			scanner.nextLine();
			switch (choose) {
				case 1: {
					Nhap();
					break;
				}
				case 2: {
					Xuat();
					break;
				}
				case 3: {
					XuatNgauNhien();
					break;
				}
				case 4: {
					Sapxep();
					break;
				}
				case 5: {
					timvaxoa();
					break;
				}
				case 6: {
					System.out.println("Kết thúc");
					System.exit(0);
				}
				
				default:{
					System.out.println("Lựa chọn không hợp lệ\n");
					break;
				}
			}		
		}
	}
	public static void Nhap() {
		System.out.println("Nhập số lượng họ tên:");
		int n = scanner.nextInt();
		scanner.nextLine();
		for(int i=0;i<n;i++) {
			System.out.println("Nhập họ tên thứ: "+i);
			String hoTen = scanner.nextLine();
			danhsach.add(hoTen);
		}
	}
	public static void Xuat() {
		System.out.println("Danh sách họ tên vừa nhập:");
		for(String hoTen: danhsach) {
			System.out.println(hoTen);
		}
		
	}
	public static void XuatNgauNhien() {
		System.out.println("Danh sách sau khi xóa trộn:");
		
		Collections.shuffle(danhsach);
		Xuat();
		
	}
	public static void Sapxep() {
		System.out.println("Danh sách sau khi sắp xếp giảm dần: ");
		Collections.sort(danhsach);
		Collections.reverse(danhsach);
		Xuat();
		
	}
	public static void timvaxoa() {
		System.out.println("Nhập họ tên cần xóa: ");
		String hotencanxoa = scanner.nextLine();
		boolean found = false;
		for(int i=0;i<danhsach.size();i++) {
			if(danhsach.get(i).equalsIgnoreCase(hotencanxoa)) {
				danhsach.remove(i);
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println("Không tìm thấy họ tên cần xóa");
		}
		else {
			System.out.println("đã xóa ra khỏi danh sách");
			Xuat();
		}
		
	}
	

}
