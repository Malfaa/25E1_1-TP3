package org.example.Exercicio3;

public class Produto {
    String nome;
    double preco;
    int quantidadeEmEstoque;

    public void alterarPreco(double novoPreco) {
        preco = novoPreco;
    }

    public void alterarQuantidade(int novaQuantidade) {
        quantidadeEmEstoque = novaQuantidade;
    }

    public void exibirInformacoes() {
        System.out.printf("Produto: %s\nPreço: %f\nQuantidade: %d\n\n", nome, preco, quantidadeEmEstoque);
    }
}

