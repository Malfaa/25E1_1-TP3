package org.example.Exercicio9;

public class Conta {
    String titular;
    int numero;
    String agencia;
    double saldo;
    String dataAbertura;

    public void saca(double valor) {
        saldo -= valor;
    }

    public void deposita(double valor) {
        saldo += valor;
    }

    public double calculaRendimento() {
        return saldo * 0.1;
    }


    public static class TestaConta {
        public static void main(String[] args) {
            Conta ct = new Conta();

            ct.titular = "Gustavo";
            ct.numero = 101010;
            ct.agencia = "-10";
            ct.saldo = 1000;
            ct.dataAbertura = "11/03/2025";
            System.out.printf("Saldo: R$%.02f\nRendimento: R$%.02f\n\n", ct.saldo, ct.calculaRendimento());

            ct.saca(200);
            System.out.printf("Saldo: R$%.02f\nRendimento: R$%.02f\n\n", ct.saldo, ct.calculaRendimento());

            ct.deposita(600);
            System.out.printf("Saldo: R$%.02f\nRendimento: R$%.02f\n\n", ct.saldo, ct.calculaRendimento());

        }
    }
}