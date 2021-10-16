package estruturadedados.matrizes.exercicios;

import java.util.Arrays;
import java.util.Random;

public class ManipulacaoDeLinhas {

	public static void main(String[] args) {
		int[][] matriz = new int[10][10];
		matriz = gerarMatriz(matriz);
		System.out.println("\n\nTamanho da Matriz: " + matriz.length);
		imprimirMatriz(matriz);
		
		System.out.println(Arrays.toString(pegarLinha(matriz, 5)));

	}
	
	public static int[][] gerarMatriz(int [][] matriz) {
		Random rand =  new Random();
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rand.nextInt(10);
			}
		}
		return matriz;
	}
	
	public static void imprimirMatriz(int[][]matriz) {
		System.out.println();
		for(int i = 0; i < matriz.length; i++) {
			System.out.print("Linha:" + (i + 1) + "| ");
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print((matriz[i][j]) + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static int[] pegarLinha(int[][] matriz, int linha) {
		
		System.out.println("Linha: " + linha);
		int tamanho = matriz.length;
		int[] valoresDaLinha = new int[tamanho];
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(i == linha - 1 ) {
					valoresDaLinha[j] = matriz[i][j];
				}
			}
			
		}
		return valoresDaLinha;
	}
}
