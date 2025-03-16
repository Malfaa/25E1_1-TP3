package org.example.Exercicio8;

public class Conta {
    String titular;
    int numero;
    String agencia;
    double saldo;
    String dataAbertura;

    public void saca(double valor){
        saldo -= valor;
    }

    public void deposita(double valor){
        saldo += valor;
    }

    public double calculaRendimento(){
        return saldo * 0.1;
    }
}
