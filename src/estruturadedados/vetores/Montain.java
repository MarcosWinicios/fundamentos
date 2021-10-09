package estruturadedados.vetores;

import java.util.*;

public class Montain {
	 public static void main(String args[]) {	  
		 Scanner in = new Scanner(System.in);
	     int N = in.nextInt();
	     int [] cavalos = new int[N];
	     
	     for(int i = 0; i < cavalos.length; i++) {
	    	 int pi = in.nextInt();
	    	 cavalos[i] = pi;
	     }

	     cavalos = ordenar(cavalos);
	     int menorIntervalo = pegarMenorIntervalo(cavalos);
	       
	     System.out.println(menorIntervalo);
	 }
	 
	 public static int pegarMenorIntervalo(int [] cavalos) {
	   int intervalo, menor_intervalo;
	   List<Integer> intervalos =  new ArrayList<>();
	   
	   for(int i = 0; i < cavalos.length; i++) {
		   	  if(i+1 < cavalos.length) {
		   		  intervalo = cavalos[i +1] - cavalos[i];
		   		  intervalos.add(intervalo);
		   	  }
	   }
	   
	   menor_intervalo = intervalos.get(0);
	   
	   for(int cont = 0; cont < intervalos.size(); cont++) {
		   
		   if(intervalos.get(cont) < menor_intervalo) {
			   menor_intervalo = intervalos.get(cont);
		   }
	
	   }
	   
	   return menor_intervalo;
	 }
	 
	 
	 public static int[] ordenar(int [] vetor) {
		int posicao_menor, aux;
	    for (int i = 0; i < vetor.length; i++) {
	    	posicao_menor = i;
	    	
	        for(int j = i+1; j < vetor.length; j++) {
	        	if(vetor[j] < vetor[posicao_menor]) {
	        		posicao_menor = j;
	        	}
	        }
	        aux = vetor[posicao_menor];
	        vetor[posicao_menor] = vetor[i];
	        vetor[i] = aux;
	    }
	    return vetor;
	        
	 }
}
