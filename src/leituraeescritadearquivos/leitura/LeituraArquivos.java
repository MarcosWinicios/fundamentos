package leituraeescritadearquivos.leitura;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeituraArquivos {
	final static String PATH = "/home/marcos-winicios/Workspace/tmp/";

	public static void main(String[] args) throws IOException {
		String arquivo = "lista-de-tarefas.txt";
		List<String> linhas = lerDoArquivo(arquivo);
		
		for(int i = 0; i < linhas.size(); i++) {
			System.out.println(linhas.get(i));
		}
		
	}
	
	static List<String> lerDoArquivo(String arquivo) throws IOException{
		Path path = Paths.get(PATH + arquivo);
		return Files.readAllLines(path);

	}

}
