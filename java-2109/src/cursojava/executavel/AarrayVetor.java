package cursojava.executavel;

import javax.swing.JOptionPane;

public class AarrayVetor {
	public static void main(String[] args) {
		
		try {
		
		/*Array pode ser de todos os tipos de dados e objetos tamb�m*/
		//para tornar um array, basta colocar um "entre chaves" no final da variavel ou no final da decalara��o do tipo da variavel
		//Array sempre deve ter quantidade de posi��es definidas
		
		
		double[] notas = new double [5];
		
		/*Atribuir valor nas posi��es do Array*/
		notas [0] = 9.8;
		notas [1] = 7.8;
		notas [2] = 4.9;
		notas [3] = 6.6;
		notas [4] = 5.3;
		
		for (int pos = 0; pos < notas.length; pos++) {
			System.out.println("Nota "+(pos+1) + " � = "+notas[pos]);
		}
		
	}catch (Exception e) {
		JOptionPane.showMessageDialog(null, "Falha catastr�fica \n"+e.getMessage());
	}
}
}

