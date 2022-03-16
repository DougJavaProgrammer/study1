package cursojava.executavel;

import javax.swing.JOptionPane;

public class AarrayVetor {
	public static void main(String[] args) {
		
		try {
		/*Diferentes formas de atribuição de valores*/
		String [] valores = new String [4];
		valores[0] = "douglas";
		valores[1] = "90";
		valores[2] = "curso de Java";
		valores[3] = "dougmoroli@gmail.com";
			
								
		for (int pos = 0; pos < valores.length; pos++) {
			System.out.println("Valor na posição "+(pos+1) + " é = "+valores[pos]);
	
		}
		
	}catch (Exception e) {
		JOptionPane.showMessageDialog(null, "Falha catastrófica \n"+e.getMessage());
	}
}
}

