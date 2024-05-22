package vetor;

import java.util.Scanner;

public class Atividade2205 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[] = new int [5];
		int soma=0;


		for (int i =0; i<+5; i++) {
			System.out.println("Informe um valor :" );
			a[i]= ler.nextInt();

			soma = soma +a[i];

		}
			if (soma>30) {
				System.out.println("O valor é maior que 30, a soma é = " +soma);
			}
			else {
				System.out.println("O valor é menor que 30, a soma é = " +soma);
			}
			ler.close();
		}
}
