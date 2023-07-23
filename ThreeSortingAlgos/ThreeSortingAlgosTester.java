package Sorting;

public class ThreeSortingAlgosTester {

	public static void main(String[] args) {

		int[] Arr = { 4, 5, 9, 8, 1, 2, 3, 6, 10, 7 };

		for (int i = 0; i < Arr.length; i++) {

			System.out.print(Arr[i] + " | ");
		}
		System.out.println(" ");

		System.out.println(" | Selection Sort :- ");
		ThreeSortingAlgos.selectionSort(Arr);
		for (int i = 0; i < Arr.length; i++) {

			System.out.print(Arr[i] + " | ");
		}
		System.out.println(" ");
		
		System.out.println(" | Insertion Sort :- ");
		ThreeSortingAlgos.insertionSort(Arr);
		for (int i = 0; i < Arr.length; i++) {

			System.out.print(Arr[i] + " | ");
		}
		System.out.println(" ");
		
		System.out.println(" | Bubble Sort :- ");
		ThreeSortingAlgos.bubbleSort(Arr);
		for (int i = 0; i < Arr.length; i++) {

			System.out.print(Arr[i] + " | ");
		}
		System.out.println(" ");

	}

}
