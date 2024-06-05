package vetor;

import java.util.ArrayList;
import java.util.Scanner;

public class AtividadeQuatro0506 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int valor;
		ArrayList<String> carros = new ArrayList<String>();
		

		carros.add("Fusca");
		carros.add("Brasília");
		carros.add("Chevette");
		carros.add("Monza");
		carros.add("Corolla");
		carros.add("Civic");
		carros.add("Jetta");
		carros.add("City");
		carros.add("New city");
		carros.add("Hilux");

		System.out.println("De 0 a 9 qual número você deseja ver para ler o nome do carro");
		valor = ler.nextInt();

			System.out.println(carros.get(valor));
			ler.close();
	}


	
}


