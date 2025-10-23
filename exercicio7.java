import java.util.Scanner;
public class exercicio7 {

	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);
		        System.out.print("Digite o nome: ");
		        String nome = sc.nextLine();
		        System.out.print("Digite o endereço: ");
		        String endereco = sc.nextLine();
		        System.out.print("Digite o telefone: ");
		        String telefone = sc.nextLine();

		        System.out.println("Nome: " + nome + " | Endereço: " + endereco + " | Telefone: " + telefone);
		        sc.close();
		    }
		}

