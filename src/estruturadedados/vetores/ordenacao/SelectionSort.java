package estruturadedados.vetores.ordenacao;

public class SelectionSort {

	public static void main(String[] args) {
		int[] vetor =  new int[10000];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * vetor.length);
		}
		
		
//		System.out.println("Vetor desordenado: ");
//		for(int i = 0; i < vetor.length; i++) {
//			System.out.println(vetor[i]);
//		}
//		
		
		//Selection Sort 0(N²) : Complexidade quadrática
		long inicio =  System.currentTimeMillis();
		long fim;
		int posicao_menor, aux;
		for(int i = 0; i < vetor.length; i++) { //O(N)
			posicao_menor = i;
			for(int j = i+1; j < vetor.length; j++) { //O(N)
				if(vetor[j] < vetor[posicao_menor]) {
					posicao_menor = j;
				}
			}
			 aux = vetor[posicao_menor];
			 vetor[posicao_menor] = vetor[i];
			 vetor[i] = aux;
		}
		
		fim =  System.currentTimeMillis();
		
		
//		System.out.println("\n\nVetor ordenado: ");
//		for(int i = 0; i < vetor.length; i++) {
//			System.out.println(vetor[i]);
//		}
		
		System.out.println("Tempo: " + (fim - inicio));

	}

}
