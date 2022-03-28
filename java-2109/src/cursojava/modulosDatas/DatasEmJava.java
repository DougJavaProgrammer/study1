package cursojava.modulosDatas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatasEmJava {
	public static void main(String[] args) throws ParseException {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

		Date dataVencimentoBoleto = simpleDateFormat.parse("10/04/2022");
		Date dataAtualHoje = simpleDateFormat.parse("11/04/2022");	
		
		if(dataVencimentoBoleto.after(dataAtualHoje)) { //after verifica se a data 1(vencimento) é maior que a data 2(atual)
			System.out.println("Boleto não vencido"); //tambem existe o before, que verifica o contrário do after
			
			
		}else {
			System.out.println("Boleto vencido - urgente");
		}
	}

}
