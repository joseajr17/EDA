package atividade01;

public class Busca implements Busca_IF {

	@Override
	public int[] geraVetorNumericoOrdenado(int tamanho) {
		
		int[] vetor = new int[tamanho];
		
		for(int i=0; i<tamanho; i++ ) {
			vetor[i] = i+1;
		}
		return vetor;
	}

	@Override
	public boolean buscaLinear_iterativa(int[] numeros, int num) {
		for (int i = 0; i < numeros.length; i++)
         if (numeros[i] == num)
             return true;
     return false;
	}

	@Override
	public boolean buscaLinear_recursiva(int[] numeros, int num) {
		int tam = numeros.length-1;
		int busca = blr(numeros, tam, num);
		
		if (busca == 0) {
			return false;
		} else {
			return true;
		}
	}

	private int blr(int[] numeros, int tam, int num) {
		if (tam < 0)
			return 0;
		else if(numeros[tam] == num)
			return num;
		
		return blr(numeros, tam-1, num);
	}

	@Override
	public boolean buscaBinaria_iterativa(int[] numeros, int num) {
		int tamanho = numeros.length;
		int inferior = 0;
		int superior = tamanho-1;
     	int meio;

		while (inferior <= superior){
			meio = (inferior + superior)/2;
          if (num == numeros[meio])
               return true;
          if (num < numeros[meio])
               superior = meio-1;
          else
               inferior = meio+1;
     }		
		return false;
	}

	@Override
	public boolean buscaBinaria_recursiva(int[] numeros, int num) {
		if (bbr(numeros, 0, numeros.length - 1, num) == 0)
			return false;
		else 
			return true;
	}
	
	private static int bbr(int[] numeros, int inferior, int superior, int num) {
		int meio = (superior + inferior) / 2;

		if (inferior > superior)
			return 0; //nao achou
		else if(numeros[meio] == num) 
			return 2; // tá no meio
		else if (numeros[meio] < num)
			return bbr(numeros, meio+1, superior, num);
		else
			return bbr(numeros, inferior, meio-1, num);
	}
	
	
}
