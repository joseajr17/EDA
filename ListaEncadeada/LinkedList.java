
public class LinkedList implements LinkedList_IF{
	
	private No head;
	
	public LinkedList() {
		head = new No(); // cria o Nó NIL
	}

	@Override
	public boolean isEmpty() {
		if(head.isNIL()) // se a head for NIL:
			return true; // retorna true
		else
			return false; // caso contrário retorna false
	}

	@Override
	public int size() {
		int size = 0;
		No aux = head; // aponta para a head
		while(!(aux.isNIL())) { // enquanto o apontador for diferente de NIL:
			size++; // incrementa no contador
			aux = aux.prox; // e pula para o proximo elemento
		}
		return size; // retorna o tamanho da lista
	}

	@Override
	public boolean search(int element) {
		No aux = head; // aponta para a head
        while (!(aux.isNIL())) { // enquanto o apontador for diferente de NIL:
            if (aux.valor == element) // se o valor do apontar for o buscado:
                return true; // retorna true
            aux = aux.prox; // se não for, pula para o proximo elemento
        }
        return false; // se o valor não for encontrado, retorna false
	}

	@Override
	public void insert(int element) {
		No auxHead = head;
		if(head.isNIL()) {
			No newHead = new No(element,head);
			head = newHead;
		}else {
			while(!(auxHead.prox.isNIL()))
				auxHead = auxHead.prox;
			No newNo = new No(element, auxHead.prox);
			auxHead.prox = newNo;
		}
	}

	@Override
	public void remove(int element) {
		No anterior = new No();
		if(head.valor == element)
			head = head.prox;
		else {
			No aux = head;
			while(!(aux.isNIL()) && aux.valor != element) {				
				anterior = aux;
				aux = aux.prox;
			}
			if(!(aux.isNIL()))
				anterior.prox = aux.prox;
		}
		
	}
}
