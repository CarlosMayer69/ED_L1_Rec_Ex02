/* 2. Criar uma aplicação em Java que tenha uma função recursiva que, 
 * recebendo um vetor de inteiros, o tamanho do vetor e 
 * o valor da última posição do vetor como o primeiro menor valor, 
 * retorne o menor valor contido neste vetor. 
 * O Código deve apresentar, em formato de comentário, 
 * como foi definida a condição de parada; 
 * O Código deve apresentar, em formato de comentário, 
 * como foi definida a relação de chamada dos passos.
*/

package controller;

public class MenorValorRecController {

	public MenorValorRecController() {
		super();
	}
	
	public static int encontrarMenorValor(int[] vetor, int posicao) {
	        // Condição de parada: quando a posição for 0, 
		    // o menor valor é o valor na posição 0
	        if (posicao == 0) {
	            return vetor[posicao];
	        }

	        // Chamada recursiva: compara o valor atual com 
	        // o menor valor encontrado no restante do vetor
	        int menorValorRestante = encontrarMenorValor(vetor, posicao - 1);
	        return Math.min(vetor[posicao], menorValorRestante);
	    }
	}



