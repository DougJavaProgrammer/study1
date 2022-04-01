package arquivos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

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

		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(); // vai ser usado para escrever na planilha
		HSSFSheet linhasPessoa = hssfWorkbook.createSheet("Planilha de Pessoas JDEV Treinamento"); // criar a planilha

		int numeroLinha = 0; // iniciado do lado de fora do for para não resetar o numero de linhas a cada
								// iteração do for
		for (Pessoa p : pessoas) {
			Row linha = linhasPessoa.createRow(numeroLinha++); // criando uma linha para cada pessoa

			int celula = 0;

			Cell celNome = linha.createCell(celula++); // uma celula para cada linha
			celNome.setCellValue(p.getNome());

			Cell celEmail = linha.createCell(celula++); // uma celula para cada linha
			celEmail.setCellValue(p.getEmail());

			Cell celIdade = linha.createCell(celula++); // uma celula para cada linha
			celIdade.setCellValue(p.getIdade());

		} // terminou de montar a planilha

		FileOutputStream saida = new FileOutputStream(file);
		hssfWorkbook.write(saida); // escreve a planilha em arquivo
		saida.flush();
		saida.close();

		System.out.println("Planilha foi criada");

	}

}
