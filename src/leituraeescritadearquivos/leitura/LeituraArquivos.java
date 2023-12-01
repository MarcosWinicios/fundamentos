package leituraeescritadearquivos.leitura;

import java.io.IOException;
import java.nio.file.Files;import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeituraArquivos {
	final static String PATH = "/home/marcos-winicios/Workspace/tmp/";

	public static void main(String[] args) throws IOException {
		String arquivo = "lista-de-tarefas.txt";
		Path path = Paths.get(PATH + arquivo);
		
		List<String> linhas =  Files.readAllLines(path);
		
		for(int i = 0; i < linhas.size(); i++) {
			System.out.println(linhas.get(i));
		}
		
	}

}
