import java.util.Scanner;

public class Exe09 {
	public void ImprimirVogais() {
		String vowels = "aeiouAEIOU";
		String phase = "";

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um frase. ");
		phase = sc.nextLine();

		for(char c: phase.toCharArray()) {
			for(char v: vowels.toCharArray()) {
				if(c == v)
					System.out.print(c + " ");
			}
		}
	}
}
