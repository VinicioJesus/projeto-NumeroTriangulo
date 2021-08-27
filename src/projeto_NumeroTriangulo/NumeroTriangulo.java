package projeto_NumeroTriangulo;

import java.util.Scanner;

public class NumeroTriangulo {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		double a, b, c;
		double A, B, C;

		System.out.print("Digite o Numero 1: ");
		a = leitor.nextDouble();

		System.out.print("Digite o Numero 2: ");
		b = leitor.nextDouble();

		System.out.print("Digite o Numero 3: ");
		c = leitor.nextDouble();

		

		if (a > b && a > c) {
			System.out.println(" o Número maior é: " + a);
		} else if (b > c) {
			System.out.println(" o Número maior é: " + b);
		} else {
			System.out.println(" o Número maior é: " + c);
		}

		if (a < b && a < c) {
			System.out.println(" o Número menor é: " + a);
		} else if (b < c) {
			System.out.println(" o Número menor é: " + b);
		} else {
			System.out.println(" o Número menor é: " + c);
		}

		System.out.print("Qual a medida do lado A? ");
		A = leitor.nextDouble();

		System.out.print("Qual a medida do lado B? ");
		B = leitor.nextDouble();

		System.out.print("Qual a medida do lado C? ");
		C = leitor.nextDouble();
		
		 leitor.close();

		if (B + A > C && C + B > A && C + A > B) {
			if (A == B && B == C && C == A) {
				System.out.println("EQUILÁTERO");
			} else if (A != B && B != C && C != A) {
				System.out.println("ISÓCELES");
			} else {
				System.out.println("EQUILÁTERO");
			}
		} else {
			System.out.print(" Sinto muito, não é um triângulo!");
		}
	}
}
