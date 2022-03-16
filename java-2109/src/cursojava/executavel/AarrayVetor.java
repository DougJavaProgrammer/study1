package cursojava.executavel;

import javax.swing.JOptionPane;

public class AarrayVetor {
	public static void main(String[] args) {
		
		try {
		
		String posicoes = JOptionPane.showInputDialog(null, "Quantas posições o array deve ter? ");
		double [] notas = new double [Integer.parseInt(posicoes)];
		
		for (int pos = 0; pos < notas.length; pos++) {
			String valor = JOptionPane.showInputDialog("Qual o valor da posição "+ (pos+1));
			notas [pos] = Double.parseDouble(valor);
		}
				
		for (int pos = 0; pos < notas.length; pos++) {
			System.out.println("Nota "+(pos+1) + " é = "+notas[pos]);
	
		}
		
	}catch (Exception e) {
		JOptionPane.showMessageDialog(null, "Falha catastrófica \n"+e.getMessage());
	}
}
}

