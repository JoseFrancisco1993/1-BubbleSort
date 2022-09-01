package view;

import controller.OrdenacaoControllerMerge;

public class PrincipalMerge {
	public static void main(String[] args) {
		int[] vetor = {99,98,97,96,95,94,93,92,91};
		OrdenacaoControllerMerge oMergeSort = new OrdenacaoControllerMerge();
        vetor = oMergeSort.mergeSort(vetor , 0 , vetor.length - 1);
		
		System.out.println("");
		System.out.println("===============================");
		for (int valor : vetor) {
			System.out.print(valor + " ");
		}
		System.out.println("");
		System.out.println("===============================");
	}
}