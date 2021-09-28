package estruturadedados.listaligada;

public class ListaLigada {
	
	private Elemento primeiro;
	private Elemento ultimo;
	private int tamanho;
	
	public ListaLigada() {
		this.tamanho = 0;
	}
	
	
	public Elemento getPrimeiro() {
		return primeiro;
	}
	public void setPrimeiro(Elemento primeiro) {
		this.primeiro = primeiro;
	}
	public Elemento getUltimo() {
		return ultimo;
	}
	public void setUltimo(Elemento ultimo) {
		this.ultimo = ultimo;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public void adicionar(String novoValor) {
		Elemento novoElemento =  new Elemento(novoValor);
		if(this.primeiro == null && this.ultimo == null) { //Se a lista tiver vazia
			this.primeiro = novoElemento;
			this.ultimo = novoElemento;
			
		}else {
			this.ultimo.setProximo(novoElemento);
			this.ultimo = novoElemento;
		
		}
		this.tamanho++;

	}
	
	public void remover(String novoValor) {
			
	}
		
	public Elemento get(int posicao) {
		Elemento atual = this.primeiro;
		
		for(int i = 0; i < posicao ; i++) {
			if(atual.getProximo() != null) { //Se não for o ultimo elemento
				atual = atual.getProximo();
			}
		}
		
		return atual;
	}
	
	public Elemento getConteudo(String valor) {
		Elemento atual = this.primeiro;
		boolean achou = false;
		
		for(int i = 0; i < this.tamanho; i++) {
			if(atual.getValor().equalsIgnoreCase(valor)) {	
				achou = true;
				break;
			}
			if(atual.getProximo() != null) {
				atual = atual.getProximo();
			}
		}
		if(achou) {
			return atual;
		}else {
			atual.setValor("Não encontrado");
			atual.setProximo(atual);
			return atual;
		}
	}
	
	public int index(String valor) {
		int index = -1;
		Elemento atual = this.primeiro;
		boolean achou = false;
		
		for(int i = 0; i < this.tamanho; i++) {
			if(atual.getValor().equalsIgnoreCase(valor)) {
				achou = true;
				index = i;
				
				break;
			}
			if(atual.getProximo() != null) {
				atual = atual.getProximo();
			}
		}
		if(index >= 0 && achou) {
			return index;
		}else {
			return -1;
		}
	}
}
