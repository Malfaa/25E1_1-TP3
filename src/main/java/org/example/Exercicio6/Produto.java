package org.example.Exercicio6;

public class Produto {
    String nome;
    double preco;
    int	quantidadeEmEstoque;

    public Produto(String nomeP, double precoP, int quantidadeEmEstoqueP){
        nome = nomeP;
        preco = precoP;
        quantidadeEmEstoque = quantidadeEmEstoqueP;

		/*
			O construtor recebe os valores passados e são executados automaticamente pelo
			runtime, na instanciação da classe, funciona parecido como um método Setter,
			ele atribui os valores passados dos parâmetros aos abributos de classe.
		*/
    };
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
            Produto produto = new Produto("Lápis", 5.70, 15);

            produto.exibirInformacoes();

		/*
			O construtor orienta o programador a definir os atributos corretos, evita a necessidade de chamar vários
			métodos "set" separadamente, o que pode levar a erros, como esquecer de definir algum atributo ou
			inicializá-lo incorretamente. Além disso, o construtor garante que o objeto seja criado em um estado válido
			desde o início.
		*/
        }
    }
}
