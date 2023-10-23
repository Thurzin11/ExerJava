import java.util.Iterator;
import java.util.Scanner;

public class MediaPonderada {
	public static void main(String[] args) {
		int tamanhoDoArray = 3;
		double mediaFinal;
        double[] notas = new double[tamanhoDoArray];
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Informe a "+(i+1)+"° nota do aluno");
			notas[i]=s.nextDouble();
		}
			double soma = ((notas[0]*2)+(notas[1]*3)+(notas[2]*5));
			mediaFinal=(soma/10);
			System.out.println("A media final desse aluno é "+mediaFinal);
			
	}
}
