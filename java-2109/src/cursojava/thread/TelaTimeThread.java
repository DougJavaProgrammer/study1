package cursojava.thread;

import java.awt.Dimension;

import javax.swing.JDialog;

public class TelaTimeThread extends JDialog{ //necess�rio extender a classe JDialog
	
	public TelaTimeThread() { //executa o que tiver dentro no momento de abertura ou execu��o
		setTitle("Minha tela de time com Thread"); //t�tulo da tela
		setSize(new Dimension(340, 340)); //tamanho da tela
		setLocationRelativeTo(null);//centraliza a tela com base em algum componente como nesse caso tem apenas essa tela, usa-se par�metro null
		setResizable(false); //bloqueia a altera��o de dimens�o da tela
		/*Primeira parte Conclu�da*/
		
		
		
		
		
		//sempre ser� o �ltimo comando
		setVisible(true);//Torna a tela v�sivel para o usu�rio
	}

}
