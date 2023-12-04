package desafios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import estruturadedados.listadinamica.Aluno;
import estruturadedados.listadinamica.ListaAlunos;

public class OrdenarListaDeAlunosDeUmArquivo {
	final static String PATH = "/home/marcos-winicios/Workspace/tmp/";

	public static void main(String[] args) throws IOException {
		String arquivo = "alunos.txt";
		List<String> linhas = lerDoArquivo(arquivo);
		
		ListaAlunos listaAlunos = criarListaDeAlunos(linhas);
		
		listaAlunos.ordernar();
		
		escreverAlunosNoArquivo(listaAlunos);
		
		System.out.println("FIM.....");
	}

	public static List<String> lerDoArquivo(String arquivo) throws IOException {
		Path path = Paths.get(PATH + arquivo);
		return Files.readAllLines(path);

	}

	public static ListaAlunos criarListaDeAlunos(List<String> nomesDosAlunos) {
		ListaAlunos listaAlunos = new ListaAlunos();
		for(int i = 0; i < nomesDosAlunos.size(); i++) {
			Aluno aluno = new Aluno();
			aluno.nome = nomesDosAlunos.get(i);
			listaAlunos.adicionar(aluno);
		}
		
		return listaAlunos;
	}
	
	public static void escreverAlunosNoArquivo(ListaAlunos listaDeAlunos) throws IOException {
		List<String> linhas = new ArrayList<String>();
		for(int i = 0; i < listaDeAlunos.lista.length; i++) {
			linhas.add(listaDeAlunos.lista[i].nome);
		}
		
		escreverNoArquivo("alunos-ordenados.txt", linhas);
	}
	
	public static void escreverAlunosNoArquivo(ListaAlunos listaDeAlunos, String arquivo) throws IOException {
		List<String> linhas = new ArrayList<String>();
		for(int i = 0; i < listaDeAlunos.lista.length; i++) {
			linhas.add(listaDeAlunos.lista[i].nome);
		}
		
		escreverNoArquivo(arquivo, linhas);
	}
	
	public static void escreverNoArquivo(String arquivo, List<String> linhas) throws IOException {
		Path path = Paths.get(PATH + arquivo);
		Files.write(path, linhas);
	}
	
}
