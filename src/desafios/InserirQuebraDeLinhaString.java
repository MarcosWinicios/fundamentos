package desafios;

import java.util.Scanner;

public class InserirQuebraDeLinhaString {
	/*
		DESAFIO
		
		Receber um texto e retornar uma String com este texto separado em linhas e sem espaços.
		O número máximo de caractere por linha deve ser fornecido pelo usuário.
		
		ENTRADA 
		texto: abcd efgh i, 
		maxCaractere: 2
		
		RESPOSTA: 
		ab
		cd
		ef
		gh
		i
		
		OBS.: Não utilizar o "\n"
	*/
	
	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		
		System.out.print("Informe o texto a ser manipulado: " );
		String str = input.nextLine();
		
		System.out.print("\nInforme a quantidade máxima de caracteres por linha: ");
		int maxCaractere = input.nextInt();
		
		System.out.println(dividirLinhas(str, maxCaractere));
	}
	
	private static String dividirLinhas(String str, int maxCaracterePorLinha) {
		str = str.replaceAll(" ", "");
		char[] vetorTexto = str.toCharArray();
		int cont = 0;
		String resposta  =  new String();
		
		for(int i = 0; i < vetorTexto.length ; i++) {
			if(cont < maxCaracterePorLinha) {
				resposta += String.valueOf(vetorTexto[i]);
				cont++;
			}else {
				resposta += System.lineSeparator();
				cont = 0;
				i = i-1;
			}
		}
		return resposta;
	}
}
