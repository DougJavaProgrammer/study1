package cursojava.classesasauxiliares;

import cursojava.interfaces.PermitirAcesso;

/*Realmente e somente receber alguem que tem o contrato da interface PermitirAcesso e chamar o autenticar*/

public class FuncaoAutenticacao {

	public boolean autenticarCursoJava (PermitirAcesso acesso) {
		return acesso.autenticar();
	}
	
}
