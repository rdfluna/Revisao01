import java.util.Scanner;

public class Exe01 {
	public void ElementoSimetrico() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos Numeros quer Registrar");
		int a = sc.nextInt();
		int cont = a-1;
		int v[] = new int [a];
		
		for(int i = 0; i < a; i++) {
			System.out.println("Digite um numero");
			v[i] = sc.nextInt();
		}

		System.out.println("Demostrando Elemento Simetrico");
		
		for(int j = 0; j < a; j++) {
			System.out.println(v[j] + "-" + v[cont]);
			cont--;
		} 
	} 
}
