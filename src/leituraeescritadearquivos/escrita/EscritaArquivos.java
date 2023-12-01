package leituraeescritadearquivos.escrita;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class EscritaArquivos {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> linhas =  new ArrayList<String>();
		
		for(int i = 0; i < 5; i++) {			
			System.out.print("Jogador " + i + " : ");
			String jogador = input.nextLine();
			
			linhas.add(jogador);
		}
		input.close();
	
		Path arquivo =  Paths.get("/home/marcos-winicios/Workspace/tmp/arquivo.txt");
		Files.write(arquivo, linhas);
		System.out.println("Fim...");
	}
}
