package joptionpane;

import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ExemploJOptionPane3 {

	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		
		Object[] opcoes = {"Sim", "Não", "Sim, com e-mail"};
		
		int opcao = JOptionPane.showOptionDialog(
				null
				, "Você gostaria de finalizar o cadastro?"
				, "Confirmação"
				, JOptionPane.YES_NO_CANCEL_OPTION
				, JOptionPane.QUESTION_MESSAGE
				, null
				, opcoes
				, opcoes[2]
		);
		
		System.out.println("Opção selecionada: " + opcao);

	}

}
