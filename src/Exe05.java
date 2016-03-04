import java.util.Arrays;
import java.util.Scanner;
	
public class Exe05 {
	public void OrdenaVetor(){
		Scanner sc = new Scanner (System.in);
		int a = 0, b = 0;
		
		System.out.println("Digite o tamanho do primeiro vetor");
		a = sc.nextInt();
		int vetor[] = new int [a];
		
		System.out.println("Digite os numeros do vetor de forma crescente");
		for(int i = 0; i < a; i++){
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("Digite o tamanho do segundo vetor");
		b = sc.nextInt();
		int vetor2[] = new int [b];
		
		System.out.println("Digite os numeros do vetor de forma crescente");
		for(int i = 0; i < b; i++){
			vetor2[i] = sc.nextInt();
		}
		
		Arrays.sort(vetor);
		Arrays.sort(vetor2);
		
		System.out.print("\nPrimeiro vetor: ");
		for(int i = 0; i < a; i++){
			System.out.print(vetor[i] + " ");
		}
		
		System.out.print("\nSegundo vetor: ");
		for(int i = 0; i < b; i++){
			System.out.print(vetor2[i] + " ");
		}
		
		int vetor3 = vetor.length + vetor2.length;
		int resultado[] = new int[vetor3];
		
		System.arraycopy(vetor, 0, resultado, 0, vetor.length);
        System.arraycopy(vetor2, 0, resultado, vetor.length, vetor2.length);
		
		System.out.print("\nTerceiro vetor ordenado: ");
		Arrays.sort(resultado);
		
		for (int i = 0; i < vetor3; i++) {
            System.out.print(resultado[i] + " ");
        }
	}
}
