package com.nelynely.aula02;

import java.util.Scanner;

public class Ex009 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.println("Informe o primeiro número: ");
		int n1 = scan.nextInt();
		
		System.out.println("Informe o segundo número: ");
		int n2 = scan.nextInt();
		
		System.out.println("Informe o terceiro número: ");
		int n3 = scan.nextInt();
		
		if((n1 > n3) && (n1 > n2)) {
			System.out.println(n1);
		} else if((n2 > n1 && n2 > n3)) {
			System.out.println(n2);
		} else if((n3 > n1) && (n3 > n2)) {
			System.out.println(n3);
		}
		if((n1 > n2) && (n1 < n3) || (n1 < n2) && (n1 > n3)) {
			System.out.println(n1);
		} else if((n2 > n1) && (n2 < n3) || (n2 < n1) && (n2 > n3)) {
			System.out.println(n2);
		} else if((n3 > n1) && (n3 < n2) || (n3 < n1) && (n3 > n2)) {
			System.out.println(n3);
		}
		if((n1 < n2) && (n1 < n3)) {
			System.out.println(n1);
		} else if((n2 < n1) && (n2 < n3)) {
			System.out.println(n2);
		} else if((n3 < n1) && (n3 < n2)) {
			System.out.println(n3);
		} 
		
		else{
			System.out.println("Todos os número são iguais: ");
		}
		
		scan.close();


	}

}
