package poo.interfaces.impressao.impressoras;

import poo.interfaces.impressao.Impressora;
import poo.interfaces.impressao.Imprimivel;

public class ImpressoraEpson implements Impressora {

	@Override
	public void imprimir(Imprimivel imprimivel) {
		System.out.println("* * * * * * * * * * * * * ");
		System.out.println(imprimivel.getCabecalhoPagina());
		System.out.println("* * * * * * * * * * * * * ");
		System.out.println(imprimivel.getCorpoDaPagina());
		System.out.println();
		System.out.println("- - - - - - - - - - - - - ");
		System.out.println("==         EPSON        ==");
		System.out.println("- - - - - - - - - - - - - ");

	}


}
