package com.nelynely.aula01;

import java.util.Scanner;

public class Ex005 {

	public static void main(String[] args) {
		
Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe o primeiro número: ");
		int num1 = scan.nextInt();
		
		System.out.println("Informe o segundo número: ");
		int num2 = scan.nextInt();
		
		System.out.println("Informe o terceiro número: ");
		double num3 = scan.nextDouble();
		
		int a = (num1 + num1) * (num2 / 2);
		System.out.println(String.format("O produto de %d com metade de %d é %d ", num1, num2, a));
		
		double b = (num1 * 3) + num3;
		System.out.println(String.format("A soma do triplo de %d com o %.2f é %.2f ", num1, num3, b));
		
		double c = Math.pow(num3, 3);
		System.out.println(String.format("O %.2f elevado ao cubo é: %.2f ", num3, c));
		
		scan.close();

	}

}
