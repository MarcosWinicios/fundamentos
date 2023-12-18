package joptionpane;

import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ExemploJOptionPane4 {

	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		
		
		Object[] possibilidades = {"Masculino", "Feminino"};
		
		String sexo = (String) JOptionPane.showInputDialog(
				null,
				"Selecione sexo", 
				"Estudos",
				JOptionPane.PLAIN_MESSAGE,
				null,
				possibilidades,
				possibilidades[0]				
			);
		
		System.out.println("Sexo selecionado: " + sexo);
		
		String nome = (String) JOptionPane.showInputDialog(
				null,
				"Digite seu nome", 
				"Estudos",
				JOptionPane.PLAIN_MESSAGE,
				null,
				null,
				null				
			);
		
		System.out.println("Seu nome é: " + nome);
	}

}
