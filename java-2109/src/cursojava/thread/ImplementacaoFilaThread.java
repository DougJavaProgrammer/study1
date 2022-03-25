package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {
		private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedQueue<ObjetoFilaThread>();
		
		public static void add (ObjetoFilaThread objetoFilaThread) {
			pilha_fila.add(objetoFilaThread);
						
		}
		@Override
		public void run() {
			Iterator iteracao = pilha_fila.iterator();
			
			synchronized (iteracao) { //bloquear o acesso a esta lista por outros processos
							
			while(iteracao.hasNext()) { //enquanto tiver dados na lista, irá processar
				ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();
				
				/*Proessar 10 mil notas fiscais*/
				/*Gerar uma lista enorme de PDF*/
				/*Gerar um envio em massa de email*/
				System.out.println("------------------------------------");
				System.out.println(processar.getEmail());
				System.out.println(processar.getNome());
				
				iteracao.remove(); //ao terminiar, remover
				
				try {
					Thread.sleep(50); // dar um tempo para descarga de memória
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}
			}
			try {
				Thread.sleep(1000); // processou toda a lista, um tempo de 1 segundo para descarga de memória
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
