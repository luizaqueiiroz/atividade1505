package vetor;

import java.util.ArrayList;
import java.util.Random;

public class Teste {

	public static void main(String[] args) {
		int soma = 0; 

		ArrayList<Integer> numeros = new ArrayList<>();

		Random random = new Random();

		for (int i = 0; i < 5; i ++) {
			int numeroAleatorio = random.nextInt(); 
			numeros.add(numeroAleatorio);

			if (numeroAleatorio < 0) {
				soma += numeroAleatorio;
			}
			else {}


		}
		for (int i : numeros) {
			System.out.println(i);

		}
		System.out.println("A soma dos números negativos é:" +soma);
	}


}
	

