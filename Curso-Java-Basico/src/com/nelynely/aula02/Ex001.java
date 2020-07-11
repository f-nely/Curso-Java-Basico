package com.nelynely.aula02;

import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Informe o primeiro número: ");
		int n1 = scan.nextInt();
		
		System.out.println("Informe o primeiro número: ");
		int n2 = scan.nextInt();
		
		if(n1 > n2) {
			System.out.println(String.format("%d é maior que %d", n1, n2));
		} else if(n2 > n1) {
			System.out.println(String.format("%d é maior que %d", n2, n1));
		} else {
			System.out.println(String.format("%d é igual a %d", n1, n2));
		}
		scan.close();

	}

}
