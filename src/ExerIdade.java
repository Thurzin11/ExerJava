import java.util.Scanner;

public class ExerIdade {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 int anoIdade, mesIdade, diaIdade;
		 System.out.println("Informe a sua idade em anos");
		 anoIdade = s.nextInt();
		 System.out.println("Informe a sua idade em meses");
		 mesIdade = s.nextInt();
		 System.out.println("Informe a sua idade em dias");
		 diaIdade = s.nextInt();
		 
		 anoIdade = anoIdade*365;
		 mesIdade = mesIdade*30;
		 diaIdade = diaIdade+anoIdade+mesIdade;
		 System.out.println("Sua idade em dias é de: "+diaIdade);
		
	}

	
	
}
