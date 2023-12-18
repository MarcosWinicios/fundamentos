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

public class GerandoJson {
	final static String PATH = "/home/marcos-winicios/Workspace/tmp/";

	public static void main(String[] args) throws IOException{

		Endereco endereco = new Endereco("Rua das Águas, 10", "São Paulo", "SP");

		Telefone residencial = new Telefone("RESIDENCIAL", "11 3333-1111");
		Telefone comercial = new Telefone("COMERCIAL", "11 3222-2222");
		List<Telefone> telefones = new ArrayList<>();
		telefones.add(residencial);
		telefones.add(comercial);

		Cliente cliente = new Cliente("João Silva", 28, endereco, telefones);

//		Gson gson = new Gson();
//		String json = gson.toJson(cliente);
		
		ArrayList<String> linhas = new ArrayList<String>();
		
//		linhas.add(json);
		escreverNoArquivo("cliente.json", linhas);
	}
	
	static void escreverNoArquivo(String arquivo, ArrayList<String> linhas) throws IOException {
		Path path = Paths.get(PATH + arquivo);
		Files.write(path, linhas);
	}
}
