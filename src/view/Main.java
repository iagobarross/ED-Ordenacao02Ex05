package view;

import br.edu.fateczl.quicksort.QuickSort;
import controller.ControllerSort;

public class Main {

	public static void main(String[] args) {
		QuickSort sortQ = new QuickSort();
		ControllerSort contSort = new ControllerSort();
		
		int[] vetor1 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		int[] vetor2 = {44, 43, 42, 41, 40, 39, 38};
		int[] vetor3 = {31, 32, 33, 34, 99, 98, 97, 96};
		
		contSort.sort(sortQ, vetor1);
		contSort.sort(sortQ, vetor2);
		contSort.sort(sortQ, vetor3);
		
	}

}
