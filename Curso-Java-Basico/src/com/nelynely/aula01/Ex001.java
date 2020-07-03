package com.nelynely.aula01;

import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor em metros: ");
		
		int numMetro = scan.nextInt();
		
		int numCentimetro = numMetro * 100;
		
		System.out.println(String.format("O valor de %d m em centímetros é %d cm", numMetro, numCentimetro));
		
		scan.close();

	}

}
