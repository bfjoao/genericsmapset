package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entidades.RegistroDeEntrada;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o caminho do arquivo: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			Set<RegistroDeEntrada> set = new HashSet<>();
			
			String line = br.readLine();
			while (line != null) {
				String[] campos = line.split(" ");
				String username = campos[0];
				Date momento = Date.from(Instant.parse(campos[1]));
				
				set.add(new RegistroDeEntrada(username, momento));
				
				line = br.readLine();
			}
			
			System.out.println("Total de usuários: " + set.size());
			
			
		} catch (IOException e) {
			System.out.println("Erro: " + e.getLocalizedMessage());
		}
		sc.close();
	}

}
