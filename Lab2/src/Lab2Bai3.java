/**
 * 
 */

/**
 * 
 */
import java.util.*;
public class Lab2Bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào số tiền điện sử dụng của tháng:");
		double sodien = sc.nextDouble();
		if(sodien<=50) {
			System.out.printf("Tiền điện là: %.1f",sodien*1000);
		}
		else {
			System.out.printf("Tiền điện là: %.1f", 50*1000+(sodien-50)*1200);
		}
	}

}
