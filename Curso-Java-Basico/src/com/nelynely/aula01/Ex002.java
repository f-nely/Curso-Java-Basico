package com.nelynely.aula01;

import java.util.Scanner;

public class Ex002 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o raio do círculo: ");
		int raio = scan.nextInt();
		
		double area = Math.PI * Math.pow(raio, 2);
		//Math.round(area);
		System.out.println(String.format("A área do círculo é %.2f cm²", area));
		scan.close();
		

	}

}
