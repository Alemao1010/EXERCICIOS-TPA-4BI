import java.util.Scanner;
public class exercicio5 {

	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);
		        System.out.print("Digite o salário: ");
		        double salario = sc.nextDouble();
		        double novoSalario = salario * 1.07;
		        System.out.println("Salário reajustado: " + novoSalario);
		        sc.close();
		    }
		}
