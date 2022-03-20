package cursojava.executavel;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SplitArray {
	public static void main(String[] args) {
		String texto = "Douglas, cuso Java, 80, 70, 90, 89";
		String [] valoresArray = texto.split(",");
		
		System.out.println("Nome do Aluno: " + valoresArray[0]);
		System.out.println("Curso: " + valoresArray[1]);
		System.out.println("Nota 1: " + valoresArray[2]);
		System.out.println("Nota 2: " + valoresArray[3]);
		System.out.println("Nota 3: " + valoresArray[4]);
		System.out.println("Nota 4: " + valoresArray[5]);
		
		//converterndo um array em uma lista
		
		List<String> list = Arrays.asList(valoresArray);
		
		for (String valorString : list) {
			System.out.println(valorString);
		}
		//convertendo uma lista em um array
		String [] converaoArray = list.toArray(new String [6]);
		
		for (int pos = 0; pos < converaoArray.length; pos++) {
			System.out.println(converaoArray[pos]);
		}
	}

}
