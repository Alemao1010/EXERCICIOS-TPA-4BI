import java.util.Scanner;
public class exercicio15 {


	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Digite a quantidade de turmas: ");
	        int turmas = sc.nextInt();

	        for (int t = 1; t <= turmas; t++) {
	            System.out.print("Digite a quantidade de alunos da turma " + t + ": ");
	            int alunos = sc.nextInt();
	            double soma = 0;

	            for (int a = 1; a <= alunos; a++) {
	                System.out.print("Digite a média do aluno " + a + ": ");
	                soma += sc.nextDouble();
	            }

	            double mediaTurma = soma / alunos;
	            System.out.println("Média da turma " + t + ": " + mediaTurma);
	        }

	        sc.close();
	    }
	}

