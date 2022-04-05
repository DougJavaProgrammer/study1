package arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoiEditando {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Douglas\\git\\study1\\java-2109\\src\\arquivos\\arquivo_excel.xls");
		if (!file.exists()) {
			file.createNewFile();
		}

		FileInputStream entrada = new FileInputStream(file);
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada); // prepara a entrada do arquivo
		HSSFSheet planilha = hssfWorkbook.getSheetAt(0); // pegando a primeira planilha

		Iterator<Row> linhaIterator = planilha.iterator(); // percorrer as linhas da planilha

		while (linhaIterator.hasNext()) { // enquanto tiver linhas
			Row linha = linhaIterator.next(); //dados da pessoa na linha
			int numeroCelulas = linha.getPhysicalNumberOfCells(); // retorna o numero de c�lulas f�sicas de cada linha
			Cell cell = linha.createCell(numeroCelulas); //cria nova celula para adicionar por exemplo o salario abaixo em cada linha
			cell.setCellValue("5.487,20"); //salario a ser adicionada em cada linha
		}
		entrada.close();
		FileOutputStream saida = new FileOutputStream(file);
		hssfWorkbook.write(saida);
		saida.flush();
		saida.close();
		
		System.out.println("Planila atualizada");

	}

}
