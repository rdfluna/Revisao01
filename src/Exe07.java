import java.util.Scanner;

public class Exe07 {
	public void NumerosPares() {
		Scanner input = new Scanner(System.in);
        int[] vet = new int[10];

        for (int i = 0; i < vet.length; i++)
        {
            System.out.print("Digite o " + (i + 1) + "o numero: ");
            vet[i] = input.nextInt();
        }

        System.out.println("Os numeros pares sao: ");
        for (int i = 0; i < vet.length; i++)
        {
            if (vet[i] % 2 == 0)
            {
           	    System.out.println(vet[i]);
            }
        }
	}

}
