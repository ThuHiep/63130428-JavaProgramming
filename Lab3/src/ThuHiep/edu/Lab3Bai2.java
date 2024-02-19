/**
 * 
 */
package ThuHiep.edu;

import java.util.Scanner;

/**
 * 
 */
public class Lab3Bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=8;
		for(int i=1;i<=10;i++) {
			System.out.printf("%d x %d = %d\n",x,i,x*i);
		}
		for(int g=1;g<=9;g++) {
			for(int h=1;h<=10;h++) {
				System.out.printf("%d x %d = %d",g,h,g*h);
				System.out.println();
			}
		}

	}

}
