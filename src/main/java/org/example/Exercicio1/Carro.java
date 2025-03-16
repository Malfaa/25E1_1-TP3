package org.example.Exercicio1;

// Declaração da classe Carro
public class Carro{

    // Campos (atributos)
    String marca = "Hyundai";
    String modelo = "HB20";
    int anoFabricacao = 2020;
    String cor = "azul";

    // Método para mudar a cor do carro
    public void mudarCorCarro(String novaCor){
        if(novaCor != cor){
            cor = novaCor;
            System.out.printf("Cor trocada! Nova Cor: %s\n", cor);
        }else{
            System.out.println("Não é possível trocar pela mesma cor!");
        }
    }

    public static class AppProduto {
        // Método principal para testar a classe
        public static void main(String [] args){
            // Criação de um objeto da classe Carro
            Carro objCarro = new Carro();

            // Usando o método para mudar a cor do carro
            objCarro.mudarCorCarro("prata");
            objCarro.mudarCorCarro("vermelho");
        }
    }
}