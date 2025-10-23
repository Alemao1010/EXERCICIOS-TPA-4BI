import java.util.Scanner;
public class exercicio8 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Digite o primeiro valor: ");
	        int x = sc.nextInt();
	        System.out.print("Digite o segundo valor: ");
	        int y = sc.nextInt();

	        if (x == y) {
	            System.out.println("Os valores são iguais.");
	        } else {
	            System.out.println("Os valores são diferentes.");
	        }
	        sc.close();
	    }
	}
