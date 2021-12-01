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
		//n = 5;
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
		
	}

	public static void main(String[] args) {

		questao01();
		double valor = 1 - 2. / 3 + 6. / 7 - 24. / 15 + 120. / 31;
		System.out.println(valor);
	}

}
