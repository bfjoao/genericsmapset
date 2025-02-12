package aplicacao;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
		
		//união
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);
		
		//intersecção
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);
		
		//diferença
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);
		
	}
}
