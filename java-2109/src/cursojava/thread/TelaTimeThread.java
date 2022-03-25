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

public class TelaTimeThread extends JDialog { // necessário extender a classe JDialog
	/* Componentes da tela */
	private JPanel jPanel = new JPanel(new GridBagLayout()); // painel de componentes

	private JLabel descricaoHora = new JLabel("Nome");
	private JTextField mostraTempo = new JTextField();

	private JLabel descricaoHora2 = new JLabel("E-mail");
	private JTextField mostraTempo2 = new JTextField();

	private JButton jButton = new JButton("Gerar");
	private JButton jButton2 = new JButton("Stop");

	private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();

	public TelaTimeThread() { // executa o que tiver dentro no momento de abertura ou execução
		setTitle("Minha tela de time com Thread"); // título da tela
		setSize(new Dimension(240, 240)); // tamanho da tela
		setLocationRelativeTo(null);// centraliza a tela com base em algum componente como nesse caso tem apenas
									// essa tela, usa-se parâmetro null
		setResizable(false); // bloqueia a alteração de dimensão da tela
		/* Primeira papreferredrte Concluída */

		GridBagConstraints gridBagConstraints = new GridBagConstraints(); // gerenciamento de posições de campos e
																			// botões na tela
		gridBagConstraints.gridx = 0; // posição inicial da primeira linha = 0
		gridBagConstraints.gridy = 0; // posição inicial da primeira coluna = o
		gridBagConstraints.gridwidth = 2; // iniciando largura do grid com 2, siginifica que todos os componentes vao
											// ocupar no maximo dois espaços
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);// distanciamento entre os componentes
		gridBagConstraints.anchor = GridBagConstraints.WEST; // componentes alinhados à esquerda

		descricaoHora.setPreferredSize(new Dimension(200, 25));
		; // definindo tamanho da label descrição hora
		jPanel.add(descricaoHora, gridBagConstraints); // adicionado label descricaohora na variavel jPanel e indicando
														// o gerenciador de posições

		mostraTempo.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++; // andou uma posição da coluna Y para baixo para mostrar o segundo componente
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

		jButton.addActionListener(new ActionListener() { // cria a ação para o botão

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

		// sempre será o último comando
		setVisible(true);// Torna a tela vísivel para o usuário
	}

}
