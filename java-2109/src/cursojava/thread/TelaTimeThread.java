package cursojava.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog{ //necess�rio extender a classe JDialog
	/*Componentes da tela*/
	private JPanel jPanel = new JPanel(new GridBagLayout()); //painel de componentes
	
	private JLabel descricaoHora = new JLabel("Time Thread 1");
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("Time Thread 2");
	private JTextField mostraTempo2 = new JTextField();
	
	public TelaTimeThread() { //executa o que tiver dentro no momento de abertura ou execu��o
		setTitle("Minha tela de time com Thread"); //t�tulo da tela
		setSize(new Dimension(340, 340)); //tamanho da tela
		setLocationRelativeTo(null);//centraliza a tela com base em algum componente como nesse caso tem apenas essa tela, usa-se par�metro null
		setResizable(false); //bloqueia a altera��o de dimens�o da tela
		/*Primeira papreferredrte Conclu�da*/
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints(); //gerenciamento de posi��es de campos e bot�es na tela
		gridBagConstraints.gridx = 0; //posi��o inicial da primeira linha = 0
		gridBagConstraints.gridy = 0; //posi��o inicial da primeira coluna = o
		
		descricaoHora.setPreferredSize(new Dimension(200, 25));; //definindo tamanho da label descri��o hora
		jPanel.add(descricaoHora, gridBagConstraints); //adicionado label descricaohora na variavel jPanel e indicado o gerenciador de posi��es 
		
		mostraTempo.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++; //andou uma posi��o da coluna Y para baixo para mostrar o segundo componente mostraTempo
		jPanel.add(mostraTempo, gridBagConstraints);
		
		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		jPanel.add(descricaoHora2, gridBagConstraints);
		
		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		jPanel.add(mostraTempo2, gridBagConstraints);
		
		
		add(jPanel,BorderLayout.WEST);
		
		//sempre ser� o �ltimo comando
		setVisible(true);//Torna a tela v�sivel para o usu�rio
	}

}
