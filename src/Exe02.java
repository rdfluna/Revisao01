import java.util.Scanner;

public class Exe02 {
	public void NumeroPerfeito() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um Numero.");
		int a = sc.nextInt();
		int b = 0;

		for(int i = a-1; i > 0; i--) {
			if(a % i == 0)
				b = b + i;
		}

		if(a == b)
			System.out.println("O numero é Perfeito");
		else
			System.out.println("Seu numero não perfeito!!!");
	}
}

