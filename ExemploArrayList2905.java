package vetor;

import java.util.ArrayList;

public class ExemploArrayList2905 {

	public static void main(String[] args) {
		// Criando um ArrayList com números inetiros;
		ArrayList<Integer> numeros = new ArrayList<>();
		
		numeros.add(10);//Adicionando elementos do ArrayList
		numeros.add(20);
		
		System.out.println(numeros.get(0)); // Saída: 10// Acessando elementos do ArrayList
		System.out.println(1); // Saída: 20
		
		numeros.set(1, 25);
		System.out.println(numeros.get(1)); // Saída: 25 // Modificando um elemento do ArrayList
		
		numeros.remove(0);
		System.out.println(numeros.get(0)); // Saída: 25 // Removendo um elemento do ArrayList
		
		System.out.println(numeros.size()); // Saída // Obtendo o tamanho do ArrayList
	}

}
