package estruturadedados.listaligada;

public class ListaLigada<TIPO> {
	
	private Elemento<TIPO> primeiro;
	private Elemento<TIPO> ultimo;
	private int tamanho;
	
	public ListaLigada() {
		this.tamanho = 0;
	}
	
	
	public Elemento<TIPO> getPrimeiro() {
		return primeiro;
	}
	public void setPrimeiro(Elemento<TIPO> primeiro) {
		this.primeiro = primeiro;
	}
	public Elemento<TIPO>  getUltimo() {
		return ultimo;
	}
	public void setUltimo(Elemento<TIPO>  ultimo) {
		this.ultimo = ultimo;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public void adicionar(TIPO novoValor) {
		Elemento novoElemento =  new Elemento<TIPO>(novoValor);
		if(this.primeiro == null && this.ultimo == null) { //Se a lista tiver vazia
			this.primeiro = novoElemento;
			this.ultimo = novoElemento;
			
		}else {
			this.ultimo.setProximo(novoElemento);
			this.ultimo = novoElemento;
		
		}
		this.tamanho++;

	}
	
	public void remover(TIPO valorProcurado) {
			Elemento<TIPO> anterior = null;
			Elemento<TIPO> atual =  this.primeiro;
			for(int i = 0; i < this.getTamanho(); i++) {
				if(atual.getValor().equals(valorProcurado)) {
					if(this.tamanho == 1) {
						this.primeiro = null;
						this.ultimo =  null;
					}else if(atual == primeiro) {
						this.primeiro = atual.getProximo();
						atual.setProximo(null);
					}else if(atual == ultimo) {
						this.ultimo = anterior;
						anterior.setProximo(null);
					}else {
						anterior.setProximo(atual.getProximo());
						atual = null;
						
					}
					this.tamanho--;
					break;
				}
				
				anterior = atual;
				atual = atual.getProximo();
			}
			
	}
		
	public Elemento<TIPO> get(int posicao) {
		Elemento<TIPO> atual = this.primeiro;
		
		for(int i = 0; i < posicao ; i++) {
			if(atual.getProximo() != null) { //Se não for o ultimo elemento
				atual = atual.getProximo();
			}
		}
		
		return atual;
	}
	
	
	public IteratorListaLigada<TIPO>  getIterator(){
		return new IteratorListaLigada<TIPO>(this.primeiro);
	}
	
//	public Elemento getConteudo(String valor) {
//		Elemento atual = this.primeiro;
//		boolean achou = false;
//		
//		for(int i = 0; i < this.tamanho; i++) {
//			if(atual.getValor().equalsIgnoreCase(valor)) {	
//				achou = true;
//				break;
//			}
//			if(atual.getProximo() != null) {
//				atual = atual.getProximo();
//			}
//		}
//		if(achou) {
//			return atual;
//		}else {
//			atual.setValor("Não encontrado");
//			atual.setProximo(atual);
//			return atual;
//		}
//	}
//	
//	public int index(String valor) {
//		int index = -1;
//		Elemento atual = this.primeiro;
//		boolean achou = false;
//		
//		for(int i = 0; i < this.tamanho; i++) {
//			if(atual.getValor().equalsIgnoreCase(valor)) {
//				achou = true;
//				index = i;
//				
//				break;
//			}
//			if(atual.getProximo() != null) {
//				atual = atual.getProximo();
//			}
//		}
//		if(index >= 0 && achou) {
//			return index;
//		}else {
//			return -1;
//		}
//	}
	
	public void adicionarNoInicio(TIPO novoValor){
        Elemento<TIPO> novoElemento = new Elemento<TIPO>(novoValor);
        if (this.primeiro == null){
              this.primeiro = novoElemento;
              this.ultimo = novoElemento;
              this.tamanho++;
        }else{
              novoElemento.setProximo(this.primeiro);
              this.primeiro = novoElemento;
              this.tamanho++;
        }
	}
	
	
}
