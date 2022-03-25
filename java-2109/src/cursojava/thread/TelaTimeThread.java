package cursojava.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog { // necess�rio extender a classe JDialog
	/* Componentes da tela */
	private JPanel jPanel = new JPanel(new GridBagLayout()); // painel de componentes

	private JLabel descricaoHora = new JLabel("Nome");
	private JTextField mostraTempo = new JTextField();

	private JLabel descricaoHora2 = new JLabel("E-mail");
	private JTextField mostraTempo2 = new JTextField();

	private JButton jButton = new JButton("Gerar");
	private JButton jButton2 = new JButton("Stop");

	private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();

	public TelaTimeThread() { // executa o que tiver dentro no momento de abertura ou execu��o
		setTitle("Minha tela de time com Thread"); // t�tulo da tela
		setSize(new Dimension(240, 240)); // tamanho da tela
		setLocationRelativeTo(null);// centraliza a tela com base em algum componente como nesse caso tem apenas
									// essa tela, usa-se par�metro null
		setResizable(false); // bloqueia a altera��o de dimens�o da tela
		/* Primeira papreferredrte Conclu�da */

		GridBagConstraints gridBagConstraints = new GridBagConstraints(); // gerenciamento de posi��es de campos e
																			// bot�es na tela
		gridBagConstraints.gridx = 0; // posi��o inicial da primeira linha = 0
		gridBagConstraints.gridy = 0; // posi��o inicial da primeira coluna = o
		gridBagConstraints.gridwidth = 2; // iniciando largura do grid com 2, siginifica que todos os componentes vao
											// ocupar no maximo dois espa�os
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);// distanciamento entre os componentes
		gridBagConstraints.anchor = GridBagConstraints.WEST; // componentes alinhados � esquerda

		descricaoHora.setPreferredSize(new Dimension(200, 25));
		; // definindo tamanho da label descri��o hora
		jPanel.add(descricaoHora, gridBagConstraints); // adicionado label descricaohora na variavel jPanel e indicando
														// o gerenciador de posi��es

		mostraTempo.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++; // andou uma posi��o da coluna Y para baixo para mostrar o segundo componente
									// mostraTempo
		jPanel.add(mostraTempo, gridBagConstraints);

		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(descricaoHora2, gridBagConstraints);

		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(mostraTempo2, gridBagConstraints);

		gridBagConstraints.gridwidth = 1; // os botoes vao ocupar tamanho 1, para alinhamento

		jButton.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy++;
		jPanel.add(jButton, gridBagConstraints);

		jButton2.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx++;
		jPanel.add(jButton2, gridBagConstraints);

		jButton.addActionListener(new ActionListener() { // cria a a��o para o bot�o

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(fila == null) {
					fila = new ImplementacaoFilaThread();
					fila.start();
				}
				
				for(int qtd = 0; qtd <100; qtd++) { //simulando 100 envios em massa
					
				ObjetoFilaThread filaThread = new ObjetoFilaThread();
				filaThread.setNome(mostraTempo.getText());
				filaThread.setEmail(mostraTempo2.getText()+ " - "+qtd);
				
				fila.add(filaThread);
				}
			
			}
		});

		jButton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				fila.stop();
				fila = null;
			}
		});
		
		fila.start();
		add(jPanel, BorderLayout.WEST);

		// sempre ser� o �ltimo comando
		setVisible(true);// Torna a tela v�sivel para o usu�rio
	}

}
