package com.nelynely.aula02;

import java.util.Scanner;

public class Ex004 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite uma letra: ");
		char letter = scan.next().charAt(0);
		
		switch(letter) {
		
		case 'a':
			System.out.println(String.format("A letra %c é vogal", letter));
			break;
		case 'b':
			System.out.println(String.format("A letra %c é consoante", letter));
			break;
		case 'c':
			System.out.println(String.format("A letra %c é consoante", letter));
			break;
		case 'd':
			System.out.println(String.format("A letra %c é consoante", letter));
			break;
		case 'e':
			System.out.println(String.format("A letra %c é vogal", letter));
			break;
		case 'f':
			System.out.println(String.format("A letra %c é consoante", letter));
			break;
		case 'g':
			System.out.println(String.format("A letra %c é consoante", letter));
			break;
		case 'h':
			System.out.println(String.format("A letra %c é consoante", letter));
			break;
		case 'i':
			System.out.println(String.format("A letra %c é vogal", letter));
			break;
		case 'j':
			System.out.println(String.format("A letra %c é consoante", letter));
			break;
		case 'k':
			System.out.println(String.format("A letra %c é consoante", letter));
			break;
		case 'l':
			System.out.println(String.format("A letra %c é consoante", letter));
			break;
		case 'm':
			System.out.println(String.format("A letra %c é consoante", letter));
			break;
		case 'n':
			System.out.println(String.format("A letra %c é consoante", letter));
			break;
		case 'o':
			System.out.println(String.format("A letra %c é vogal", letter));
			break;
		case 'p':
			System.out.println(String.format("A letra %c é consoante", letter));
			break;
		case 'q':
			System.out.println(String.format("A letra %c é consoante", letter));
			break;
		case 'r':
			System.out.println(String.format("A letra %c é consoante", letter));
			break;
		case 's':
			System.out.println(String.format("A letra %c é consoante", letter));
			break;
		case 't':
			System.out.println(String.format("A letra %c é consoante", letter));
			break;
		case 'u':
			System.out.println(String.format("A letra %c é vogal", letter));
			break;
		case 'v':
			System.out.println(String.format("A letra %c é consoante", letter));
			break;
		case 'w':
			System.out.println(String.format("A letra %c é consoante", letter));
			break;
		case 'x':
			System.out.println(String.format("A letra %c é consoante", letter));
			break;
		case 'y':
			System.out.println(String.format("A letra %c é consoante", letter));
			break;
		case 'z':
			System.out.println(String.format("A letra %c é consoante", letter));
			break;
		default:
			System.out.println("Letra inválida: ");
		}
		
		scan.close();

	}

}
