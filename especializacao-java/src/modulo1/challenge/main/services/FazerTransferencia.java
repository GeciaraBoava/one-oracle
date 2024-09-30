package modulo1.challenge.main.services;

import java.util.Scanner;

public class FazerTransferencia {
    public static double transferirValor(double saldo) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor a transferir: ");
        double valorATransferir = sc.nextDouble();

        if(valorATransferir > saldo) {
            System.out.println("Não é possível transferir, o valor solicitado é maior que o saldo atual.");
        } else {
            saldo -= valorATransferir;
            System.out.printf("Saldo atualizado: R$ %.2f", saldo);
        }

        return saldo;
    }
}
