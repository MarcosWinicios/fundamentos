package desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoverRepeticoes {

	public static void main(String[] args) {
		int [] numeros = {0,1,1,2,3,4,4,5,6,7,7,8,1,9,0};
		
		int [] numerosRepetidos = pegarNumerosRepetidos(numeros);
		int [] numerosSemRepeticoes =  removerRepeticoes(numeros);
		int [] numerosQueNaoRepetiram = removerNumerosRepetidos(numeros);

		System.out.print("\nLista ordenana sem Repetições: " + Arrays.toString(numerosSemRepeticoes) + "\n");
		System.out.print("\nLista somente com os números que NÃO se repetiram: " + Arrays.toString(numerosQueNaoRepetiram) + "\n");
		System.out.print("\nLista Somente com os números que se repetiram: " + Arrays.toString(numerosRepetidos) + "\n");

	}
	
	public static int[] pegarNumerosRepetidos(int[] numeros) {
		List<Integer> numerosRepetidos =  new ArrayList<>();
		for(int i = 0; i < numeros.length; i++) {
			for(int j = i +1; j < numeros.length; j++) {
				if(numeros[j] == numeros[i]) {
					if(!numerosRepetidos.contains(numeros[i])) {
						numerosRepetidos.add(numeros[i]);
					}
				}
			}
		}
		return arrayListToArray(numerosRepetidos);
	}
	
	public static int[] removerNumerosRepetidos(int[] numeros) {
		List<Integer> numerosNaoRepetidos = arrayToArrayList(numeros);
		boolean aux = false;
		for(int i = 0; i < numerosNaoRepetidos.size(); i++) {
			for(int j = i +1; j < numerosNaoRepetidos.size(); j++) {
				if(numerosNaoRepetidos.get(i) == numerosNaoRepetidos.get(j)) {
					numerosNaoRepetidos.remove(j);
					aux = true;
					
				}
			}
			if(aux) {
				numerosNaoRepetidos.remove(i);
				aux = false;
			}
		}
		
		return arrayListToArray(numerosNaoRepetidos);
	}
	
	public static int[] removerRepeticoes(int[] numeros) {
		List<Integer> numerosNaoRepetidos =  new ArrayList<>();
		boolean exists = false;
		
		for(int i = 0; i < numeros.length; i++) {
			for(int j = i +1; j < numeros.length; j++) {
				if(numeros[j] == numeros[i]) {
					exists = true;
					break;
				}
			}
			if(!exists) {
				numerosNaoRepetidos.add(numeros[i]);
			}
			exists = false;
		}
		numeros = arrayListToArray(numerosNaoRepetidos);
		Arrays.sort(numeros);
		return numeros;
	}
	
	
	public static int[] arrayListToArray(List<Integer> list) {
		int[] array = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			array[i] = list.get(i);
		}
		return array;
	}
	
	public static List<Integer> arrayToArrayList(int[] array) {
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}
		return list;
	}

}
