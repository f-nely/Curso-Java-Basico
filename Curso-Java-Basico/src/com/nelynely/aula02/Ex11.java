package com.nelynely.aula02;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o sálario: ");
		float salario = scan.nextFloat();
		
		float NovoSalario = 0;
		float aumento = 0;
		
		if(salario <= 280) {
			aumento = (float) (salario * 0.2);
			NovoSalario = salario + aumento;
			System.out.println("O salário atual é: " + salario);
			System.out.println("O aumento foi de: " + aumento);
			System.out.println("O novo salário é: " + NovoSalario);
		} else if(salario > 280 && salario <= 700) {
			aumento = (float) (salario * 0.15);
			NovoSalario = salario + aumento;
			System.out.println("O salário atual é: " + salario);
			System.out.println("O aumento foi de: " + aumento);
			System.out.println("O novo salário é: " + NovoSalario);

		} else if(salario > 700 && salario <= 1500) {
			aumento = (float) (salario * 0.1);
			NovoSalario = salario + aumento;
			System.out.println("O salário atual é: " + salario);
			System.out.println("O aumento foi de: " + aumento);
			System.out.println("O novo salário é: " + NovoSalario);

		} else {
			aumento = (float) (salario * 0.05);
			NovoSalario = salario + aumento;
			System.out.println("O salário atual é: " + salario);
			System.out.println("O aumento foi de: " + aumento);
			System.out.println("O novo salário é: " + NovoSalario);
			
		}
		
		scan.close();

	}

}
