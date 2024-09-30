package modulo1.challenge.main.models;

public class MenuOpcoes {
    public static void exibirOpcoes() {

        System.out.println(
                """
                            
                            __________________________________
                            
                            Operações
                             1 - Consultar saldo
                             2 - Receber valor
                             3 - Transferir valor
                             4 - Sair
                            
                             Digite a opção desejada:
                            """
        );
    }
}
