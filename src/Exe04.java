import java.util.Scanner;

public class Exe04 {
	public void Importancia() {
		double valor = 780.000;
		double p,s,t,pont,sum,tot;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Pontua��o do primeiro Colocado");
		p = sc.nextDouble();
		System.out.println("Pontua��o do segundo Colocado");
		s = sc.nextDouble();
		System.out.println("Pontua��o do terceiro Colocado");
		t = sc.nextDouble();
		
		
		pont = p + s + t;
		sum = valor/pont;
		
		p =  sum*p;
		s = sum*s;
		t = sum*t;
		
		tot = p + s +t;
		
		System.out.println("p " + p);
		System.out.println("s " + s);
		System.out.println("tercerio " + t);
		System.out.println("tot " + tot);
	}
}
