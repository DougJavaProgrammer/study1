
public class Exercicio4 {
	/*
	 * 4. Imprima os fatoriais de 1 a 10. O fatorial de um n�mero n � n * (n-1) *
	 * (n-2) * ... * 1. Lembre-se de utilizar os par�nteses. O fatorial de 0 � 1 O
	 * fatorial de 1 � (0!) * 1 = 1 O fatorial de 2 � (1!) * 2 = 2 O fatorial de 3 �
	 * (2!) * 3 = 6 O fatorial de 4 � (3!) * 4 = 24 Fa�a um for que inicie uma
	 * vari�vel n (n�mero) como 1, fatorial (resultado) como 1 e varia n de 1 at�
	 * 10: int fatorial = 1; for (int n = 1; n <= 10; n++) { }
	 */

	public static void main(String[] args) {
		long fatorial = 1;
		for (long n = 1; n <= 40; n++) {
			fatorial = fatorial * n;
			System.out.println("Fatorial de " + n + "! � " + fatorial);
		}

	}
}
