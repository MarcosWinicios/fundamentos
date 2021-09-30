package estruturadedados.vetores.ordenacao;

public class BubbleSort {
	public static void main(String[] args) {
		int[] vetor =  new int[10000];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * vetor.length);
//					System.out.println(vetor[i]);
		}
		
		
		long inicio =  System.currentTimeMillis();
		long fim;
		//BUBBLE SORT O(N²)
		int aux = 0;
		for(int i = 0; i < vetor.length; i++) {
			for (int j = i+1; j < vetor.length; j++) {
				if(vetor[i] > vetor[j]) {
					aux = vetor[j];
					vetor[j] = vetor[i];
					vetor[i] = aux;
				}
			}
		}
		fim = System.currentTimeMillis();
		System.out.println("Tempo: " + (fim-inicio));
	
//				System.out.println("Vetor ordenado: ");
//				
//				for(int i = 0; i < vetor.length; i++) {					
//					System.out.println(vetor[i]);
//				}
	}
}
