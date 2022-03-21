package cursojava.thread;

public class AulaThread {
	public static void main(String[] args) throws InterruptedException {
				
		for(int pos = 0; pos < 10; pos++) {
			Thread.sleep(1000); //cria um tempo para cada execução - no exemplo 1000 milisegundos, ou 1 segundo
			/*Quero executar esse envio com um tempo de parada ou um tempo determinado*/
			System.out.println("Executando alguma rotina, por exemplo, envio de e-mail");
		}
		System.out.println("Programa finalizado");
	}

}
