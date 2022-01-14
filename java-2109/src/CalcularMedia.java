import javax.swing.JOptionPane;

public class CalcularMedia {

	public static void main(String[] args) {

		String nota1 = JOptionPane.showInputDialog("Informe a nota 1");
		String nota2 = JOptionPane.showInputDialog("Informe a nota 2");
		String nota3 = JOptionPane.showInputDialog("Informe a nota 3");
		String nota4 = JOptionPane.showInputDialog("Informe a nota 4");

		double n1 = Double.parseDouble(nota1);
		double n2 = Double.parseDouble(nota2);
		double n3 = Double.parseDouble(nota3);
		double n4 = Double.parseDouble(nota4);

		double media = (n1 + n2 + n3 + n4) / 4;

		if (media >= 50) {

			if (media >= 70) {
				JOptionPane.showMessageDialog(null, "Aluno APROVADO com média " + media);
			} else {
				JOptionPane.showMessageDialog(null, "Aluno em RECUPERAÇÃO com média " + media);
			}

		} else {
			JOptionPane.showMessageDialog(null, "Aluno REPROVADO com média " + media);
		}

	}

}
