import java.util.Scanner;
public class exercicio4 {

	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);
		        System.out.print("Digite o valor de X: ");
		        int x = sc.nextInt();
		        System.out.print("Digite o valor de Y: ");
		        int y = sc.nextInt();
		        System.out.println("Resto da divisão: " + (x % y));
		        sc.close();
		    }
		}
