package estruturadedados.matrizes.exercicios;

import java.util.Arrays;
import java.util.Random;

/*
 * Gerar uma matriz M 10X10 com valores aleatórios entre 0-9.
 * Após isso indique qual é o maior e o menor valor da linha 5 e
 * qual é o maior e o menor valor da coluna 7.
 */
public class ManipulacaoDeLinhas {

	public static void main(String[] args) {
		int[][] matriz = new int[10][10];
		matriz = gerarMatriz(matriz);
		int numLinha = 5;
		int numColuna = 7;
		imprimirMatriz(matriz);
		System.out.println("Tamanho da Matriz: " + matriz.length + "X" + matriz.length);
		imprimirIformacoesDaLinha(matriz, numLinha);
		System.out.println("___________________________________");
		imprimirInformacoesDaColuna(matriz, numColuna);
		
		
		
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
		String mensagem = new String();
		
		System.out.println();
		System.out.print("Colunas | ");
		
		//Printar indice Colunas
		for(int i = 0; i < matriz.length; i++) {
			if( i < 9) {
				mensagem = " |";
			}else {
				mensagem = "|";
			}
			System.out.print(i+1 + mensagem);
			
		}
		System.out.println();
		System.out.print("");
		for(int i = 0; i < matriz.length; i++) {
			System.out.print("____");
		}
		System.out.println();
		
		
		//Printar indice Linhas
		for(int i = 0; i < matriz.length; i++) {
			if( i < 9) {
				mensagem = "Linha ";
			}else {
				mensagem = "Linha";
			}
			System.out.print(mensagem + ":" + (i + 1) + "| ");
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print((matriz[i][j]) + " |");
			}
			System.out.println();
		}
		for(int i = 0; i < matriz.length; i++) {
			System.out.print("____");
		}
		System.out.println();
		System.out.println();
	}
	
	public static int[] pegarLinha(int[][] matriz, int linha) {
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
	
	public static int pegarMaiorValor(int[] array) {
		int maior = 0;
//		Arrays.sort(array);
//		maior = array[array.length -1];
//		System.out.println("Maior Valor Pego com SORT: " + maior);
		for(int i = 0; i < array.length; i++) {
			if(array[i] > maior) {
				maior = array[i];
			}
		}
		return maior;
	}
	
	 public static int pegarMenorValor(int[] array, int maior) {
		 int menor = maior; 
//		 Arrays.sort(array);
//		 menor = array[0];
		 for(int i = 0; i < array.length; i++) {
			 if(array[i] < menor) {
				 menor = array[i];
			 }
		 }
		 return menor;
	 }
	 
	 public static void imprimirIformacoesDaLinha(int[][] matriz, int numLinha) {
		int maior, menor;
		int[] linha = pegarLinha(matriz, numLinha);
		maior = pegarMaiorValor(linha);
		menor = pegarMenorValor(linha,maior);
		
		System.out.println("LINHA\n\nValores da Linha " + numLinha);
		System.out.println("\n" + Arrays.toString(linha));
		
		System.out.print("\nMAIOR valor da linha " + numLinha + ": " + maior);
		System.out.print("\nMENOR valor da linha " + numLinha + ": " + menor + "\n");
		System.out.println();
	 }
	 
	 public static int[] pegarColuna(int[][] matriz, int numColuna) {
		 int[] coluna = new int[matriz.length];
		 
		 for(int i = 0; i < matriz.length; i++) {
			 for(int j = 0; j < matriz[i].length; j++) {
				 if(j == numColuna -1) {
					 coluna[i] = matriz[i][j];
				 }
			 }
		 }
		 return coluna;
	 }
	 
	 public static void imprimirInformacoesDaColuna(int[][] matriz, int numColuna) {
		 int[] coluna = pegarColuna(matriz, numColuna);
			
		 System.out.println("COLUNA\n\nValores da coluna: " + numColuna);
		 System.out.println("\n" + Arrays.toString(coluna));
		 int maior, menor;
		 maior = pegarMaiorValor(coluna);
		 menor = pegarMenorValor(coluna, maior);
			
		 System.out.print("\nMAIOR valor da Coluna " + numColuna + ": " + maior);
		 System.out.print("\nMENOR valor da Coluna " + numColuna + ": " + menor + "\n");
		 System.out.println();
	 }
}
