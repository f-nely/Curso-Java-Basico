package com.nelynely.aula02;

import java.util.Scanner;

public class Ex002 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Informe um número: ");
		int n = scan.nextInt();
		
		if(n >= 0) {
			System.out.println(String.format("%d é positivo", n));
		} else {
			System.out.println(String.format("%d é negativo", n));
		}
		scan.close();

	}

}
