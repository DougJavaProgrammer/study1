package arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivos {
	public static void main(String[] args) throws IOException {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setEmail("pessoa1@gmail.com");
		pessoa1.setIdade(51);
		pessoa1.setNome("Nome Pessoa 1");
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setEmail("pessoa2@gmail.com");
		pessoa2.setIdade(52);
		pessoa2.setNome("Nome Pessoa 2");
		      
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setEmail("pessoa3@gmail.com");
		pessoa3.setIdade(53);
		pessoa3.setNome("Nome Pessoa 3");
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		
		File arquivo = new File("C:\\Users\\Douglas\\git\\study1\\java-2109\\src\\arquivos\\arquivo.txt");
		
		if(!arquivo.exists()) { //se o arquivo nãe existir
			arquivo.createNewFile(); //criar um novo arquivo
		}
		FileWriter escrever_no_arquivo = new FileWriter(arquivo);
				
		for(Pessoa pessoa : pessoas) {
			escrever_no_arquivo.write(pessoa.getNome() + ";"+pessoa.getEmail()+";"+pessoa.getIdade()+";"+"\n");
		}
		
		/*for(int i = 1; i <= 10; i++) {
			escrever_no_arquivo.write("Texto da minha linha "+i+ "\n");;
			
			
		}*/
		escrever_no_arquivo.flush();
		escrever_no_arquivo.close();
	}

}
