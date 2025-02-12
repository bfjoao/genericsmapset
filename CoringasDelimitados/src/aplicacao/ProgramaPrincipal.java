package aplicacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();

		copy(myInts, myObjs);
		printList(myObjs);

		copy(myDoubles, myObjs);
		printList(myObjs);
	}

	/**
     * Método genérico para copiar elementos de uma lista de números para outra lista.
     * 
     * origem Lista de números (qualquer classe que herde de Number)
     * destino Lista de objetos que podem armazenar números (ou tipos superiores a Number)
     */
    public static void copy(List<? extends Number> origem, List<? super Number> destino) {
        for (Number number : origem) {
            destino.add(number); // Adiciona os elementos da lista de origem na lista de destino
        }
    }
    
    public static void printList(List<?> list) {
    	for (Object obj : list) {
    		System.out.print(obj + " ");
    	}
    	System.out.println();
    }
}
