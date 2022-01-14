import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {
	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();
		
		/*é uma lista que dentro dela temos uma chave que identifica uma sequencia de valores também*/
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		
		List<Aluno> alunosAprovados = new ArrayList<Aluno>();
		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
		List<Aluno> alunosReprovados = new ArrayList<Aluno>();

		for (int qtd = 1; qtd <= 5; qtd++) {

			/*
			 * new Aluno é uma instancia (criação de objeto) Aluno é uma referencia para o
			 * objeto aluno
			 */

			String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + "?");
			/*
			 * String idade = JOptionPane.showInputDialog("Qual a idade do aluno?"); String
			 * dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento?");
			 * String rg = JOptionPane.showInputDialog("Qual o RG?"); String cpf =
			 * JOptionPane.showInputDialog("Qual o CPF?"); String mae =
			 * JOptionPane.showInputDialog("Qual o nome da mãe?"); String pai =
			 * JOptionPane.showInputDialog("Qual o nome do pai?"); String dataMatricula =
			 * JOptionPane.showInputDialog("Qual a data da matrícula?"); String serie =
			 * JOptionPane.showInputDialog("Qual a série?"); String escola =
			 * JOptionPane.showInputDialog("Qual o nome da Escola?");
			 */

			Aluno aluno1 = new Aluno();

			aluno1.setNome(nome);
			/*
			 * aluno1.setIdade(Integer.valueOf(idade));
			 * aluno1.setDataMatricula(dataMatricula);
			 * aluno1.setDataNascimento(dataNascimento); aluno1.setNomePai(pai);
			 * aluno1.setNomeMae(mae); aluno1.setNomeEscola(escola);
			 * aluno1.setSerieMatriculada(serie); aluno1.setNumeroCpf(cpf);
			 * aluno1.setRegistroGeral(rg);
			 */

			for (int pos = 1; pos <= 1; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina " + pos + ": ");
				String notaDisciplina = JOptionPane.showInputDialog("Digite a nota " + pos + ": ");
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);

			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina? ");

			if (escolha == 0) {

				int continuarRemover = 0;
				int posicao = 1;

				while (continuarRemover == 0) {

					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4? ");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar removendo?");

				}
			}

			alunos.add(aluno1);
		}
		for (Aluno aluno : alunos) {
			if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.APROVADO)) {
				alunosAprovados.add(aluno);

			} else {
				if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					alunosRecuperacao.add(aluno);
				} else {
					alunosReprovados.add(aluno);
				}
			}

		}
		System.out.println("---------------------Lista dos Aprovados---------------------");
		for (Aluno aluno : alunosAprovados) {
			System.out.println("Resultado = "+aluno.getNome() + aluno.getAlunoAprovado()+ " com média de = " + aluno.getMediaNota());
		}
		System.out.println("---------------------Lista dos Reprovados---------------------");
		for (Aluno aluno : alunosReprovados) {
			System.out.println("Resultado = " + aluno.getAlunoAprovado()+ " com média de = " + aluno.getMediaNota());
		}
		System.out.println("---------------------Lista dos Recuperação---------------------");
		for (Aluno aluno : alunosRecuperacao) {
			System.out.println("Resultado = " + aluno.getAlunoAprovado()+ " com média de = " + aluno.getMediaNota());
		}
	}

}
