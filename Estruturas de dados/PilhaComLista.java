package atividade03;

public class PilhaComLista implements Pilha_IF {
	
	protected ListaEncadeada pilha;
	
	public PilhaComLista() {
		this.pilha = new ListaEncadeada();
	}

	@Override
	public void push(int element) throws Exception {
		if(isFull())
			System.out.println("Erro, a pilha está cheia!");
		else {
			pilha.insert(element);
		}
	}

	@Override
	public int pop() throws Exception {
		int topo = top();
		if(isEmpty())
			throw new Exception("Erro, a pilha está vazia!");
		else {
			
			pilha.remove(top());
		}
		return topo;
	}

	@Override
	public int top() throws Exception {
		if(isEmpty())
			throw new Exception("Erro, a pilha está vazia!");
		else
			return pilha.toArray()[0];
	}

	@Override
	public boolean isEmpty() {
		return pilha.isEmpty();
	}

	@Override
	public boolean isFull() {
		return pilha.size() == 10;
	}
	


}
