package vetor;

import java.util.ArrayList;
import java.util.Random;

public class Atividade0506 {

	public static void main(String[] args) {
		int soma = 0; 

		ArrayList<Integer> numeros = new ArrayList<>();

		Random random = new Random();

		for (int i = 0; i < 5; i ++) {
			int numeroAleatorio = random.nextInt(100); 
			numeros.add(numeroAleatorio);

			if (numeroAleatorio %2 == 0) {
				soma += numeroAleatorio;
			}
			else {}


		}
		for (int i : numeros) {
			System.out.println(i);

		}
		System.out.println("A soma dos números pares é:" +soma);
	}


}


