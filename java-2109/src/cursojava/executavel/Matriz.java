package cursojava.executavel;

public class Matriz {

	/* Executar o código JAVA */
	public static void main(String[] args) {
		int notas[][] = new int[2][3]; // para tornar um array em matriz, basta colocar outro par de colchetes
		notas[0][0] = 80; // na primeira linha e na primeira coluna tem o valor 80
		notas[0][1] = 90; // na primeira linha e na segunda coluna tem o valor 90
		notas[0][2] = 70; // na primeira linha e na terceira coluna tem o valor 70

		notas[1][0] = 40;
		notas[1][1] = 60;
		notas[1][2] = 30;

		// for para percorrer as linhas
		for (int posLinha = 0; posLinha < notas.length; posLinha++) {
			System.out.println("------------------------------------");
			
			
			// for para percorrer as colunas
			for (int posColuna = 0; posColuna < notas[posLinha].length; posColuna++) {

				System.out.println("Valor da Matriz: " + notas[posLinha][posColuna]);
			}
		}

	}

}
