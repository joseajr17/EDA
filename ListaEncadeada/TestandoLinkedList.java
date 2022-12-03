
public class TestandoLinkedList {

	public static void main(String[] args) {
		LinkedList lista = new LinkedList();
		System.out.println(lista.isEmpty()); //true
		lista.insert(1);
		System.out.println(lista.size()); // 1
		lista.insert(2);
		System.out.println(lista.size()); // 2
		lista.insert(3);
		System.out.println(lista.size()); // 3
		System.out.println(lista.search(2)); // true
		lista.remove(2);
		System.out.println(lista.size()); // 2
		System.out.println(lista.search(2)); // false	
	}

}
