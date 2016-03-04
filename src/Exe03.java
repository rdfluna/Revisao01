import java.util.Scanner;

public class Exe03 {
	public void AnoBissexto() {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o Ano");
		int ano = sc.nextInt();
		
		if(ano % 4 == 0)
			System.out.println("Ano eh Bissexto " );
		else
			System.out.println("Ano não é Bissexto ");
	}
	
}
