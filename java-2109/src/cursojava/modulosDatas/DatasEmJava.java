package cursojava.modulosDatas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {
	public static void main(String[] args) throws ParseException {

		//Classe depreciada, apenas para estudo
		Date date = new Date();
		System.out.println("Data em milisegundos: " + date.getTime());
		System.out.println("Dia do Mês: " + date.getDate());
		System.out.println("Dia da semana: " + date.getDay());
		System.out.println("Hora do dia: " + date.getHours());
		System.out.println("Minuto do dia: " + date.getMinutes());
		System.out.println("Segundo do dia: " + date.getSeconds());
		System.out.println("Ano: " + (date.getYear()+ 1900));
		
		/*Simple Date Format*/
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy - HH:mm.ss");
		System.out.println("Data atual em formato padão e String: "+simpleDateFormat.format(date));
		
		simpleDateFormat = new SimpleDateFormat("yyy-MM-dd");
		System.out.println("Data atual em formato para banco de dados: "+simpleDateFormat.format(date));
		
		System.out.println("Obejto Date: "+ simpleDateFormat.parse("1987-10-18"));

	}

}
