import java.util.Scanner;

public class ExerEleitores {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int nTotal,votosBranco,votosNulos,votosValido;
		System.out.println("Informe o numero total de eleitores: ");
		nTotal = s.nextInt();
		System.out.println("Informe o numero total de votos branco: ");
		votosBranco= s.nextInt();
		System.out.println("Informe o numero total de nulos: ");
		votosNulos = s.nextInt();
		votosValido= nTotal-votosBranco-votosNulos;
		System.out.println("Porcentagem de validos: "+ ((votosValido*100)/nTotal)+"%");
		System.out.println("Porcentagem de brancos: "+ ((votosBranco*100)/nTotal)+"%");
		System.out.println("Porcentagem de nulos: "+ ((votosNulos*100)/nTotal)+"%");
	}
}
