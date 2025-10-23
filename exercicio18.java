import java.util.Scanner;
public class exercicio18 {


	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Digite a quantidade de alunos: ");
	        int alunos = sc.nextInt();

	        int aprovados = 0;

	        for (int i = 1; i <= alunos; i++) {
	            System.out.println("Aluno " + i + ":");
	            System.out.print("Digite a 1ª nota: ");
	            double n1 = sc.nextDouble();
	            System.out.print("Digite a 2ª nota: ");
	            double n2 = sc.nextDouble();

	            double media = (n1 + n2) / 2;
	            System.out.println("Média: " + media);

	            if (media >= 6) {
	                System.out.println("Aprovado!\n");
	                aprovados++;
	            } else {
	                System.out.println("Reprovado.\n");
	            }
	        }

	        System.out.println("Total de alunos aprovados: " + aprovados);
	        sc.close();
	    }
	}
