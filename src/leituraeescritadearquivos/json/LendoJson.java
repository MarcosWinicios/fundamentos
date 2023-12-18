package leituraeescritadearquivos.json;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import leituraeescritadearquivos.json.modelo.Cliente;
import leituraeescritadearquivos.json.modelo.Endereco;
import leituraeescritadearquivos.json.modelo.Telefone;

//import com.google.gson.Gson;

/**
 * Precisa adicionar lib gson do google para trabalhar com JSON
 */
public class LendoJson {

	final static String PATH = "/home/marcos-winicios/Workspace/tmp/";

	public static void main(String[] args) throws IOException {
		String arquivo = "cliente.json";
//		Gson gson = new Gson();
		
		String json = lerArquivoJson(arquivo);

//		Cliente cliente = gson.fromJson(json, Cliente.class);

//		System.out.println(cliente);

	}
	
	public static String lerArquivoJson(String arquivo) throws IOException {
		StringBuilder json = new StringBuilder();
		
		List<String> linhas = lerDoArquivo(arquivo);
		for(String linha : linhas) {
			json.append(linha);
		}
		return json.toString();
	}

	static List<String> lerDoArquivo(String arquivo) throws IOException {
		Path path = Paths.get(PATH + arquivo);
		return Files.readAllLines(path);

	}
}
