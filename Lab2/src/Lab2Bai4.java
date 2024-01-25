/**
 * 
 */

/**
 * 
 */
import java.util.*;

public class Lab2Bai4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("+---------------------------------------------------+");
            System.out.println("1. Giải phương trình bậc nhất");
            System.out.println("2. Giải phương trình bậc 2");
            System.out.println("3. Tính tiền điện");
            System.out.println("4. Kết thúc");
            System.out.println("+---------------------------------------------------+");
            System.out.print("Chọn chức năng: ");
            int choice = sc.nextInt();
            switch(choice) {
            case 1:
            	giaiPTB1();
            	break;
            case 2:
            	giaiPTB2();
            	break;
            case 3:
            	tinhTienDien();
            	break;
            case 4:
            	System.out.println("Chương trình kết thúc.");
                System.exit(0);
            default:
                System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
            } 
            	
		}
	}
	public static void giaiPTB1() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập hệ số a: ");
		double a = scanner.nextDouble();
		System.out.print("Nhập hệ số b: ");
		double b = scanner.nextDouble();
		if(a==0) {
			if(b==0) {
				System.out.println("Phương trình vô số nghiệm!\n");
			}
			else {
				System.out.println("Phương trình vô nghiệm!\n");
			}
		}else {
			System.out.printf("Phương trình có nghiệm x = %.1f\n",-b/a);
		}
		
	}
	public static void giaiPTB2() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập hệ số a: ");
		double a = scanner.nextDouble();
		System.out.print("Nhập hệ số b: ");
		double b = scanner.nextDouble();
		System.out.print("Nhập hệ số c: ");
		double c = scanner.nextDouble();
		if(a==0) {
			if(b==0) {
				if(c==0) {
					System.out.println("Phương trình vô số nghiệm!\n");
				}
				else {
					System.out.println("Phương trình vô nghiệm!\n");
				}
			}
			else {
				System.out.printf("Phương trình có một nghiệm x = %.1f\n",-c/b);
			}
		}
		else {
			double Delta = Math.pow(b,2)-4*a*c;
			double x1;
			double x2;
			if(Delta>0) {
				x1 = (-b+Math.sqrt(Delta))/(2*a);
				x2 = (-b-Math.sqrt(Delta))/(2*a);
				System.out.printf("Phương trình có nghiệm x1 = %.1f và x2 = %.1f\n",x1,x2);
			}
			else if(Delta==0){
				System.out.printf("Phương trình có nghiệm kép x = %.1f\n",-b/(2*a));
			}
			else {
				System.out.println("Phương trình vô nghiệm!\n");
			}
		}
	}
	public static void tinhTienDien() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào số tiền điện sử dụng của tháng:");
		double sodien = sc.nextDouble();
		if(sodien<=50) {
			System.out.printf("Tiền điện là: %.1f\n",sodien*1000);
		}
		else {
			System.out.printf("Tiền điện là: %.1f\n", 50*1000+(sodien-50)*1200);
		}
	}

}
