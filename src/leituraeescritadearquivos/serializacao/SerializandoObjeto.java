package leituraeescritadearquivos.serializacao;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import leituraeescritadearquivos.serializacao.model.Pessoa;

public class SerializandoObjeto {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("João Silva", 25, "Motorista");
	
		try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream("joao.obj"))) {
		
			out.writeObject(pessoa);
			System.out.println("Objeto Salvo com sucesso. ");
			
		} catch (IOException e) {
			System.err.println("Erro salvando objeto. " + e.getMessage());
			e.printStackTrace();
		}
	}

}
