package arquivos;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import com.sun.jdi.DoubleValue;

public class ApachePoi2 {
	public static void main(String[] args) throws IOException {
		FileInputStream entrada = new FileInputStream(
				"C:\\Users\\Douglas\\git\\study1\\java-2109\\src\\arquivos\\arquivo_excel.xls");

		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada); // prepara a entrada do arquivo excel para ler
		HSSFSheet planilha = hssfWorkbook.getSheetAt(0); //pega a primeira planilha do arquivo excel
		
		Iterator<Row> linhaIterator = planilha.iterator(); //percorre as linhas da planilha
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>(); //criar a lista de pessoas
		
		while (linhaIterator.hasNext()) { //enquanto tiver linha na planilha
			Row linha = linhaIterator.next(); //dados da pessoas na linha
			
			Iterator<Cell> celulas = linha.iterator();
			
			Pessoa pessoa = new Pessoa();
			
			while (celulas.hasNext()) { //enquanto tiver células
				Cell cell = celulas.next(); //pega cada célula
				
				switch (cell.getColumnIndex()) {
				case 0:
					pessoa.setNome(cell.getStringCellValue());
					break;
				case 1:
					pessoa.setEmail(cell.getStringCellValue());
					break;
				case 2:
					pessoa.setIdade(Double.valueOf(cell.getNumericCellValue()).intValue());
					break;
				}
			} //fim das células da linha
			pessoas.add(pessoa);
		}
		entrada.close();
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
			
		}
	
	}

}
