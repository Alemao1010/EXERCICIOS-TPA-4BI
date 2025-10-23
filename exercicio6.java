import java.util.Scanner;
public class exercicio6 {

	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);
		        System.out.print("Digite o valor de X: ");
		        int x = sc.nextInt();
		        System.out.print("Digite o valor de Y: ");
		        int y = sc.nextInt();

		        int temp = x;
		        x = y;
		        y = temp;

		        System.out.println("Depois da troca:");
		        System.out.println("X = " + x);
		        System.out.println("Y = " + y);
		        sc.close();
		    }
		}
