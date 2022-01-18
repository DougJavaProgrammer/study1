import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Douglas Aluno");
		aluno.setIdade(16);
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("32.661.548-9");
		diretor.setNome("Douglas Diretor");
		diretor.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Tecnologia");
		secretario.setIdade(22);

		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade()+ " - "+ aluno.msgMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
	}
	

}
