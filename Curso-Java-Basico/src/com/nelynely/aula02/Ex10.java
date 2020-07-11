package com.nelynely.aula02;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Informe o turno: ");
		
		char turno = scan.next().charAt(0);
		
		switch(turno) {
		case 'M':
			System.out.println("Bom dia: ");
			break;
		case 'V':
			System.out.println("Boa tarde: ");
			break;
		case 'N':
			System.out.println("Boa noite: ");
			break;
		default:
			System.out.println("Valor inválido: ");
		}
		
		scan.close();

	}

}
