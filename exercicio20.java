import java.util.Scanner;
public class exercicio20 {

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        String respostaCorreta = "Buraco";
		        String resposta = "";

		        System.out.println("Jogo de adivinhação!");
		        System.out.println("Pergunta: 'O que é, o que é? Quanto mais se tira, mais a gente tem?'");

		        while (!resposta.equalsIgnoreCase(respostaCorreta)) {
		            System.out.print("Sua resposta: ");
		            resposta = sc.nextLine();

		            if (!resposta.equalsIgnoreCase(respostaCorreta)) {
		                System.out.println("Errado! Tente novamente.");
		            }
		        }

		        System.out.println("Parabéns! Você acertou!");
		        sc.close();
		    }
		}
