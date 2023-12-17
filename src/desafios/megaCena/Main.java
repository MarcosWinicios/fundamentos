package desafios.megaCena;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int quantidadeDeJogos = iniciarPrograma();
		
		MegaCena mega = new MegaCena();
		
		mega.gerarJogos(quantidadeDeJogos);
		mega.exibirJogosGerados();
		realizarSorteio(mega);
		obterVencedor(mega);

	}
	
	public static int iniciarPrograma() {
		Scanner input = new Scanner(System.in);
		System.out.print("Quantos Jogos? ");
		int qnt = input.nextInt();
		input.close();
		return qnt;
	}
	
	public static void realizarSorteio(MegaCena mega) {
		System.out.println("Sorteando...");
		System.out.println("* * * * * * * * * ");
		System.out.println("Números Sorteados: ");
		mega.sortearNumeros();
		mega.exibirNumerosSorteados();
		System.out.println("* * * * * * * * * \n");
	}
	
	public static void obterVencedor(MegaCena  mega) {
		System.out.println("_________________");
		System.out.println("E o vencedor é: ");
		mega.exibirVencedor();
		
	}
}
