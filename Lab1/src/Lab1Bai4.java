/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class Lab1Bai4 {

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
		double Delta = Math.pow(b,2)+4*a*c;
		System.out.printf("%.1f", Math.sqrt(Delta));
		
	}

}
