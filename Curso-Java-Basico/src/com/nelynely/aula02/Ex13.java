package com.nelynely.aula02;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe a primeira nota: ");
		float nota1 = scan.nextFloat();
		
		System.out.println("Informe a segunda nota: ");
		float nota2 = scan.nextFloat();
		
		float media = (nota1 + nota2) / 2;
		
		if(media >= 9.0 && media <= 10.0) {
			
			System.out.println("A " + "Aprovado: ");
			
		} else if(media >= 7.5 && media <= 9.0) {
			
			System.out.println("B " + "Aprovado: ");
			
		} else if(media >= 6.0 && media <= 7.5) {
			
			System.out.println("C " + "Aprovado: ");
			
		} else if(media >= 4 && media <= 6.0) {
			
			System.out.println("D " + "Reprovado: ");
			
		} else if(media >= 0 && media <= 4.0) {
			
			System.out.println("E " + "Reprovado: ");
		}
		
		scan.close();

	}

}
