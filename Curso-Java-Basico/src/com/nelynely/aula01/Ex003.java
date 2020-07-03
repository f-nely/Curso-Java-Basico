package com.nelynely.aula01;

import java.util.Scanner;

public class Ex003 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe o valor das horas trabalhadas: ");
		float valorHoras = scan.nextFloat();
		
		System.out.println("Informe o número de horas trabalhadas: ");
		int horasTrabalhadas = scan.nextInt();
		
		float salario = valorHoras * horasTrabalhadas;
		
		System.out.println("O salário é: " + salario);
		
		scan.close();

	}

}
