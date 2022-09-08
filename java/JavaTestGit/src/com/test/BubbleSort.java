package com.test;

public class BubbleSort {

	static void sort(int[] a) {
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = a.length - 1; j > i; j--) {
				
				if(a[j] < a[j-1]) {
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {9, 3, 4, 5, 7};
		
		sort(a);
	}

}
