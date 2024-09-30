package modulo1.challenge;

import modulo1.challenge.main.models.Cliente;
import modulo1.challenge.main.models.MenuOpcoes;
import modulo1.challenge.main.services.ConsultarSaldos;
import modulo1.challenge.main.services.FazerTransferencia;
import modulo1.challenge.main.services.ReceberTransferencia;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente();
        double saldo = cliente.getSaldo();

        System.out.println(cliente);


        int opcao = 0;

        while (opcao != 4) {

            MenuOpcoes.exibirOpcoes();
            if (sc.hasNextInt()) {
                opcao = sc.nextInt();
            } else {
                System.out.println("Opção inválida, tente novamente.");
                sc.next();

                continue;
            }

            switch (opcao) {
                case 1:
                    ConsultarSaldos.consultarSaldo(saldo);
                    break;
                case 2:
                    saldo = ReceberTransferencia.receberTransferencia(saldo);
                    break;
                case 3:
                    saldo = FazerTransferencia.transferirValor(saldo);
                    break;
                case 4:
                    System.out.println("Fim");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }
        System.out.println("Obrigado por utilizar nossos serviços.");
        sc.close();
    }
}
