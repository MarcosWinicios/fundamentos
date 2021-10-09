package estruturadedados.matrizes;

public class MatrizBidimensional {

	public static void main(String[] args) {
		// Declarando matriz
		double [][] notasAlunos =  new double[3][4];
		
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 8;
		notasAlunos[0][3] = 9.5;
		
		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;
		
		notasAlunos[2][0] = 9;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 10;
		notasAlunos[2][3] = 7;
		
		//Imprimido Matriz
		for(int i = 0; i < notasAlunos.length; i++) {
			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j] + " - ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		//Acessando e modificando posição específica da matriz
		notasAlunos[1][3] = 8;
		
		for(int i = 0; i < notasAlunos.length; i++) {
			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j] + " - ");
			}
			System.out.println();
		}
		
		System.out.println("\nCalculando a média de cada aluno\n");
		
		double soma;
		for(int i = 0; i < notasAlunos.length; i++) {
			soma = 0;
			for (int j = 0; j < notasAlunos[i].length; j++) {
				soma += notasAlunos[i][j];
			}
			System.out.println("Media do aluno: " + i + " = " + soma/4);
		}
		System.out.println();
		
		//Atribuindo valores diretamenta na matriz
		
		double[][] notasAlunos2 = {{10, 7, 8, 9.5},{9, 8, 7, 9}, {9, 9, 10 ,7}};
		
		for(int i = 0; i < notasAlunos2.length; i++) {
			for (int j = 0; j < notasAlunos2[i].length; j++) {
				System.out.print(notasAlunos2[i][j] + " - ");
			}
			System.out.println();
		}
		
		
	}

}
