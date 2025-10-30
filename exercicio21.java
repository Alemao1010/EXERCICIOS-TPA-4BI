import java.util.Scanner;
public class exercicio21 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        double total = 0;
	        double preco;
	        int qtd;

	        System.out.print("Quantos produtos o cliente comprou? ");
	        qtd = sc.nextInt();

	        for (int i = 1; i <= qtd; i++) {
	            System.out.print("Preço do produto " + i + ": ");
	            preco = sc.nextDouble();
	            total += preco;
	        }

	        System.out.println("Total a pagar: R$ " + total);

	        sc.close();
	    }
	}
