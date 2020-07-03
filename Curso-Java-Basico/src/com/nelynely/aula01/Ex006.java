package com.nelynely.aula01;

import java.util.Scanner;

public class Ex006 {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe a altura: ");
		double altura = scan.nextDouble();
		
		double pesoIdeal = (72.7 * altura) - 58;
		
		System.out.println("Seu peso ideal é: " + Math.round(pesoIdeal));
		
		scan.close();

	}

}
