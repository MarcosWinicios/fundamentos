package desafios.megaCena;

import java.util.Arrays;
import java.util.Scanner;

public class MegaCena {

	public static final int NUMERO_MAXIMO = 60;
	public static final int QUANTIDADE_NUMEROS = 6;
	private int[] numerosSorteados;
	private int[][] jogosGerados;
	private int[] numerosJogoVencedor;
	private int jogoVencedor;
	private int quantidadeDeAcertosVencedor;
	private boolean houveVencedor;

	public void exibirVencedor() {
		this.descobrirVencedor();
		String resposta = "";
		
		if (!this.houveVencedor) {
			resposta = "Não houve Vencedor!";
		} else {
			resposta = "Jogo " + jogoVencedor + ": " + this.arrayParaString(numerosJogoVencedor) + "\n"
					+ "Quantidade de Acertos: " + this.quantidadeDeAcertosVencedor;
		}
		System.err.println(resposta);
	}

	private void descobrirVencedor() {
		int[] quantidadeDeAcertosDeCadaJogo = new int[this.jogosGerados.length];
		
		for (int i = 0; i < jogosGerados.length; i++) {
			int quantidadeDeAcertos = this.contarAcertos(jogosGerados[i]);
			quantidadeDeAcertosDeCadaJogo[i] = quantidadeDeAcertos;
		}

		int posicaoJogoVencedor = descobrirMaiorPosicao(quantidadeDeAcertosDeCadaJogo);
		this.quantidadeDeAcertosVencedor = quantidadeDeAcertosDeCadaJogo[posicaoJogoVencedor];

		if (this.quantidadeDeAcertosVencedor == 0) {
			this.houveVencedor = false;
		} else {
			this.houveVencedor = true;
			this.jogoVencedor = posicaoJogoVencedor + 1;
			this.numerosJogoVencedor = jogosGerados[posicaoJogoVencedor];
		}
	}

	private int descobrirMaiorPosicao(int[] array) {
		int maior = 0;
		int posicao = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maior) {
				maior = array[i];
				posicao = i;
			}
		}
		return posicao;
	}

	private int contarAcertos(int[] jogo) {
		int quantidadeAcertos = 0;
		for (int i = 0; i < jogo.length; i++) {
			boolean encontrou = this.exists(this.numerosSorteados, jogo[i]);
			if (encontrou) {
				quantidadeAcertos++;
			}
		}

		return quantidadeAcertos;
	}

	public void exibirNumerosSorteados() {
		String resposta = this.arrayParaString(this.numerosSorteados);
		System.out.println(resposta);
	}

	public void exibirJogosGerados() {
		String resposta = this.matrizParaString(jogosGerados);
		System.out.println(resposta);
	}

	public void gerarJogos(int quantidadeDeJogos) {
		int[][] jogos = new int[quantidadeDeJogos][QUANTIDADE_NUMEROS];

		for (int i = 0; i < jogos.length; i++) {
			int[] jogo = gerarJogo();
			jogos[i] = jogo;
		}
		this.jogosGerados = jogos;
	}

	public void sortearNumeros() {
		this.numerosSorteados = this.gerarJogo();
	}

	private int[] gerarJogo() {
		int[] jogo = new int[QUANTIDADE_NUMEROS];
		int numero = 0;
		int i = 0;

		while (i < QUANTIDADE_NUMEROS) {
			numero = (int) (Math.random() * NUMERO_MAXIMO);
			if (numero > 0 && numero <= NUMERO_MAXIMO) {
				if (!exists(jogo, numero)) {
					jogo[i] = numero;
				}
			}

			if (!exists(jogo, 0)) {
				i++;
			}
		}
		return jogo;
	}

	private boolean exists(int[] ints, int k) {
		Arrays.sort(ints);
		int inicio = 0;
		int fim = ints.length - 1;
		int meio;
		boolean encontrou = false;

		while (inicio <= fim) {
			meio = (int) ((inicio + fim) / 2);
			if (ints[meio] == k) {
				encontrou = true;
				break;
			} else if (ints[meio] < k) {
				inicio = meio + 1;
			} else {
				fim = meio - 1;
			}
		}
		if (encontrou) {
			return true;
		} else {
			return false;
		}
	}

	public int[] numerosSorteaveis() {
		int[] numeros = new int[NUMERO_MAXIMO];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 1;
		}

		return numeros;
	}

	private String arrayParaString(int[] array) {
		return Arrays.toString(array);
	}

	private String matrizParaString(int[][] array) {
		String resposta = "";
		for (int i = 0; i < array.length; i++) {
			String jogo = "";
			jogo += this.arrayParaString(array[i]);
			resposta += "Jogo " + (i + 1) + ": " + jogo + "\n";
		}
		return resposta;
	}
}
