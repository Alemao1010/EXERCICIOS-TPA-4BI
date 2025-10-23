import java.util.Scanner;
public class exercicio17 {


		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Digite a quantidade total de animais na loja: ");
		        int total = sc.nextInt();

		        int gatos = 0, cachorros = 0;

		        for (int i = 1; i <= total; i++) {
		            System.out.print("Informe o tipo do animal " + i + " (gato/cachorro): ");
		            String tipo = sc.next().toLowerCase();

		            if (tipo.equals("gato")) {
		                gatos++;
		            } else if (tipo.equals("cachorro")) {
		                cachorros++;
		            } else {
		                System.out.println("Tipo inválido, tente novamente!");
		                i--; // repete a contagem se o tipo for inválido
		            }
		        }

		        System.out.println("Quantidade de gatos: " + gatos);
		        System.out.println("Quantidade de cachorros: " + cachorros);
		        sc.close();
		    }
		}
