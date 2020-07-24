package com.nelynely.aula02;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o primeiro lado: ");
		int l1 = scan.nextInt();

		System.out.println("Informe o primeiro lado: ");
		int l2 = scan.nextInt();

		System.out.println("Informe o primeiro lado: ");
		int l3 = scan.nextInt();

		if (((l1 + l2) > l3) && ((l1 + l3) > l2) && ((l2 + l3) > l1)) {

			if ((l1 == l2) && (l3 == l1)) {

				System.out.println("Triângulo equilátero: ");

			} else if ((l1 != l2) && (l2 != l3) && (l1 != l3)) {

				System.out.println("Triângulo escaleno: ");

			} else if ((l1 == l2) || (l2 == l3) || (l1 == l3)) {

				System.out.println("Triângulo Isósceles: ");

			}

		} else {

			System.out.println("Não é um triângulo: ");

		}

		scan.close();


	}

}
