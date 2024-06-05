package vetor;

import java.util.ArrayList;

public class AtividadeDois0506 {

	public static void main(String[] args) {
		ArrayList<Integer> valor = new ArrayList <>();
		int soma = 0;

		valor.add(7);
		valor.add(-9);
		valor.add(30);
		valor.add(-38);
		valor.add(13);

		for (int i : valor) {
			if (i<0) {
			soma += i;
		}
		
	}
		System.out.println("O resultado da soma dos números negativos é:" + soma);
}

	}


