import java.util.Scanner;
public class exercicio22 {

 
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int qtdFunc;
	        int meses;
	        int direito = 0;
	        int semDireito = 0;
	        String nome;

	        System.out.print("Informe a quantidade de funcionários: ");
	        qtdFunc = sc.nextInt();
	        sc.nextLine(); // limpar enter

	        for (int i = 1; i <= qtdFunc; i++) {
	            System.out.print("\nNome do funcionário " + i + ": ");
	            nome = sc.nextLine();

	            System.out.print("Tempo de serviço em meses: ");
	            meses = sc.nextInt();
	            sc.nextLine();

	            if (meses > 12) {
	                System.out.println(nome + " tem direito a férias.");
	                direito++;
	            } else {
	                System.out.println(nome + " não tem direito a férias.");
	                semDireito++;
	            }
	        }

	        System.out.println("\nFuncionários com direito a férias: " + direito);
	        System.out.println("Funcionários sem direito a férias: " + semDireito);

	        sc.close();
	    }
	}
