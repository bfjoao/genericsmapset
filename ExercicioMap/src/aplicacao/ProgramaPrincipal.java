package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Na contagem de votos de uma eleição, são gerados vários registros de votação contendo o nome do candidato e a quantidade de votos (formato .csv) que ele obteve em uma urna de votação. 
		 * Você deve fazer um programa para ler os registros de votação a partir de um arquivo, e daí gerar um relatório consolidado com os totais de cada candidato. */
		
		Scanner sc = new Scanner(System.in);

		// Criamos um Map para armazenar os votos de cada candidato
        // LinkedHashMap é usado para manter a ordem de inserção
		Map<String, Integer> votos = new LinkedHashMap<>();

		System.out.print("Insira o caminho do arquivo: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String linha = br.readLine();
			while (linha != null) {
				String[] campos = linha.split(",");
				String nome = campos[0];
				int cont = Integer.parseInt(campos[1]);

				// Se o candidato já está no map, soma os novos votos ao total existente
				if (votos.containsKey(nome)) {
					int votosAteAgora = votos.get(nome);    // Obtém o total de votos atual do candidato
					votos.put(nome, cont + votosAteAgora);  // Atualiza o total somando os novos votos
				} else {
					votos.put(nome, cont);  // Se for a primeira vez, adiciona o candidato com seus votos iniciais
				}

				// Lê a próxima linha do arquivo
				linha = br.readLine();
			}

			for (String key : votos.keySet()) {     // Para cada chave (nome do candidato), pega-se o valor associado (a quantidade de votos)
				System.out.println(key + ": " + votos.get(key));   // Para cada candidato, ele exibe o nome e o total de votos armazenado
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}

}
