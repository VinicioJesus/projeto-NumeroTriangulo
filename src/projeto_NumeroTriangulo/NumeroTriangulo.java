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
			System.out.println(" o N�mero maior �: " + a);
		} else if (b > c) {
			System.out.println(" o N�mero maior �: " + b);
		} else {
			System.out.println(" o N�mero maior �: " + c);
		}

		if (a < b && a < c) {
			System.out.println(" o N�mero menor �: " + a);
		} else if (b < c) {
			System.out.println(" o N�mero menor �: " + b);
		} else {
			System.out.println(" o N�mero menor �: " + c);
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
				System.out.println("EQUIL�TERO");
			} else if (A != B && B != C && C != A) {
				System.out.println("IS�CELES");
			} else {
				System.out.println("EQUIL�TERO");
			}
		} else {
			System.out.print(" Sinto muito, n�o � um tri�ngulo!");
		}
	}
}
