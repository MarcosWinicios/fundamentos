package estruturadedados.vetores.ordenacao;

public class InsertionSort {
	//Pior caso: Quando o vetor está invertido
	//Complexidade quadrática
	
	public static void main(String[] args) {
		int[] vetor =  new int[10000];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * vetor.length);
		}
		
		System.out.println("Vetor desordenado: ");
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		int aux, j;
		
		long inicio =  System.currentTimeMillis();
		long fim;
		
		for(int i = 1; i < vetor.length; i++) {
			aux = vetor[i];
			j = i-1;
			while(j >= 0 && vetor[j] > aux) {
				vetor[j+1] = vetor[j];
				j--;
			}
			
			vetor[j+1] = aux;
		}
		
		fim = System.currentTimeMillis();
		
//		System.out.println("\n\nVetor ordenado: ");
//		for(int i = 0; i < vetor.length; i++) {
//			System.out.println(vetor[i]);
//		}
		
		System.out.println("Tempo: " + (fim - inicio));
	}

}
