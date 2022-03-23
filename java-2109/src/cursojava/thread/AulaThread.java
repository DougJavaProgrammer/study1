package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {
	public static void main(String[] args) throws InterruptedException {

		// Thread 1 processando em paralelo para envio de email
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();

		Thread threadNotaFiscal = new Thread(thread2);
		threadNotaFiscal.start();
		
		
		
		/* Código do sistema do usuário continua o fluxo de trabalho */
		System.out.println("Programa finalizado");

		/* Fluxo do sistema */
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");
	}
	
	//thread 2 - envio de nota fiscal
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			// Thread 2 processando em paralelo para envio de notal fiscal
			

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
			
		}
	};
	
	//thread1 - envio de email
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			// executa o que queremos que fique em paralelo
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
		}
	};
	
}
