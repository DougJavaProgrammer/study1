import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classesasauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;
import cursojava.excecao.ExcecaoProcessarNota;
import cursojava.interfaces.PermitirAcesso;

public class PrimeiraClasseJava {
	public static void main(String[] args) {
			try {
				
				lerArquivo();
		/*Criando uma simples validação de permissão de acesso*/
		String login = JOptionPane.showInputDialog("Digite o Login: ");
		String senha = JOptionPane.showInputDialog("Digite o Senha: ");
		
		FuncaoAutenticacao autenticacao = new FuncaoAutenticacao();
		
		
		PermitirAcesso permitirAcesso = new Diretor(login, senha); 
				
				
		if (autenticacao.autenticarCursoJava(permitirAcesso)) { /*vou travar o contrato para autorizar somente quem tem o contrato 100% legítimo*/
			
			
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		/*é uma lista que dentro dela temos uma chave que identifica uma sequencia de valores também*/
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		
	

		for (int qtd = 1; qtd <= 1; qtd++) {

			/*
			 * new Aluno é uma instancia (criação de objeto) Aluno é uma referencia para o
			 * objeto aluno
			 */

			String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + "?");
			String idade = JOptionPane.showInputDialog("Qual a idade do aluno " + qtd + "?");
			/*
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
			aluno1.setIdade(Integer.valueOf(idade));
			
			/*
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
		
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		
		
		for (Aluno aluno : alunos) {
			if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);

			} else {
				if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno);
				} else {
					maps.get(StatusAluno.REPROVADO).add(aluno);
				}
			}

		}
		System.out.println("---------------------Lista dos Aprovados---------------------");
		for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println("Resultado = "+aluno.getNome() +" - "+ aluno.getAlunoAprovado()+ " com média de = " + aluno.getMediaNota());
		}
		System.out.println("---------------------Lista dos Reprovados---------------------");
		for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println("Resultado = " + aluno.getNome()+" - "+ aluno.getAlunoAprovado()+ " com média de = " + aluno.getMediaNota());
		}
		System.out.println("---------------------Lista dos Recuperação---------------------");
		for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println("Resultado = " +aluno.getNome()+" - " + aluno.getAlunoAprovado()+ " com média de = " + aluno.getMediaNota());
		}
		
		
	} else {
		JOptionPane.showMessageDialog(null, "Acesso não permitido");
	}
			}catch (NumberFormatException e) {
				StringBuilder saida = new StringBuilder();
				
				e.printStackTrace();//imprime o erro no console Java
				
				for (int i = 0; i < e.getStackTrace().length; i++) {
					saida.append("\n Classe de erro: " + e.getStackTrace()[i].getClassName());
					saida.append("\n Método do erro: " + e.getStackTrace()[i].getMethodName());
					saida.append("\n Linha de erro: "+ e.getStackTrace()[i].getLineNumber());
					saida.append("\n Class "+ e.getClass().getName());
				}
				
				JOptionPane.showMessageDialog(null, "Erro de conversão número \n" + saida.toString());
			}catch (NullPointerException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
				
			}catch (Exception e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Erro inesperado: "+ e.getMessage());
			}finally {/*Sempre é executado ocorrendo erros ou não*/
				JOptionPane.showMessageDialog(null, "Obrigado por aprender JAVA");
			}
		
	}
	public static void lerArquivo () throws ExcecaoProcessarNota {
		try {
		//File fil = new File("arquivo.txt");	
		//Scanner scanner = new Scanner(fil);
		}catch (Exception e) {
			e.printStackTrace();
		}
		}
			
}
