package arquivos;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ApachePoi {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Douglas\\git\\study1\\java-2109\\src\\arquivos\\arquivo_excel.xls");
		if (!file.exists()) {
			file.createNewFile();

		}
		
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
		
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(); //vai ser usado para escrever na planilha
		
		
	}

}
