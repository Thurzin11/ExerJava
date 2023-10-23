import java.util.Scanner;

public class ExerMacas {

	public static void main(String[] args) {
		int qtdMacas;
		double precoMaca;
		Scanner s = new Scanner(System.in);
		System.out.println("Informe a quantidade de macas que voce deseja comprar ");
		qtdMacas = s.nextInt();
		if(qtdMacas<12 && qtdMacas>0) {
			precoMaca = qtdMacas*1.50;
			System.out.println("O valor da sua compra é "+precoMaca);
		}else {
			precoMaca = qtdMacas*1; 
			System.out.println("O valor da sua compra é "+precoMaca);
		}
	}

}
