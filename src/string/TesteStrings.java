package string;

public class TesteStrings {

	public static void main(String[] args) {
		// String, StringBuilder e StringBuffer
		
		String s = "Olá"; // Criada a String "Olá"
		s = s + " Pessoal!";  // Criada a String "Olá Pessoal!"
				
		System.out.println(s);
		
//		StringBuffer sb = new StringBuffer(); //thread-safe - use no contexto de concorrência
		StringBuilder sb = new StringBuilder(); // não-thread-safe - mais rápido
		
		sb.append("Bem vindo ao curso de Java. ");
		sb.append("Fique a vontade para turar suas dúvidas. ");
		sb.append("Estamos aqui para te ajudar. ");
		
		System.out.println(sb.toString());
		
		sb.insert(26, " da AlgaWorks");
		
		System.out.println(sb);
		
		

	}
	
	public static void quebraDeLinha() {
		StringBuilder linha = new StringBuilder();
		linha.append("\n");
		for (int i = 0; i < 6; i++) {
			linha.append(" - ");
		}
		linha.append("\n");
		System.out.println(linha.toString());
	}

	public void quebraDeLinha(String simbolo) {
		StringBuilder linha = new StringBuilder();
		linha.append("\n");
		for (int i = 0; i < 6; i++) {
			linha.append(simbolo);
		}
		linha.append("\n");
		System.out.println(linha.toString());
	}


}
