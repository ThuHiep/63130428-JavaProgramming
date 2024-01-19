/**
 * 
 */

/**
 * 
 */
import java.util.*;
public class Lab2Bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
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
					System.out.println("Phương trình vô số nghiệm!");
				}
				else {
					System.out.println("Phương trình vô nghiệm!");
				}
			}
			else {
				System.out.printf("Phương trình có một nghiệm x = %.1f",-c/b);
			}
		}
		else {
			double Delta = Math.pow(b,2)-4*a*c;
			double x1;
			double x2;
			if(Delta>0) {
				x1 = (-b+Math.sqrt(Delta))/(2*a);
				x2 = (-b-Math.sqrt(Delta))/(2*a);
				System.out.printf("Phương trình có nghiệm x1 = %.1f và x2 = %.1f",x1,x2);
			}
			else if(Delta==0){
				System.out.printf("Phương trình có nghiệm kép x = %.1f",-b/(2*a));
			}
			else {
				System.out.println("Phương trình vô nghiệm!");
			}
		}
	}

}
