package org.example.Exercicio5;

public class Produto {
    String nome;
    double preco;
    int	quantidadeEmEstoque;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

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

            produto.setNome("Lapiseira");
            System.out.println(produto.getNome());
            produto.setPreco(10.50);
            System.out.println(produto.getPreco());

		/*
			Esses métodos servem para ter um controle melhor sobre os valores dos atributos,
			evitando possíveis alterações de tipo, alterações no nome da variável etc, é uma
			boa prática para manter concizo a alteração de valores das próprias váriaveis.
			Futuramente com o uso de modificador de visibilidade, o get e o set se tornam
			um meio de acesso aos atributos que possam estar privados para uma única classe.
		*/

        }
    }
}
