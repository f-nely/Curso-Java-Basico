package com.nelynely.aula02;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe o A: ");
		int a = scan.nextInt();
		
		System.out.println("Informe o B: ");
		int b = scan.nextInt();
		
		System.out.println("Informe o C: ");
		int c = scan.nextInt();
		
		double delta = Math.pow(b, 2) - (4*a*c);
		if (delta < 0) {
			System.out.println("Delta negativo: ");
		} else {
			
			System.out.println("delta = " + delta);
			
			double x1 = ((+b) + Math.sqrt(delta) / (2 * a));
			double x2 = ((+b) - Math.sqrt(delta) / (2 * a));
			
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		}
		
		scan.close();

	}

}
