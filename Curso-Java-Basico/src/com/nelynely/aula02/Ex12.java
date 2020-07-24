package com.nelynely.aula02;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor da trabalhada: ");
		int valorHora = scan.nextInt();
		
		System.out.println("Informe a quantidada de horas trabalhadas: ");
		int qtHora = scan.nextInt();
		
		int salarioBruto = valorHora * qtHora;
		
		if(salarioBruto <= 900) {
			
			float desIr = 0;
			float desInss = (float) (salarioBruto * 0.1);
			float desFgts = (float) (salarioBruto * 0.11);
			float totalDesconto = desIr + desInss + desFgts;
			float salarioLiquido = salarioBruto - totalDesconto;
			System.out.println("Salário bruto: " + salarioBruto);
			System.out.println("IR: " + desIr);
			System.out.println("INSS: " + desInss);
			System.out.println("FGTS: " + desFgts);
			System.out.println("Salário Líquido: " + salarioLiquido);
			
		} else if(salarioBruto > 900 && salarioBruto <= 1500) {
			
			float desIr = (float) (salarioBruto * 0.05);
			float desInss = (float) (salarioBruto * 0.1);
			float desFgts = (float) (salarioBruto * 0.11);
			float totalDesconto = desIr + desInss + desFgts;
			float salarioLiquido = salarioBruto - totalDesconto;
			System.out.println("Salário bruto: " + salarioBruto);
			System.out.println("IR: " + desIr);
			System.out.println("INSS: " + desInss);
			System.out.println("FGTS: " + desFgts);
			System.out.println("Salário Líquido: " + salarioLiquido);
		} else if(salarioBruto > 1500 && salarioBruto <= 2500) {
			
			float desIr = (float) (salarioBruto * 0.1);
			float desInss = (float) (salarioBruto * 0.1);
			float desFgts = (float) (salarioBruto * 0.11);
			float totalDesconto = desIr + desInss + desFgts;
			float salarioLiquido = salarioBruto - totalDesconto;
			System.out.println("Salário bruto: " + salarioBruto);
			System.out.println("IR: " + desIr);
			System.out.println("INSS: " + desInss);
			System.out.println("FGTS: " + desFgts);
			System.out.println("Salário Líquido: " + salarioLiquido);
		} else if(salarioBruto > 2500) {
			
			float desIr = (float) (salarioBruto * 0.2);
			float desInss = (float) (salarioBruto * 0.1);
			float desFgts = (float) (salarioBruto * 0.11);
			float totalDesconto = desIr + desInss + desFgts;
			float salarioLiquido = salarioBruto - totalDesconto;
			System.out.println("Salário bruto: " + salarioBruto);
			System.out.println("IR: " + desIr);
			System.out.println("INSS: " + desInss);
			System.out.println("FGTS: " + desFgts);
			System.out.println("Salário Líquido: " + salarioLiquido);
		}
		
		
		
		scan.close();

	}

}
