import java.util.Scanner;

public class HorasExtras {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double numeroHoras,valorHora,salario,horasExtra,valorExtra,valorHoraExtra;
		System.out.println("Informe a quantidade de horas trabalhadas do funcionario no mes ");
		numeroHoras = s.nextDouble();
		System.out.println("Informe o valor pago por hora ");
		valorHora = s.nextDouble();
		if(numeroHoras>160) {
			horasExtra = numeroHoras - 160;
			valorHoraExtra=valorHora*1.5;
			valorExtra = (horasExtra*valorHoraExtra);
			salario = ((160*valorHora)+valorExtra);
			System.out.println("Seu salario com hora extra sera: " +salario);
		}else {
			salario = numeroHoras*valorHora;
			System.out.println("Seu salario é de: "+salario);
		}
	}
}
