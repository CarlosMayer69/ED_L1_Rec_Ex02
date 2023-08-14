package view;

import controller.MenorValorRecController;

public class Principal {

	public static void main(String[] args) {
		
		MenorValorRecController mv = new MenorValorRecController();
		
	        int[] vetor = {4,7,1,20,33};
	        int tamanho = vetor.length;
	        int menorValor = mv.encontrarMenorValor(vetor, tamanho - 1);

	        System.out.println("O menor valor no vetor é: " + menorValor);
	    }

	}

