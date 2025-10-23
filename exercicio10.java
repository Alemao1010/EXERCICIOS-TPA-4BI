import java.util.Scanner;
public class exercicio10 {

	public static void main(String[] args) {


		        Scanner sc = new Scanner(System.in);
		        System.out.print("Digite o sexo (M/F): ");
		        char sexo = sc.next().charAt(0);

		        if (sexo == 'M' || sexo == 'm') {
		            System.out.println("Seja bem-vindo, Senhor!");
		        } else if (sexo == 'F' || sexo == 'f') {
		            System.out.println("Seja bem-vinda, Senhora!");
		        } else {
		            System.out.println("Opção inválida!");
		        }
		        sc.close();
		    }
		}
