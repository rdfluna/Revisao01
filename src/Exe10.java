import java.util.Scanner;

public class Exe10 {
	public void ImprimirASCII() {
		String phase = "";

		Scanner sc = new Scanner (System.in);
		System.out.println("Digite um frase. ");
		phase = sc.nextLine();

		for(char c: phase.toCharArray()) {
			for (int i = 32; i <= 126; i++) {
				if(c == (char)i)
					System.out.print(i + " ");
        	}
		}
	}
}
