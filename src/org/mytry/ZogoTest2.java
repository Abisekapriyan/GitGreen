package org.mytry;

public class ZogoTest2 {
	public static void main(String[] args) {
		int arr[]= {2,5,8,3,6,7,8,9};
		int x = 4;
		int y = 10;
		if (x<y) {
			int i = 0;
			while (i < arr.length-1) {	
			
			if (arr[i]>x && arr[i] < y) {
				System.out.println(arr[i]);
				
			}
			i++;
			}
		}
		else {
			System.out.println("again to check the code ");
		}
	}

}
