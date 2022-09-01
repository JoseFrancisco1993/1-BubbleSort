package view;


import controller.OrdenacaoControllerBubble;

public class PrincipalBubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vetor = {99,98,97,96,95,94,93,92,91};
		OrdenacaoControllerBubble oCont = new OrdenacaoControllerBubble();
		vetor = oCont.bubbleSort(vetor);
		
		System.out.println("");
		System.out.println("=======================================");
		for (int valor : vetor) {
			System.out.print(valor+" ");
		}
		System.out.println("");
		System.out.println("=======================================");
	}

}
