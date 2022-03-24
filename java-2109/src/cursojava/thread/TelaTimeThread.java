package cursojava.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog{ //necessário extender a classe JDialog
	/*Componentes da tela*/
	private JPanel jPanel = new JPanel(new GridBagLayout()); //painel de componentes
	
	private JLabel descricaoHora = new JLabel("Time Thread 1");
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("Time Thread 2");
	private JTextField mostraTempo2 = new JTextField();
	
	public TelaTimeThread() { //executa o que tiver dentro no momento de abertura ou execução
		setTitle("Minha tela de time com Thread"); //título da tela
		setSize(new Dimension(340, 340)); //tamanho da tela
		setLocationRelativeTo(null);//centraliza a tela com base em algum componente como nesse caso tem apenas essa tela, usa-se parâmetro null
		setResizable(false); //bloqueia a alteração de dimensão da tela
		/*Primeira papreferredrte Concluída*/
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints(); //gerenciamento de posições de campos e botões na tela
		gridBagConstraints.gridx = 0; //posição inicial da primeira linha = 0
		gridBagConstraints.gridy = 0; //posição inicial da primeira coluna = o
		
		descricaoHora.setPreferredSize(new Dimension(200, 25));; //definindo tamanho da label descrição hora
		jPanel.add(descricaoHora, gridBagConstraints); //adicionado label descricaohora na variavel jPanel e indicado o gerenciador de posições 
		
		mostraTempo.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++; //andou uma posição da coluna Y para baixo para mostrar o segundo componente mostraTempo
		jPanel.add(mostraTempo, gridBagConstraints);
		
		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		jPanel.add(descricaoHora2, gridBagConstraints);
		
		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		jPanel.add(mostraTempo2, gridBagConstraints);
		
		
		add(jPanel,BorderLayout.WEST);
		
		//sempre será o último comando
		setVisible(true);//Torna a tela vísivel para o usuário
	}

}
