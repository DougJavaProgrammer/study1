package cursojava.executavel;

public class Matriz {

	/* Executar o código JAVA */
	public static void main(String[] args) {
		int notas[][] = new int[2][3]; // para tornar um array em matriz, basta colocar outro par de colchetes
		notas[0][0] = 80; // na primeira linha e na primeira coluna tem o valor 80
		notas[0][1] = 90; // na primeira linha e na segunda coluna tem o valor 90
		notas[0][2] = 70; // na primeira linha e na segunda coluna tem o valor 70

		notas[1][0] = 40;
		notas[1][1] = 60;
		notas[1][2] = 30;

		System.out.println(notas);

	}

}
