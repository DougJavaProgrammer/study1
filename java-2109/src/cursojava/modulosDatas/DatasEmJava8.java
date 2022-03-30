package cursojava.modulosDatas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatasEmJava8 {
	public static void main(String[] args) {
		LocalDate dataBase = LocalDate.parse("2019-10-05");
		System.out.println("Mais 5 dias: " +(dataBase = dataBase.plusDays(5)));
		System.out.println("Mais 5 semanas: " + (dataBase = dataBase.plusWeeks(5)));
		System.out.println("Mais 5 anos: " + (dataBase = dataBase.plusYears(5)));
		System.out.println("Mais 2 meses: " + (dataBase = dataBase.plusMonths(2)));
		
		System.out.println("Menos 1 ano: " + (dataBase = dataBase.minusYears(1)));
		
		for (int mes = 1; mes <=12; mes++) {
			dataBase = dataBase.plusMonths(1);
			
			System.out.println("Data de Vencimento do boleto: "+ dataBase.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " do Mês: " + mes);
		}
	}

}
