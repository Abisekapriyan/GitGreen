package org.mytry;

public class ZogoTest1 {
	public static void main(String[] args) {
		int[] array= {1,2,3,4,5,6,7,8};
		int sum = 0;
		int big = 0;
		for (int i = 0; i < array.length-1; i++) {
			sum=array[i]+array[i+1];
			if (big<sum) {
				big=sum;
				
			}
		}
		System.out.println(big);
	}

}
