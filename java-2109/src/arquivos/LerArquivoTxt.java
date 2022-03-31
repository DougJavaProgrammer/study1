package arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerArquivoTxt {
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream entradaArquivo = new FileInputStream(
				new File("C:\\Users\\Douglas\\git\\study1\\java-2109\\src\\arquivos\\arquivo.txt"));

		Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");

		while (lerArquivo.hasNext()) { // enquanto o lerArquivo tiver dados
			String linha = lerArquivo.nextLine();

			if (linha != null && !linha.isEmpty()) {
				System.out.println(linha);
			}
		}
		lerArquivo.close();
	}
}
