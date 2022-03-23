package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {
	public static void main(String[] args) throws InterruptedException {

		// Thread 1 processando em paralelo para envio de email
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();

		Thread threadNotaFiscal = new Thread(thread2);
		threadNotaFiscal.start();
		
		
		
		/* C�digo do sistema do usu�rio continua o fluxo de trabalho */
		System.out.println("Programa finalizado");

		/* Fluxo do sistema */
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usu�rio");
	}
	
	//thread 2 - envio de nota fiscal
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			// Thread 2 processando em paralelo para envio de notal fiscal
			

					/* c�digo da rotina que ser� executado em paralelo */
					for (int pos = 0; pos < 10; pos++) {
						try {
							Thread.sleep(1000);// cria um tempo para cada execu��o - no exemplo 1000 milisegundos, ou 1
												// segundo
						} catch (InterruptedException e) {
							e.printStackTrace();
						}

						System.out.println("Executando alguma rotina, por exemplo, envio de nota fiscal");
					}
					/* Fim do c�digo em paralelo */
			
		}
	};
	
	//thread1 - envio de email
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			// executa o que queremos que fique em paralelo
			// C�digo da rotina

			/* c�digo da rotina que ser� executado em paralelo */
			for (int pos = 0; pos < 10; pos++) {
				try {
					Thread.sleep(1000);// cria um tempo para cada execu��o - no exemplo 1000 milisegundos, ou 1
										// segundo
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println("Executando alguma rotina, por exemplo, envio de e-mail");
			}
			/* Fim do c�digo em paralelo */
		}
	};
	
}
