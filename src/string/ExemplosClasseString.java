package string;

public class ExemplosClasseString {

	public static void main(String[] args) {
		
		//---------------- Strings são imutáveis
		String nome = "Pedro";
		
		System.out.println(nome.toUpperCase());
		System.out.println(nome);
		
		nome =  nome.toUpperCase();
		System.out.println(nome);
		
		quebraDeLinha();
		//----------------- Comparação de Strings
		String s1 = "Pedro";
		String s2 = "Pedro";
		System.out.println("s1 == s2? " + (s1 == s2));
		
		String s3 = new String("Pedro");
		System.out.println("s3 == s1? " + (s3 == s1));
		
		System.out.println("s1.equals(s2)? " + (s1.equals(s2)));
		System.out.println("s3.equals(s1)? " + (s3.equals(s1)));
		
		String s4 = "PeDro";
		
		System.out.println("s1.equals(s4)? " + s1.equals(s4));
		System.out.println("s1.equalsIgnoreCase(s4)? " + s1.equalsIgnoreCase(s4));
		quebraDeLinha();
		//---------------
		 String s  = "Cursos online";
		 
		 System.out.println(s.charAt(0));
		 System.out.println(s.charAt(2));
		 System.out.println(s.charAt(8));
		 
		 System.out.println(s.length());
		
		System.out.println(s.charAt(12));
		quebraDeLinha();
		//----------------Convertendo array de caracteres para String
		char[] array =  {'O', 'L', 'A'};
		
		String text = new String(array);
		
		System.out.println(text);
		quebraDeLinha();
		//------------- método substring
		//public String substring(int beginIdex) retorna a string após indice passado
		//public String substring(int beginIdex, int endIndex) retorna a string entre excluindo a partir dos indices passados
		
		String str = "Desenvolvimento Java";
		
		System.out.println(str.substring(16));
		
		System.out.println(str);
		
		String str2 = "Cursos online de desenvolvimento de software";
		System.out.println(str2.substring(7, 12));
		quebraDeLinha();
		//---------------------- Removendo espaços
		String str3 =  "   AlgaWorks   ";
		System.out.println(">" + (str3) + "<");
		System.out.println(">" + (str3.trim()) + "<");
		quebraDeLinha();
		//----------------- split
		String str4 = "Cursos_online_de_desenvolvimento_de_software";
		
		String[] vetor = str4.split("_");
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("[" + i + "]=" + vetor[i]);
		}
		
		quebraDeLinha();
		//------------------------------ indexof
		String str5 = "Java";
		int indice = str5.indexOf('a');
		System.out.println(indice);
		indice = str5.lastIndexOf('a');
		System.out.println(indice);
		
		quebraDeLinha();
		//------------------------------ indexof
		
		String str6 = "Desenvolvimento Java";
		System.out.println(str6.replaceAll("Java", "de software"));
		
		
		
		
		
	}
	
	public static void quebraDeLinha() {
		StringBuilder linha = new StringBuilder();
		linha.append("\n");
		for (int i = 0; i < 10; i++) {
			linha.append(" - ");
		}
		linha.append("\n");
		System.out.println(linha.toString());
	}

	public void quebraDeLinha(String simbolo) {
		StringBuilder linha = new StringBuilder();
		linha.append("\n");
		for (int i = 0; i < 10; i++) {
			linha.append(simbolo);
		}
		linha.append("\n");
		System.out.println(linha.toString());
	}

}
