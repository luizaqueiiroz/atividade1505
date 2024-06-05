package vetor;

import java.util.ArrayList;

public class ExercicioTres0506 {

	public static void main(String[] args) {
		ArrayList<String> frutas = new ArrayList<String>();

		frutas.add("banana");
		frutas.add("maçã");
		frutas.add("morango");
		frutas.add("Melancia");
		frutas.add("pera");
		frutas.add("amora");
		frutas.add("laranja");
		frutas.add("jabuticaba");
		frutas.add("uva");
		frutas.add("melão");
		
		System.out.println(frutas);
		
		frutas.remove(6);
		frutas.remove(3);
		frutas.remove(2);
		frutas.remove(1);
		frutas.remove(4);
		
		
		System.out.println(frutas);
		System.out.println(frutas.size());

	}



}
