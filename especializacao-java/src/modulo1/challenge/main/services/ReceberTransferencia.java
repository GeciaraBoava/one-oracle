package modulo1.challenge.main.services;

import java.util.Scanner;

public class ReceberTransferencia {
    public static double receberTransferencia(double saldo) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor a receber: ");
        double valorAReceber = sc.nextDouble();

        saldo += valorAReceber;
        System.out.printf("Saldo atualizado: R$ %.2f", saldo);
        return saldo;
    }
}
