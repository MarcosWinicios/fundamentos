package poo.heranca;

public class TesteHeranca {

	public static void main(String[] args) {
		Jogador j = new Jogador();

		j.nome = "Ronaldo";
		j.idade = 36;

//		j.seApresentar();
//		j.dizerSeAindJoga();
//		
		Pessoa p = new Pessoa();
//		
//		
//		System.out.println(p.toString());
//		System.out.println(nomeDaClasse(j));
//		
//		System.out.println(nomeDaClasse( new Object()));

		retunType(j);

	}

	public static String nomeDaClasse(Object obj) {
		return obj.getClass().getSimpleName();
	}

	public static void retunType(Object obj) {
		System.err.print(nomeDaClasse(obj) + ".toString(): ");
		System.out.println(obj.toString());

		System.err.print(nomeDaClasse(obj) + ".getClass().descriptorString(): ");
		System.out.println(obj.getClass().descriptorString());
		
		
		System.err.print(nomeDaClasse(obj) + ".obj.getClass().getName(): ");
		System.out.println(obj.getClass().getName());
		
		System.err.print(nomeDaClasse(obj) + ".obj.getClass().getCanonicalName(): ");
		System.out.println(obj.getClass().getCanonicalName());
		
		System.err.print(nomeDaClasse(obj) + ".obj.getClass().getSimpleName(): ");
		System.out.println(obj.getClass().getSimpleName());
		
	}

}
