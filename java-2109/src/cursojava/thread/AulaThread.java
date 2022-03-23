package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {
	public static void main(String[] args) throws InterruptedException {

		// Thread processando em paralelo para envio de email
		new Thread() {
			public void run() {// executa o que queremos que fique em paralelo
				// Código da rotina

				/* código da rotina que será executado em paralelo */
				for (int pos = 0; pos < 10; pos++) {
					try {
						Thread.sleep(1000);// cria um tempo para cada execução - no exemplo 1000 milisegundos, ou 1
											// segundo
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					System.out.println("Executando alguma rotina, por exemplo, envio de e-mail");
				}
				/* Fim do código em paralelo */
			};

		}.start();// inicia a thread de processamento paralelo

		
		
		// Thread 2 processando em paralelo para envio de notal fiscal
				new Thread() {
					public void run() {// executa o que queremos que fique em paralelo
						// Código da rotina

						/* código da rotina que será executado em paralelo */
						for (int pos = 0; pos < 10; pos++) {
							try {
								Thread.sleep(1000);// cria um tempo para cada execução - no exemplo 1000 milisegundos, ou 1
													// segundo
							} catch (InterruptedException e) {
								e.printStackTrace();
							}

							System.out.println("Executando alguma rotina, por exemplo, envio de nota fiscal");
						}
						/* Fim do código em paralelo */
					};

				}.start();// inicia a thread de processamento paralelo
		
		/* Código do sistema do usuário continua o fluxo de trabalho */
		System.out.println("Programa finalizado");

		/* Fluxo do sistema */
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");
	}

}
