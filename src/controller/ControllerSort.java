package controller;

import br.edu.fateczl.quicksort.QuickSort;

public class ControllerSort {

	public ControllerSort() {
		super();
	}

	public void sort(QuickSort sortQ, int[] vetor) {
		int tamanho = vetor.length;
		int[] qVetor = new int[tamanho];

		for (int i = 0; i < tamanho; i++) {
			qVetor[i] = vetor[i];
		}

		qVetor = sortQ.quick(qVetor, 0, tamanho - 1);

		System.out.println("\nVetor Original:");
		printVetor(vetor);

		System.out.println("\nQuick:");
		printVetor(qVetor);

	}

	private void printVetor(int[] vetor) {
		for (int i : vetor) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
