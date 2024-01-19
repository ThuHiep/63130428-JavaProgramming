/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class Lab1Bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập chiều dài của hình chữ nhật: ");
		double cDai = scanner.nextDouble();
		System.out.print("Nhập chiều rộng của hình chữ nhật: ");
		double cRong = scanner.nextDouble();
		double CV = (cDai+cRong)*2;
		double DT = cDai*cRong;
		System.out.printf("Chu vi hình chữ nhật: %.1f\n",CV);
		System.out.printf("Diện tích hình chữ nhật: %.1f\n",DT);
		System.out.printf("Cạnh nhỏ nhất của hình chữ nhật: %.1f",Math.min(cDai, cRong));
		

	}

}
