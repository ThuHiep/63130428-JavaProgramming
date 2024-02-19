/**
 * 
 */
package ThuHiep.edu;

import java.util.Scanner;

/**
 * 
 */
public class Lab3Bai4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số lượng sinh viên:");
		int n= scanner.nextInt();
		 scanner.nextLine();
		String[] names = new String[n];
		double[] diem = new double[n];
		for(int i=0;i<n;i++) {
			System.out.printf("Nhập sinh viên thứ %d:\n",i);
			System.out.println("Họ và tên: ");
			names[i]= scanner.nextLine();
			System.out.println("Điểm: ");
			diem[i]= scanner.nextDouble();
			 scanner.nextLine();
		}
		// xuat thong tin sinh vien và học lực
		System.out.println("THÔNG TIN SINH VIÊN");
		for(int i=0;i<n;i++) {
			System.out.printf("Sinh viên thứ %d:",i);
			System.out.printf("Họ và tên: %s\n",names[i]);
			System.out.printf("Điểm: %.2f\n",diem[i]);
			System.out.printf("Học lực: %s\n",xeploai(diem[i]));
		}
		// Sắp xếp danh sách sinh viên tăng dần theo điểm
        Sapxep(names, diem);
        
        // Xuất danh sách sinh viên sau khi sắp xếp
        System.out.println("\nDanh sách sinh viên sau khi sắp xếp:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Họ và tên: %s\n",names[i]);
            System.out.printf("Điểm: %.2f\n",diem[i]);
        }
		
		

	}
	//phuong thuc xep loai hoc luc
	public static String xeploai(double diem) {
		if (diem < 5) {
            return "Yếu";
        } else if (diem < 6.5) {
            return "Trung bình";
        } else if (diem < 7.5) {
            return "Khá";
        } else if (diem < 9) {
            return "Giỏi";
        } else {
            return "Xuất sắc";
        }
	}
	//phuong thuc sap xep sinh vien tang dan theo deim
	public static void Sapxep(String[] names,double diem[]) {
		int n = names.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (diem[j] > diem[j + 1]) {
                    // Hoán đổi họ tên
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                    
                    // Hoán đổi điểm
                    double tempScore = diem[j];
                    diem[j] = diem[j + 1];
                   diem[j + 1] = tempScore;
                }
            }
        }
	}

}
