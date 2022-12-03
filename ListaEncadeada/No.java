
public class No {
	protected int valor;
	protected No prox;
	
	public No(int valor, No prox){ // Novo Nó, com o valor e um ponteiro para o próximo nó
		this.valor = valor;
		this.prox = prox;
	}
	
	public boolean isNIL(){ // confere se a lista está vazia
		return this.valor == -1;
	}
	
	public No(){ // Nó NIL (representa a lista vazia)
		this.valor = -1;
	}

}
