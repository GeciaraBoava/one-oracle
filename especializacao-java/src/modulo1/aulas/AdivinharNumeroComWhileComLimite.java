package modulo1.aulas;/* Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório
entre 0 e 100 e pedir para que o usuário tente adivinhar o número, em até 5 tentativas.
A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou
menor do que o número gerado.*/

import java.util.Random;
import java.util.Scanner;

public class AdivinharNumeroComWhileComLimite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(10);
        int chute = 0;
        int tentativas = 1;
        int limiteDeTentativas = 5;

         while (tentativas <= limiteDeTentativas && chute != numeroAleatorio) {
             System.out.print("Digite seu chute: ");
             chute = sc.nextInt();
             if (chute == numeroAleatorio) {
                 System.out.println("Parabéns, você acertou em " + tentativas + " tentativas.");
             } else if (chute < numeroAleatorio && tentativas < limiteDeTentativas) {
                 System.out.println("O número aleatório é maior que " + chute);
             } else if (chute > numeroAleatorio && tentativas < limiteDeTentativas) {
                 System.out.println("O número aleatório é menor que " + chute);
             } else {
                 System.out.println("Que pena, você não tem mais tentativas. O número era " + numeroAleatorio);
             }
             tentativas++;
         }
    }
}
