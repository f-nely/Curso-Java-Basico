package com.nelynely.aula01;

import java.util.Scanner;

public class Aula01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome: ");
		String nome = scan.next();
		System.out.println("Seu primeiro nome é: " + nome);
		
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade);
		
		System.out.println("Digite sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("Sua idade é: " + altura);
		
		scan.close();

	}

}
