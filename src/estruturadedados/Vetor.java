package estruturadedados;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] estados = new String[10];
		
		estados[0] = "AC";
		estados[1] = "BA";
		estados[2] = "CE";
		estados[3] = "DF";
		estados[4] = "AM";
		estados[5] = "AP";
		estados[6] = "PB";
		estados[7] = "RN";
		estados[8] = "MS";
		estados[9] = "SP";
		
		for(int i = 0; i < estados.length; i++) {
			System.out.println(estados[i]);
		}
		
		Scanner leitor =  new Scanner(System.in);
		
		System.out.println("Qual sigla de estado vc quer buscar? ");
		
		String sigla = leitor.nextLine();
		

		boolean encontrou =  false;
		for(int i = 0; i < estados.length; i++) {
	
			
			String elemento = estados[i];
			
			
			if(elemento.equalsIgnoreCase(sigla)) {
				encontrou = true;
				break;
			}else {		
				encontrou = false;
			}			
		}
		
		if(encontrou) {
			System.out.println("Encontrou");
		}else {
			System.out.println("Não encontrou");
		}
		
	}
	
	

}
