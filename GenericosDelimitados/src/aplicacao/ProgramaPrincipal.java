package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entidades.Produto;
import servicos.ServicoCalculo;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Produto> list = new ArrayList<>();
		
		String arq = "C:\\temp\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(arq))){
			String linha = br.readLine();
			while(linha != null) {
				String[] campos = linha.split(",");
				list.add(new Produto(campos[0], Double.parseDouble(campos[1])));
				linha = br.readLine();
			}
			
			Produto x = ServicoCalculo.max(list);
			System.out.println("Mais caro:");
			System.out.println(x);
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
