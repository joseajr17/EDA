package atividade02;
import java.util.Random;


public class Ordenacao implements Ordenacao_IF{

	@Override
	public boolean checaVetorOrdenado(int[] numeros) {
		for (int i = 1; i < numeros.length; i++)
			if (numeros[i - 1] > numeros[i])
				return false;
	    return true;
	}
	
	@Override
	public long selectionSort(int[] numeros) {
		int tamanho = numeros.length;
		for (int i = 0; i < tamanho; ++i) {
	        int min = i;
	        for (int j = i+1; j < tamanho; ++j) {
	            if (numeros[j] < numeros[min]) {
	                min = j;
	            }
	        }
	        trocaVetor(numeros, i, min);
	        
	    }
		return 0;
	}

	@Override
	public long insertionSort(int[] numeros) {
        for (int c = 1; c < numeros.length; c++) {
            for (int i = 0; i < c; i++) {
                if (numeros[c] < numeros[i]) {
                    int[] arrCopy = numeros.clone();
                    numeros[i] = arrCopy[c];

                    for (int e = i; e < c; e++) {
                        numeros[e+1] = arrCopy[e];
                    }
                    break;
                }
            }
        }

        return 0;
    }

	@Override
	public long mergeSort(int[] numeros) {		
		
		mergeSort2(numeros, 0, numeros.length);
		
		return 0;
	}

	@Override
	public long quickSort(int[] numeros) {
		quickSort2(numeros, 0, numeros.length-1);

		return 0;
	}

	@Override
	public long quickSort_shuffle(int[] numeros) {

		shuffle(numeros);

		quickSort2(numeros, 0, numeros.length-1);

		return 0;
	}

	@Override
	public long countingSort(int[] numeros) {
    	int minValor = Integer.MAX_VALUE;
    	int maxValor = Integer.MIN_VALUE;

    	for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < minValor) {
				minValor = numeros[i];
			}
			if (numeros[i] > maxValor) { 
				maxValor = numeros[i];
			}
    	}

    	countingSort2(numeros, minValor, maxValor);
		return 0;
	}

	private static void countingSort2(int[] ar, int minVal, int maxVal) {
		int tamanho = maxVal - minVal + 1;
		int[] b = new int[tamanho];

		for (int i = 0; i < ar.length; i++) { 
			b[ar[i] - minVal]++;
		}

		for (int i = 0, k = 0; i < tamanho; i++) {
			while (b[i]-- > 0) {
				ar[k++] = i + minVal;
			}
    	}

  	}


	/*
	 * -=-=-=-=-=-=| Métodos auxiliares |=-=-=-=-=-=
	*/

	public void shuffle(int[] array) {
		Random random = new Random();

		if (random == null) random = new Random();

		for (int i = array.length; i > 1; i--) {
			trocaVetor(array, i - 1, random.nextInt(i));
		}
  }
	
	public void mergeSort2(int[] numeros, int left, int right){
		if (right - left < 2) {
			return;
		}
		
		mergeSort2(numeros, left, left + (right - left) / 2);
		mergeSort2(numeros, left + (right - left) / 2, right);
		merge(numeros, left, left + (right - left) / 2, right);
	}
	

	public int partVetor(int[] numbers, int esquerda, int direita) {
		int pivo = numbers[direita];
		int i = esquerda - 1;

		for (int j = esquerda; j < direita; ++j) {
			if (numbers[j] <= pivo) {
				trocaVetor(numbers, ++i, j);
			}
		}

		trocaVetor(numbers, ++i, direita);
		return i;
	}

	public void quickSort2(int[] numbers, int esquerda, int direita) {
		if (esquerda < direita) {
			int pivoIndex = partVetor(numbers, esquerda, direita);

			quickSort2(numbers, esquerda, pivoIndex - 1);
			quickSort2(numbers, pivoIndex, direita); 
		}
	}


	
	public void merge(int[] numeros, int left, int m, int right){
		int tamanho = numeros.length;
		int[] arrayTemporario = new int[tamanho];
		int ai = left, bi = m, ti = left;

		while (ai < m || bi < right){
			if (ai == m)
				arrayTemporario[ti++] = numeros[bi++];
			else if (bi == right)
				arrayTemporario[ti++] = numeros[ai++];
			else if (numeros[ai] < numeros[bi])
				arrayTemporario[ti++] = numeros[ai++];
			else
				arrayTemporario[ti++] = numeros[bi++]; 
		}

		for (ti = left; ti < right; ti++) {
			numeros[ti] = arrayTemporario[ti];
		}
	}

	private void trocaVetor(int[] numeros, int i, int min) {
		int posAtual = numeros[i];

		numeros[i] = numeros[min];
		numeros[min] = posAtual;
	}
	
	public void exibir(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("[" + numeros[i] + "]");
		}
		
		System.out.println("\n");
		
	}

}
