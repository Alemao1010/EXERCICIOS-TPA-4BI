import java.util.Scanner;
public class exercicio16 {

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String continuar = "S";

	        while (continuar.equalsIgnoreCase("S")) {
	            System.out.println("Novo cliente no caixa.");
	            double total = 0;
	            String maisItens = "S";

	            while (maisItens.equalsIgnoreCase("S")) {
	                System.out.print("Digite o valor do item: ");
	                total += sc.nextDouble();
	                System.out.print("Deseja adicionar outro item? (S/N): ");
	                maisItens = sc.next();
	            }

	            System.out.println("Total da compra: R$ " + total);
	            System.out.print("Deseja atender outro cliente? (S/N): ");
	            continuar = sc.next();
	        }

	        System.out.println("Caixa encerrado.");
	        sc.close();
	    }
	}
