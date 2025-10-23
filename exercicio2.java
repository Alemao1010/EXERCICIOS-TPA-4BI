import java.util.Scanner;
public class exercicio2 {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Digite um número inteiro: ");
		        int num = sc.nextInt();
		        System.out.println("O antecessor é: " + (num - 1));
		        sc.close();
		    }
		}
