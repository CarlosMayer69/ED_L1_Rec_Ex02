/* 2. Criar uma aplica��o em Java que tenha uma fun��o recursiva que, 
 * recebendo um vetor de inteiros, o tamanho do vetor e 
 * o valor da �ltima posi��o do vetor como o primeiro menor valor, 
 * retorne o menor valor contido neste vetor. 
 * O C�digo deve apresentar, em formato de coment�rio, 
 * como foi definida a condi��o de parada; 
 * O C�digo deve apresentar, em formato de coment�rio, 
 * como foi definida a rela��o de chamada dos passos.
*/

package controller;

public class MenorValorRecController {

	public MenorValorRecController() {
		super();
	}
	
	public static int encontrarMenorValor(int[] vetor, int posicao) {
	        // Condi��o de parada: quando a posi��o for 0, 
		    // o menor valor � o valor na posi��o 0
	        if (posicao == 0) {
	            return vetor[posicao];
	        }

	        // Chamada recursiva: compara o valor atual com 
	        // o menor valor encontrado no restante do vetor
	        int menorValorRestante = encontrarMenorValor(vetor, posicao - 1);
	        return Math.min(vetor[posicao], menorValorRestante);
	    }
	}



