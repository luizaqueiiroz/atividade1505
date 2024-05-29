package vetor;

import java.util.ArrayList;

public class Atividade2905 {

	public static void main(String[] args) {
		ArrayList<Integer> cinco = new ArrayList <>();
		int soma = 0;

		cinco.add(7);
		cinco.add(9);
		cinco.add(30);
		cinco.add(24);
		cinco.add(13);

		for (int i : cinco) {
			soma += i;
		}
		System.out.println("O resultado da soma é:" + soma);
	}

}
