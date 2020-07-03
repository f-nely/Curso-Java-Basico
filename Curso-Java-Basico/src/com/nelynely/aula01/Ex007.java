package com.nelynely.aula01;

import java.util.Scanner;

public class Ex007 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe o valor das horas trabalhadas: ");
		float valorHoras = scan.nextFloat();
		
		System.out.println("Informe o número de horas trabalhadas: ");
		int horasTrabalhadas = scan.nextInt();
		
		double salarioBruto = valorHoras * horasTrabalhadas;
		System.out.println("O salário bruto é: " + salarioBruto);
		
		double inss = salarioBruto * 0.08;
		System.out.println("Desconto inss: " + inss);
		double sindicato = salarioBruto * 0.05;
		System.out.println("Desconto sindicato: " + sindicato);
		double imposto = salarioBruto * 0.11;
		System.out.println("Desconto imposto: " + imposto);
		
		double salarioLiquido = (salarioBruto - inss - sindicato - imposto);
		System.out.println("O salário liquido é: " + salarioLiquido);
		
		
		scan.close();

	}

}
