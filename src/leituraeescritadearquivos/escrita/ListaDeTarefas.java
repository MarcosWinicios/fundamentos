package leituraeescritadearquivos.escrita;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTarefas {
	
	final static String PATH = "/home/marcos-winicios/Workspace/tmp/";
	
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		ArrayList<String> linhas = new ArrayList<String>();
		System.out.println("Informe tarefas a serem realizadas no dia seguinte. Digite [X] para encerrar:\n");

		int i = 1;
		while (true) {
			String linha = "Tarefa " + i + " : ";
			
			System.out.print(linha);
			String tarefa = input.nextLine();
			
			if (tarefa.equalsIgnoreCase("X")) break;
				linha += tarefa;
				linhas.add(linha);
			i++;
		}

		input.close();

		Path arquivo = Paths.get(PATH + "arquivo.txt");
		Files.write(arquivo, linhas);
		System.out.println("Fim...");
	}
}
