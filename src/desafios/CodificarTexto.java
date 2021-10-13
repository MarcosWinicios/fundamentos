package desafios;

import java.util.Arrays;

public class CodificarTexto {
	public static void main(String[] args) {
		String texto ="ahhhhgjjuioa";
		System.out.println(codificarTexto(texto));

	}
	
	public static String codificarTexto(String str) {
		
		str =  validarTexto(str);
		String strSemRepeticoes =  removerRepeticoes(str);
		String resposta =  new String();
		int ocorrencias = 0;
		
		for(int i = 0; i < strSemRepeticoes.length(); i++) {
			ocorrencias = contaOcorrencias(strSemRepeticoes.charAt(i), str);
			resposta += String.valueOf(strSemRepeticoes.charAt(i)) + "" + ocorrencias;
		}
		return resposta;
	}
	
	public static String removerRepeticoes(String str) {	
		String strSemRepeticoes = new String();
		
		for(int i = 0; i < str.length(); i++) {
			if(strSemRepeticoes.indexOf(str.charAt(i)) == -1) {
				strSemRepeticoes += str.charAt(i);
			}
		}
		return strSemRepeticoes;
	}
	
	public static int contaOcorrencias(char caracter ,String str){
        int count=0;
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)==caracter){
                count++;
            }
        }
        return count;
    }
	
	public static String validarTexto(String str) {
		str.replace(" ", "");
		str = str.toLowerCase();
		
		String novaStr = new String();
		
		for(int i = 0; i < str.length(); i++) {
			if(Character.isLetter(str.charAt(i))) {
				novaStr += String.valueOf(str.charAt(i));
			}
		}
		novaStr = ordernarCaracteres(novaStr);
		return novaStr;
	}
	
	public static String ordernarCaracteres(String str) {
		char[] texto = str.toCharArray();
		Arrays.sort(texto);
		String ordenado = new String(texto);
		return ordenado;
				
	}
}
