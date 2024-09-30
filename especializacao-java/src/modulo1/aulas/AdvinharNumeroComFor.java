package modulo1.aulas;

import java.util.Random;
import java.util.Scanner;

public class AdvinharNumeroComFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int chute = 0;

        for (int tentativas = 0; tentativas <= 5; tentativas++) {
            System.out.print("Digite seu chute: ");
            chute = sc.nextInt();
            if (chute == numeroAleatorio) {
                System.out.println("Parabéns, você acertou em " + tentativas + " tentativas.");
            } else if (chute < numeroAleatorio) {
                System.out.println("O número aleatório é maior que " + chute);
            } else {
                System.out.println("O número aleatório é menor que " + chute);
            }
        }
    }
}
