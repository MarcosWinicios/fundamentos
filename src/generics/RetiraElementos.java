package generics;

import java.util.List;

public class RetiraElementos {
	
	public static <T> T recuperaPrimeiroElemento(List<T> lista) {
		return lista.get(0);
	}
}
