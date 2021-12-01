package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

	public static Integer fatorial(int x) {
		Integer fat = 1;
		for (int i = 1; i <= x; i++) {
			fat *= i;
		}
		return fat;
	}

	public static void testaSequencia() {
		List<Integer> listaDenominador = new ArrayList<>();
		listaDenominador.add(1);
		for (int i = 1; i <= 5; i++) {
			int valor = 2 * listaDenominador.get(i - 1) + 1;
			listaDenominador.add(valor);
		}
		for (int i = 1; i <= 5; i++) {
			System.out.printf("%d / %d\n", fatorial(i), listaDenominador.get(i - 1));
		}
	}

	public static void questao01() {
		Scanner sc = new Scanner(System.in);
		int n = 0;// inicializa a variável
		while (n <= 0) {
			System.out.print("Informe o número de elementos -> ");
			n = sc.nextInt();
		}
		// n = 5;
		List<Integer> listaDenominador = new ArrayList<>();
		listaDenominador.add(1);// cada elemento do denominador será o dobro do anterior mais um

		for (int i = 1; i < n; i++) {
			int valor = 2 * listaDenominador.get(i - 1) + 1;
			listaDenominador.add(valor);
		}

		double soma = 0.0;

		for (int j = 1; j <= n; j++) {
			if (j % 2 == 0) {
				soma -= (double) fatorial(j) / listaDenominador.get(j - 1);
				System.out.printf("-%d / %d\n", fatorial(j), listaDenominador.get(j - 1));
			} else {
				soma += (double) fatorial(j) / listaDenominador.get(j - 1);
				System.out.printf("+%d / %d\n", fatorial(j), listaDenominador.get(j - 1));
			}
		}
		System.out.println(soma);
		sc.close();
	}

	public static void questao02() {
		Scanner sc = new Scanner(System.in);
		double a, b, c;
		System.out.print("Informe a medida do ângulo A -> ");
		a = sc.nextDouble();
		System.out.print("Informe a medida do ângulo B -> ");
		b = sc.nextDouble();
		System.out.print("Informe a medida do ângulo C -> ");
		c = sc.nextDouble();
		if ((a + b + c != 180) || (a <= 0.0) || (b <= 0.0) || (c <= 0.0)) {
			System.out.println("Os ângulos informados não correspondem a ângulos internos de um triângulo");
		} else {
			if ((a > 90.0) || (b > 90.0) || (c > 90.0)) {
				System.out.println("O triângulo é obtusãngulo");
			} else if ((a == 90.0) || (b == 90.0) || (c == 90.0)) {
				System.out.println("O triângulo é retãngulo");
			} else {
				System.out.println("O triângulo é acutângulo");
			}

		}
		sc.close();

	}

	public static void main(String[] args) {

		// questao01();
		questao02();

	}

}
