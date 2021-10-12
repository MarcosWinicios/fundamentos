package estruturadedados.vetores;

import java.util.Arrays;
import java.util.Scanner;

public class ValorMaisProximoDeZero {

	public static void main(String[] args) {
		// Capturar o valor mais próximo de ZERO em um vetor.
		// Se o valor for negativo e ouver o mesmo valor positivo, capturar o positivo
		
		Scanner input =  new Scanner(System.in);
		
		System.out.print("Informe o tamanho do vetor a ser gerado: ");
		int tamanhoVetor = input.nextInt();
		
		System.out.println();
	
		int[] vetor = new int[tamanhoVetor];
		
		vetor = writeArray(vetor);
		printAray(vetor);
		
		int valor = computeClosestToZero(vetor);
		System.out.print("\nO valor mais próximo de zero é: " + valor);
	}
	public static int computeClosestToZero(int[] ts) {
		 if(ts.length == 0) {
			 return 0;
		 }else {
			 int valorMaisProximoDeZero = buscarItemMaisProximoDeZero(ts);			
			 if(valorMaisProximoDeZero < 0) {			
				 int valor  = Math.abs(valorMaisProximoDeZero);	
				 if(exists(ts, valor)) {			
					 return valor;
				 }else {
					 return valorMaisProximoDeZero;
				 }	
		    }else {
	
		    	return valorMaisProximoDeZero;
		    }
		 }
	}
	public static int buscarItemMaisProximoDeZero(int[] vetor) {
		int menorDistancia = medirDistanciaAteZero(vetor[0]), distanciaDoItemAtual, indiceItemProximo = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			distanciaDoItemAtual = medirDistanciaAteZero(vetor[i]);
			
			if(distanciaDoItemAtual < menorDistancia) {
				menorDistancia = distanciaDoItemAtual;
				indiceItemProximo = i;
			}
		}
		return vetor[indiceItemProximo];
	}
	
	public static int medirDistanciaAteZero(int number) {
		int distancia = 0;
		if(number >= 0) {
			for(int i = 0; i <= number; i++) {
				distancia++;
			}
			return distancia;
		}else {
			for(int i = 0; i >= number; i--) {
				distancia++;
			}
			return distancia;
		}
	}
	
	public static void printAray(int[] array) {
		System.out.println(Arrays.toString(array));
	}
	
	public static int tornarNumeroPositivo(int number) {
		int valorPositivo = (number * (-2))  / 2;
		return valorPositivo;
	}
	
	public static boolean  exists(int[] ints, int k) {
		Arrays.sort(ints);
		int inicio = 0;
		int fim = ints.length -1;
		int meio;
		boolean encontrou = false;
		
		while(inicio <= fim) {
			meio = (int) ((inicio+fim) /2);
			if(ints[meio] == k) {
				encontrou = true;
				break;
			}else if(ints[meio] < k) {
				inicio = meio +1;
			}else {
				fim = meio -1;
			}
		}
		if(encontrou) {		
			return true;
		}else {
			return false;
		}
	}
	
	public static int [] writeArray(int[] array ) {
		int valor;
		for(int i = 0; i < array.length; i++) {
			valor =  (int) (Math.random() * array.length);
			valor = (int) ((valor != 0) ? valor : ((valor + array.length) * i + array.length) * -1);

			array[i] = valor;
		} 
		
		return array;
	}
}
