package org.example.Exercicio4;

public class Produto {
    String nome;
    double preco;
    int	quantidadeEmEstoque;

    public void alterarPreco(double novoPreco){
        preco = novoPreco;
    }

    public void alterarQuantidade(int novaQuantidade){
        quantidadeEmEstoque = novaQuantidade;
    }

    public void exibirInformacoes(){
        System.out.printf("Produto: %s\nPreço: %f\nQuantidade: %d\n\n", nome, preco, quantidadeEmEstoque);
    }

    public static class AppProduto{
        public static void main(String [] args){
            Produto produto = new Produto();
            produto.nome = "Lápis";
            produto.preco = 5.30;
            produto.quantidadeEmEstoque = 15;
            produto.exibirInformacoes();

            produto.alterarPreco(5.0);
            produto.alterarQuantidade(12);
            produto.exibirInformacoes();
        }
    }
}
