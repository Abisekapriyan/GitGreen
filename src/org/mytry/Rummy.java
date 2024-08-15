package org.mytry;

import java.util.Scanner;

public class Rummy {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int rounds = 0;
		int abiTotal = 0;
		int jaiTotal = 0;
		int vajiTotal = 0;
		int sanjayTotal = 0;
		System.out.println("enter tha number of match : ");
		rounds = s.nextInt();
		for (int round = 0; round < rounds; round++) {
			System.out.println("rounds  >>> "+round+" <<<");
			
			System.out.println("Abi score = ");
			int abi = s.nextInt();
			abiTotal +=abi;
			System.out.println("jai score = ");
			int jai = s.nextInt();
			jaiTotal +=jai;
			System.out.println("vaji score = ");
			int vaji = s.nextInt();
			vajiTotal += vaji;
			System.out.println("Sanjay score = ");
			int sanjay = s.nextInt();
			sanjayTotal += sanjay;
			
			System.out.println("total Round :" + "abi Total Score " + abiTotal+" :   jaiTotal  ="+jaiTotal+"     vajib Total  ="+vajiTotal+"       Sanjay Total = "+sanjayTotal);
			

			}
		if (abiTotal<jaiTotal & abiTotal<vajiTotal & abiTotal<sanjayTotal) {
			System.out.println("abi is winer");
			
		}
		if (jaiTotal<abiTotal & jaiTotal <vajiTotal & jaiTotal<sanjayTotal) {
			System.out.println("Jai is Winner");
		}
		if (vajiTotal<abiTotal & vajiTotal <jaiTotal & vajiTotal<sanjayTotal) {
			System.out.println("vaji  is Winner");
		}
		if (sanjayTotal<abiTotal & sanjayTotal <vajiTotal & sanjayTotal<jaiTotal) {
			System.out.println("sanjay is Winner");
			
			
		}
		
		
	}

}
