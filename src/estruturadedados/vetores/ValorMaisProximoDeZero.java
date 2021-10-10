package estruturadedados.vetores;

public class ValorMaisProximoDeZero {

	public static void main(String[] args) {
		// Capturar o valor mais próximo de ZERO em um vetor.
		// Se o valor for negativo e ouver o mesmo valor positivo, capturar o positivo
		
		int[] vetor = new int[15];
		vetor = writeArray(vetor);
		printAray(vetor);
		
		int valorMaisProximoDeZero = buscarItemMaisProximoDeZero(vetor);
		
		if(valorMaisProximoDeZero < 0 ) {
			int valor = tornarNumeroPositivo(valorMaisProximoDeZero);
			if(exists(vetor, valor)) {
				System.out.println(valor);
			}else {
				System.out.println(valorMaisProximoDeZero);
			}	
		}else {
			System.out.println(valorMaisProximoDeZero);
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
		System.out.print("\n[ ");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if(i < array.length -1) {
				System.out.print(" , ");
			}
		}
		System.out.print(" ]\n\n");
	}
	
	public static int tornarNumeroPositivo(int number) {
		int valorPositivo = (number * (-2))  / 2;
		return valorPositivo;
	}
	
	public static boolean  exists(int[] ints, int k) {
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
