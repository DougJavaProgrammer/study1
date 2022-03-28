package cursojava.modulosDatas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DatasEmJava2 {
	
	public static void main(String[] args) throws ParseException {
		Calendar calendar = Calendar.getInstance(); //pega a data atual

		
		/*Simular que a data vem do banco de dados*/
		
		calendar.setTime(new SimpleDateFormat("dd/MM/yyyy").parse("10/03/2022")); //definindo uma data qualquer
		
		calendar.add(Calendar.DAY_OF_MONTH, -10); //add adiciona ou subtrai um montante,  no caso dias do m�s 
	
		
		System.out.println("Somando os dias: "+new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.MONTH, 1);//somando o m�s
		System.out.println("Somando o M�s: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
	}

}
