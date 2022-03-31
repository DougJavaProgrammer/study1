package arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerArquivoTxt {
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream entradaArquivo = new FileInputStream(
				new File("C:\\Users\\Douglas\\git\\study1\\java-2109\\src\\arquivos\\arquivo.csv"));

		Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		while (lerArquivo.hasNext()) { // enquanto o lerArquivo tiver dados
			String linha = lerArquivo.nextLine();

			if (linha != null && !linha.isEmpty()) {
				String [] dados = linha.split("\\;"); //quebra a linha do arquivo em várias dados separados por ; no array
				Pessoa pessoa = new Pessoa();
				pessoa.setNome(dados[0]);
				pessoa.setEmail(dados[1]);
				pessoa.setIdade(Integer.parseInt(dados[2]));
				
				pessoas.add(pessoa);
				
			}
		}
		lerArquivo.close();
		for (Pessoa pessoa : pessoas) { //com a lista em mãos, pode gravar no banco de dados ou fazer qlq coisa....
			System.out.println(pessoa);
		}
	}
}
