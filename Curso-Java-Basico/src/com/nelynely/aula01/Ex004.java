package com.nelynely.aula01;

import java.util.Scanner;

public class Ex004 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe a temperatura em Farenheit: ");
		
		float far = scan.nextFloat();
		
		float celsius = (5 * (far - 32 ) /9);
		
		System.out.println("A temperatura em Celsius é: " + Math.round(celsius));
		
		scan.close();

	}

}
