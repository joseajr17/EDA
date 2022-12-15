package atividade02;

import java.lang.reflect.Method;
import java.util.Random;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class BrincandoComOrdenacao {

	public static void main(String[] args) {
		int tamanho = 15000;
		Ordenacao ordenacao = new Ordenacao();


		/*
		 * Criação de arrays
		*/
		int[] array1 = new int[tamanho]; // Crescente
		for (int i = 0; i < tamanho; i++) {
			array1[i] = i;
		}

		int[] array2 = new int[tamanho]; // Decrescente
		for (int i = 0; i < tamanho; i++) {
			array2[i] = tamanho-i;
		}

		int[] array3 = new int[tamanho]; // Aleatório
		Random random = new Random();
		for (int i = 0; i < tamanho; i++) {
			array3[i] = random.nextInt(tamanho);
		}

		/*
		 * -=-=-=-=-=-=-=| Testes |=-=-=-=-=-=-==-  
		*/
		int quantidadeDeTestes = 5000;

		long startTime, finishTime; 

		
		// SelectionSort
		System.out.println("Selection Sort:");
		// Crescente
		startTime = getStartTime(); 
		for (int c = 0; c < quantidadeDeTestes; c++) {
			ordenacao.selectionSort(array1.clone());
		}
		finishTime = (getFinishTime(startTime)/quantidadeDeTestes);
		System.out.println("Crescente: "+ finishTime);

		
		// decrescente
		startTime = getStartTime(); 
		for (int c = 0; c < quantidadeDeTestes; c++) {
			ordenacao.selectionSort(array2.clone());
		}
		finishTime = (getFinishTime(startTime)/quantidadeDeTestes);
		System.out.println("Decrescente: "+ finishTime);

		// Aleatório
		startTime = getStartTime(); 
		for (int c = 0; c < quantidadeDeTestes; c++) {
			ordenacao.selectionSort(array3.clone());
		}
		finishTime = (getFinishTime(startTime)/quantidadeDeTestes);
		System.out.println("Aleatorio: "+ finishTime);
		System.out.println();

		
		// InsertionSort
		System.out.println("Insertion Sort:");
		// Crescente
		startTime = getStartTime(); 
		for (int c = 0; c < quantidadeDeTestes; c++) {
			ordenacao.insertionSort(array1.clone());
		}
		finishTime = (getFinishTime(startTime)/quantidadeDeTestes);
		System.out.println("Crescente: "+ finishTime);

		
		// decrescente
		startTime = getStartTime(); 
		for (int c = 0; c < quantidadeDeTestes; c++) {
			ordenacao.insertionSort(array2.clone());
		}
		finishTime = (getFinishTime(startTime)/quantidadeDeTestes);
		System.out.println("Decrescente: "+ finishTime);

		// Aleatório
		startTime = getStartTime(); 
		for (int c = 0; c < quantidadeDeTestes; c++) {
			ordenacao.insertionSort(array3.clone());
		}
		finishTime = (getFinishTime(startTime)/quantidadeDeTestes);
		System.out.println("Aleatorio: "+ finishTime);
		System.out.println();


		// MergeSort
		System.out.println("Merge Sort:");
		// Crescente
		startTime = getStartTime(); 
		for (int c = 0; c < quantidadeDeTestes; c++) {
			ordenacao.mergeSort(array1.clone());
		}
		finishTime = (getFinishTime(startTime)/quantidadeDeTestes);
		System.out.println("Crescente: "+ finishTime);

		
		// decrescente
		startTime = getStartTime(); 
		for (int c = 0; c < quantidadeDeTestes; c++) {
			ordenacao.mergeSort(array2.clone());
		}
		finishTime = (getFinishTime(startTime)/quantidadeDeTestes);
		System.out.println("Decrescente: "+ finishTime);

		// Aleatório
		startTime = getStartTime(); 
		for (int c = 0; c < quantidadeDeTestes; c++) {
			ordenacao.mergeSort(array3.clone());
		}
		finishTime = (getFinishTime(startTime)/quantidadeDeTestes);
		System.out.println("Aleatorio: "+ finishTime);
		System.out.println();

			
		// QuickSort
		System.out.println("Quick Sort:");
		// Crescente
		startTime = getStartTime(); 
		for (int c = 0; c < quantidadeDeTestes; c++) {
			ordenacao.quickSort(array1.clone());
		}
		finishTime = (getFinishTime(startTime)/quantidadeDeTestes);
		System.out.println("Crescente: "+ finishTime);

		
		// decrescente
		startTime = getStartTime(); 
		for (int c = 0; c < quantidadeDeTestes; c++) {
			ordenacao.quickSort(array2.clone());
		}
		finishTime = (getFinishTime(startTime)/quantidadeDeTestes);
		System.out.println("Decrescente: "+ finishTime);

		// Aleatório
		startTime = getStartTime(); 
		for (int c = 0; c < quantidadeDeTestes; c++) {
			ordenacao.quickSort(array3.clone());
		}
		finishTime = (getFinishTime(startTime)/quantidadeDeTestes);
		System.out.println("Aleatorio: "+ finishTime);
		System.out.println();

		
		// QuickSort_shuffle
		System.out.println("Quick Sort Shuffle:");
		// Crescente
		startTime = getStartTime(); 
		for (int c = 0; c < quantidadeDeTestes; c++) {
			ordenacao.quickSort_shuffle(array1.clone());
		}
		finishTime = (getFinishTime(startTime)/quantidadeDeTestes);
		System.out.println("Crescente: "+ finishTime);

		
		// decrescente
		startTime = getStartTime(); 
		for (int c = 0; c < quantidadeDeTestes; c++) {
			ordenacao.quickSort_shuffle(array2.clone());
		}
		finishTime = (getFinishTime(startTime)/quantidadeDeTestes);
		System.out.println("Decrescente: "+ finishTime);

		// Aleatório
		startTime = getStartTime(); 
		for (int c = 0; c < quantidadeDeTestes; c++) {
			ordenacao.quickSort_shuffle(array3.clone());
		}
		finishTime = (getFinishTime(startTime)/quantidadeDeTestes);
		System.out.println("Aleatorio: "+ finishTime);
		System.out.println();


		// CountingSort
		System.out.println("Counting Sort:");
		// Crescente
		startTime = getStartTime(); 
		for (int c = 0; c < quantidadeDeTestes; c++) {
			ordenacao.countingSort(array1.clone());
		}
		finishTime = (getFinishTime(startTime)/quantidadeDeTestes);
		System.out.println("Crescente: "+ finishTime);

		
		// decrescente
		startTime = getStartTime(); 
		for (int c = 0; c < quantidadeDeTestes; c++) {
			ordenacao.countingSort(array2.clone());
		}
		finishTime = (getFinishTime(startTime)/quantidadeDeTestes);
		System.out.println("Decrescente: "+ finishTime);

		// Aleatório
		startTime = getStartTime(); 
		for (int c = 0; c < quantidadeDeTestes; c++) {
			ordenacao.countingSort(array3.clone());
		}
		finishTime = (getFinishTime(startTime)/quantidadeDeTestes);
		System.out.println("Aleatorio: "+ finishTime);
		System.out.println();


	}

	public static long getStartTime() {
		long time = System.nanoTime();
		return time;
	}

	public static long getFinishTime(long start) {
		long time = System.nanoTime() - start;
		return time;
	}
}
