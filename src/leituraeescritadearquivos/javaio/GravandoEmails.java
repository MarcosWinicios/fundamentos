package leituraeescritadearquivos.javaio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class GravandoEmails {
	final static String PATH = "/home/marcos-winicios/Workspaces/tmp";

	public static void main(String[] args) {
		String[] emails = { "joao2@joao.com", "maria2@maria.com", "ricardo2@ricardo.com" };
		
		String file =  PATH + "/emails2.txt";
		
//		try (BufferedWriter writer = new BufferedWriter(new FileWriter(PATH + "/emails.txt", true))) {
		try(PrintStream writer = new PrintStream(file)){

			for (String email : emails) {
//				writer.write(email);
//				writer.newLine();
				
				writer.println(email);
			}

		} catch (IOException e) {
			System.err.println("Não conseguiu gravar o arquivo." + e);
		}

	}
}
