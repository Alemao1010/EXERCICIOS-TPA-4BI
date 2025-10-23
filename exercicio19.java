import java.util.Scanner;
public class exercicio19 {
	
	
 public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        String continuar = "S";

		        while (continuar.equalsIgnoreCase("S")) {
		            System.out.print("Digite o peso (kg): ");
		            double peso = sc.nextDouble();
		            System.out.print("Digite a altura (m): ");
		            double altura = sc.nextDouble();

		            if (peso <= 0 || altura <= 0) {
		                System.out.println("Valores inválidos. Encerrando...");
		                break;
		            }

		            double imc = peso / (altura * altura);
		            System.out.printf("Seu IMC é: %.2f%n", imc);

		            System.out.print("Deseja calcular novamente? (S/N): ");
		            continuar = sc.next();
		        }

		        System.out.println("Programa encerrado.");
		        sc.close();
		    }
		}
