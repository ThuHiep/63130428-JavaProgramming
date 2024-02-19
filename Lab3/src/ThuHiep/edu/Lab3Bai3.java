/**
 * 
 */
package ThuHiep.edu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */
public class Lab3Bai3 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số lượng phần tử trong mảng");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		System.out.println("Nhập số lượng phần tử trong mảng");
		for(int i=0;i<n;i++) {
			System.out.printf("Phần tử thứ %d: ",i);
			arr[i]= scanner.nextInt();
		}
		//sap xep mang
		Arrays.sort(arr);
		System.out.printf("Mảng sau khi sắp xếp: %s\n",Arrays.toString(arr));
		//xuat phan tu nho nhat
		int min = arr[0];
		for(int i = 1;i<n;i++) {
			min=Math.min(min, arr[i]);
		}
		System.out.printf("Phần tử nhỏ nhất: %d\n",min);
		//tinh va xuat ra trung binh cong chia het cho 3
		int sum =0;
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]%3==0) {
				sum+=arr[i];
				count++;
			}
		}
		System.out.printf("Trung bình cộng các phần tử chia hết cho 3: %.2f",(double)sum/count);
	}

}
