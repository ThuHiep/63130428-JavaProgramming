package ThuHiep;
import java.util.*;
public class Lab5Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<Double>();
		double sum =0;
		while(true) {
			double x = scanner.nextDouble();
			list.add(x);
			sum+=x;
			System.out.println("Nhập thêm Y/N?");
			char c = scanner.next().charAt(0);
			if(c == 'N' || c == 'n' ) {
				break;
			}
		}
		System.out.println("Danh sách vừa nhập là: ");
		for(Double d:list) System.out.println(d+" ");
		System.out.println("Tổng các sô thực là: " + sum);
	}

}
