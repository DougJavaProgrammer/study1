package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class AarrayVetor {
	public static void main(String[] args) {

		try {
			double[] notas = { 8.8, 9.7, 7.6, 5.4 };
			double[] notasLogica = { 9.9, 7.9, 6.9, 9.7 };

			/* Criação do aluno */
			Aluno aluno = new Aluno();
			aluno.setNome("Douglas Oliveira");
			aluno.setNomeEscola("JavaDev");

			/* Criação da disciplina */
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina("Curso de Java");
			disciplina.setNota(notas);
			aluno.getDisciplinas().add(disciplina);

			/* Criação do disciplina2 */
			Disciplina disciplina2 = new Disciplina();
			disciplina2.setDisciplina("Lógica de Programação");
			disciplina2.setNota(notasLogica);
			aluno.getDisciplinas().add(disciplina2);

			System.out.println(
					"Nome do aluno: " + aluno.getNome() + "\n" + "Inscrito no curso: " + aluno.getNomeEscola());
			System.out.println("------Disciplinas do aluno-------");

			// for para percorrer a lista de displinas
			for (Disciplina d : aluno.getDisciplinas()) {
				System.out.println("Disciplina: " + d.getDisciplina());
				System.out.println("Notas da disciplina: ");

				double notaMax = 0.0; // variável auxiliar para armazenar a maior nota do aluno
				double notaMin = 0.0; // variável auxiliar para armazenar a menor nota do aluno

				// for para percorrer as notas de cada disciplina
				for (int pos = 0; pos < d.getNota().length; pos++) {
					System.out.println("Nota " + (pos + 1) + " = " + d.getNota()[pos]);
					if (pos == 0) {
						notaMax = d.getNota()[pos];
						notaMin = d.getNota()[pos];
					} else {
						if (d.getNota()[pos] > notaMax) {
							notaMax = d.getNota()[pos];
						}
					}
					if (d.getNota()[pos] < notaMin) {
						notaMin = d.getNota()[pos];
					}
				}
				System.out.println("A maior nota da disciplina " + d.getDisciplina() + " é " + notaMax);
				System.out.println("A menor nota da disciplina " + d.getDisciplina() + " é " + notaMin);

			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Falha catastrófica \n" + e.getMessage());
		}
	}
}
