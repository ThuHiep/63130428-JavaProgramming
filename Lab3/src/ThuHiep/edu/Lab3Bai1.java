/**

 * 
 */
package ThuHiep.edu;

/**
 * 
 */
import java.util.*;
public class Lab3Bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập N:");
		int N = scanner.nextInt();
		boolean ok = true;
		for(int i=2;i<N-1;i++) {
			if(N%i==0) {
				ok=false;
				break;
			}
		}
		if(ok && N>1) System.out.printf("%d là số nguyên tố",N);
		else System.out.printf("%d  không phải là số nguyên tố",N);
		
	}


}
