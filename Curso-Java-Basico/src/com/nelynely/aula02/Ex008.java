package com.nelynely.aula02;

import java.util.Scanner;

public class Ex008 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Informe o valor do primeiro produto: ");
		int prod1 = scan.nextInt();
		
		System.out.println("Informe o valor do segundo produto: ");
		int prod2 = scan.nextInt();
		
		System.out.println("Informe o valor do terceiro produto: ");
		int prod3 = scan.nextInt();
		
		if((prod1 < prod2) && (prod1 < prod3)) {
			System.out.println("Compre o 1º produto: ");
		} else if((prod2 < prod1) && (prod2 < prod3)) {
			System.out.println("Compre o 2º produto: ");
		} else if((prod3 < prod1) && (prod3 < prod2)) {
			System.out.println("Compre o 3º produto: ");
		} else {
			System.out.println("Os produtos tem o mesmo preço: ");
		}
		
		scan.close();

	}

}
