package cursojava.thread;

import java.awt.Dimension;

import javax.swing.JDialog;

public class TelaTimeThread extends JDialog{ //necessário extender a classe JDialog
	
	public TelaTimeThread() { //executa o que tiver dentro no momento de abertura ou execução
		setTitle("Minha tela de time com Thread"); //título da tela
		setSize(new Dimension(340, 340)); //tamanho da tela
		setLocationRelativeTo(null);//centraliza a tela com base em algum componente como nesse caso tem apenas essa tela, usa-se parâmetro null
		setResizable(false); //bloqueia a alteração de dimensão da tela
		/*Primeira parte Concluída*/
		
		
		
		
		
		//sempre será o último comando
		setVisible(true);//Torna a tela vísivel para o usuário
	}

}
