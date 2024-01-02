package leituraeescritadearquivos.javaio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EnviandoEmails {
	final static String PATH = "/home/marcos-winicios/Workspaces/tmp";
	
	
	public static void main(String[] args) {
		String file =  PATH + "/emails2.txt";
		try(BufferedReader reader = new BufferedReader(new FileReader(file))){
			
			String email = null;
			
			while((email = reader.readLine()) != null) {
				System.out.println("Enviando e-mail para: " + email);
			}
			
		}catch (IOException e) {
			System.err.println("Não foi possível ler o arquivo" + e.getMessage());
		}
	}
}
