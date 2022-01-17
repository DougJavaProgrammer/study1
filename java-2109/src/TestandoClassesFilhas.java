import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Douglas Aluno");
		
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("32.661.548-9");
		diretor.setNome("Douglas Diretor");
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Tecnologia");

		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
	}

}
