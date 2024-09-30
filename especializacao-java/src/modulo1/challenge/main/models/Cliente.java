package modulo1.challenge.main.models;

public class Cliente {
    String nome = "Cliente Teste";
    TiposDeConta tipoConta = TiposDeConta.CORRENTE;
    double saldo = 2500;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return  "__________________________________" + "\n" +
                "Nome: " + nome + "\n" +
                "Tipo da conta: " + tipoConta + "\n" +
                "Saldo inicial: R$ " + String.format("%.2f", saldo);
    }
}
