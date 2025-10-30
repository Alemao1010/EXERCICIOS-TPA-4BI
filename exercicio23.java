import java.util.Scanner;
public class exercicio23 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Digite o valor de n: ");
	        int n = sc.nextInt();

	        for(int i = 1; i <= n; i++) {

	            // Espaços antes das estrelas
	            for(int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }

	            // Estrelas
	            for(int k = 1; k <= i; k++) {
	                System.out.print("* ");
	            }

	            System.out.println();
	        }

	        sc.close();
	    }
	}
