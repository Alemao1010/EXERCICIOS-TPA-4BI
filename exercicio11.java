import java.util.Scanner;
public class exercicio11 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Digite o primeiro número: ");
	        double a = sc.nextDouble();
	        System.out.print("Digite o segundo número: ");
	        double b = sc.nextDouble();

	        System.out.println("Escolha uma opção:");
	        System.out.println("1 - Somar");
	        System.out.println("2 - Subtrair");
	        System.out.println("3 - Multiplicar");
	        System.out.println("4 - Dividir");
	        int opcao = sc.nextInt();

	        switch (opcao) {
	            case 1 -> System.out.println("Resultado: " + (a + b));
	            case 2 -> System.out.println("Resultado: " + (a - b));
	            case 3 -> System.out.println("Resultado: " + (a * b));
	            case 4 -> System.out.println("Resultado: " + (a / b));
	            default -> System.out.println("Opção inválida!");
	        }

	        sc.close();
	    }
	}