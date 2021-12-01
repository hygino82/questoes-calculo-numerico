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

	public static double termoGeral(int x) {
		return 2 * x - 1;
	}

	public static void questao01() {
		Scanner sc = new Scanner(System.in);
		int n = 0;// inicializa a variável
//		while (n <= 0) {
//			System.out.print("Informe o número de elementos -> ");
//			n = sc.nextInt();
//		}
		n = 5;// temporario

		List<Integer> listaDenominador = new ArrayList<>();
		listaDenominador.add(1);
		for (int i = 1; i < n; i++) {
			int valor = 2 * listaDenominador.get(i - 1) + 1;
			listaDenominador.add(valor);
		}
		System.out.println("Lista de denominadores");
		for (int x : listaDenominador) {
			System.out.printf("%d\t", x);
		}
		System.out.println();

//		List<Integer> listaNumerador = new ArrayList<>();
//		for (int i = 1; i <= n; i++) {
//			int valor = fatorial(i);
//			listaDenominador.add(valor);
//		}
//
//		System.out.println("Lista de numeradores");
//		for (int y : listaNumerador) {
//			System.out.printf("%d\t", y);
//		}
		System.out.println("Lista de numeradores");
		for (int i = 0; i <= n; i++) {
			if (i % 2 != 0)
				System.out.printf("%d\t", -fatorial(i));
			else
				System.out.printf("%d\t", fatorial(i));
		}
		System.out.println();
		sc.close();
	}

	public static void main(String[] args) {
		questao01();
		System.out.println(fatorial(6));
	}

}
