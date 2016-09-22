package qa6.arrays;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		int[] a = new int[] {1, 3, -5, 20, 4, -33, 102};
		
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		for (int el : a) {
			System.out.print( el + " ");
		}
		
		System.out.println();
		
		int[] b = new int[] {-2, -100, 24, 14, 17, 425, 2};
		
		for (int i = 0; i < b.length - 1; i++) {
			for (int j = i; j < b.length; j++) {
				if (b[i] > b[j]) {
					int temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
		
		for (int el : b) {
			System.out.print( el + " ");
		}
		
		System.out.println();
		
		int c[] = new int[] {100, -3, 20, 42, 7, 0, 21, 99};
		
		Arrays.sort(c);
		
		for (int el : c) {
			System.out.print( el + " ");
		}
 	}
}
