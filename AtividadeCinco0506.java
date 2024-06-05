package vetor;

import java.util.ArrayList;
import java.util.Scanner;

public class AtividadeCinco0506 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num;
		ArrayList<String> ingrediente = new ArrayList<String>();


		ingrediente.add("Banana");
		ingrediente.add("Granola");
		ingrediente.add("Granulado");
		ingrediente.add("Leite condensado");
		ingrediente.add("Leite em pó");
		ingrediente.add("Morango");
		
		System.out.println(ingrediente);
		
		System.out.println("Deseja retirar algum ingrediente do seu açaí? Se sim, digite 0,  se deseja adicionar algo digite 1, se não deseja modificar nada digite 2");
		num = ler.nextInt();
		
		if (num == 0) {
			int rmv;
			System.out.println("Digite o número em que o ingrediente está ordenado para remover: ");
			rmv = ler.nextInt();
			System.out.println(ingrediente.remove(rmv));
			System.out.println("Agora seu açaí será composto por: " + ingrediente);
		}
		else if (num == 1) {
			System.out.println("Digite o que deseja adicionar no seu açaí:");
			ingrediente.add(ler.next());
			System.out.println("Agora seu açaí será composto por: " + ingrediente);
			
		}
		
		else {
			System.out.println("Seu açaí será como o padrão da loja!");
			
		}
		
		ler.close();
		}
	}


