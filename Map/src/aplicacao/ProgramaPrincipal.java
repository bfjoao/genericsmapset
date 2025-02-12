package aplicacao;

import java.util.HashMap;
import java.util.Map;

import entidades.Produto;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Produto, Double> estoque = new HashMap<>();
		
		Produto p1 = new Produto("Tv", 900.0);
		Produto p2 = new Produto("Notebook", 1200.0);
		Produto p3 = new Produto("Tablet", 400.0);
		
		estoque.put(p1, 10000.0);
		estoque.put(p1, 20000.0);
		estoque.put(p1, 15000.0);
		
		Produto ps = new Produto("Tv", 900.0);
		
		System.out.println("Contem chave ps: " + estoque.containsKey(ps));
	}

}
