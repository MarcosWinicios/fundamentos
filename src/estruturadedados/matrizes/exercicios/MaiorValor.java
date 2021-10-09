package estruturadedados.matrizes.exercicios;

import java.util.Random;

public class MaiorValor {

	public static void main(String[] args) {
		//Gerar e imprimir uma Matrix M 4X4 com valores aleatórios entre 0 e 9. Após isso determine o maior
		
		Random rand =  new Random();
		int[][] matriz = new int [4][4];
	
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print((matriz[i][j] = rand.nextInt(10)) + " ");
			}
			
			System.out.println();
		}
		
		int maior = 0;
		String posicao =  new String();
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				 if(matriz[i][j] > maior) {
					 maior = matriz[i][j];  
					 posicao = "[" + i + "]" + "[" + j +"]";
				 }
			}
		}
		System.out.println("O maior valor é: " + maior);
		System.out.printf("Sua posição: " + posicao);
	}

}
