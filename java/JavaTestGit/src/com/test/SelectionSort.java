package com.test;

public class InsertionSort {

	static int[] sort(int[] a) {
		
		int iMin = 0;
		//int iMinValue = a[0];
		for (int i = 0; i < a.length; i++) {
			iMin = i;
			for(int j = i+1 ; j < a.length ; j++) {
				
				if(a[iMin] > a[j]) {
					iMin = j;
					
				}
			}
			
			int temp = a[i];
			a[i] = a[iMin];
			a[iMin] = temp;
			
		}
		
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {9, 3, 4, 5, 7};
		
		int[] b = sort(a);
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(a[i] + " ");
		}
		
	}

}
