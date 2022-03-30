package cursojava.modulosDatas;

import java.time.LocalDate;
import java.time.Period;

public class DatasEmJava7 {
	public static void main(String[] args) {
		LocalDate dataAntiga = LocalDate.of(2020, 2, 7);
		LocalDate dataNova = LocalDate.of(2021, 7, 4);
		
		System.out.println("Data antiga é maior que data nova: "+ dataAntiga.isAfter(dataNova));
		System.out.println("Data antiga é anterior a data nova: "+ dataAntiga.isBefore(dataNova));
		System.out.println("Datas são iguais: "+ dataAntiga.isEqual(dataNova));
		
		
		Period periodo = Period.between(dataAntiga, dataNova);
		System.out.println("Quantos dias nessa faixa de período: "+ periodo.getDays());
		System.out.println("Quantos dias nessa faixa de período: "+ periodo.getMonths());
		System.out.println("Quantos dias nessa faixa de período: "+ periodo.getYears());
	}
	

}
