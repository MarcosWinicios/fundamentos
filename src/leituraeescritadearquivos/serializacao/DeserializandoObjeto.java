package leituraeescritadearquivos.serializacao;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

import leituraeescritadearquivos.serializacao.model.Pessoa;

public class DeserializandoObjeto {
	
	public static void main(String[] args) {
		try(ObjectInput in = new ObjectInputStream(new FileInputStream("joao.obj")) ) {
			
			Pessoa p = (Pessoa) in.readObject();
			
			System.out.println(p);
			
		} catch (IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			System.err.println("Erro convertendo par a classe Pessoa");
			e.printStackTrace();
		}
	}
}
