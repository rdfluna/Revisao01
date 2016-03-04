import java.util.Scanner;

public class Exe08 {
	public void CaixaLoja() {
		Scanner input = new Scanner(System.in);
		int quant;
        String prod;
        Double tot,
        pr1 = 5.32,
        pr2 = 6.45,
        pr3 = 2.37,
        pr4 = 5.32,
        pr5 = 6.45;

        System.out.println("---------Opcao de codigo de produto----------");
        System.out.println(" Opcao 1 - 1001. ");
        System.out.println(" Opcao 2 - 1324. ");
        System.out.println(" Opcao 3 - 6548. ");
        System.out.println(" Opcao 4 - 0987. ");
        System.out.println(" Opcao 5 - 7623. ");
        
        System.out.print("Digite a opcao: ");
        prod = input.next();

        switch (prod)
        {
            case ("1"):
                System.out.println("Valor desse produto: R$ 5.32 ");
                System.out.print("Digite Quantidade de produto: ");
                quant = input.nextInt();
                tot = pr1 * quant;
                System.out.println(quant+" X 5.32 ");
                System.out.println("O total da compra eh : " + tot + " Reai(S)");
            break;
            case ("2"):
                System.out.println("Valor desse produto: R$ 6.45 ");
                System.out.println("Digite Quantidade de produto: ");
                quant = input.nextInt();
                tot = pr2 * quant;
                System.out.println(quant+" X 6.45 ");
                System.out.println("O total da compra eh : " + tot + " Reai(S)");
            break;
            case ("3"):
                System.out.println("Valor desse produto: R$2.37 ");
                System.out.println("Digite Quantidade de produto: ");
                quant = input.nextInt();
                tot = pr3 * quant;
                System.out.println(quant+" X 2.37 ");
                System.out.println("O total da compra eh : " + tot + " Reai(S)");
            break;
            case ("4"):
                System.out.println("Valor desse produto: R$ 5.32 ");
                System.out.print("Digite Quantidade de produto: ");
                quant = input.nextInt();
                tot = pr4 * quant;
                System.out.println(quant+" X 5.32 ");
                
                System.out.println("O total da compra eh : " + tot + " Reai(S)");
            break;
            case ("5"):
                System.out.println("Valor desse produto: R$6.45 ");
                System.out.println("Digite Quantidade de produto: ");
                quant = input.nextInt();
                tot = pr5 * quant;
                System.out.println(quant+" X 6.45 ");
                System.out.println("O total da compra eh : " + tot + " Reai(S)");
            break;
            default:
                System.out.println("-----------Esta opcao de produto nao existe ! -----------");
            break;
        }

	 }
}
