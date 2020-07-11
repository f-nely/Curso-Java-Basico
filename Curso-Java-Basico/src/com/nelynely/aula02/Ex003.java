package com.nelynely.aula02;

import java.util.Scanner;

public class Ex003 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite o sexo: ");
		char s = scan.next().charAt(0);
		
		if(s == 'F') {
			System.out.println("F - Feminino");
		} else if(s == 'M') {
			System.out.println("M - Masculino");
		} else {
			System.out.println("Sexo inválido: ");
		}
		scan.close();
	}
}
