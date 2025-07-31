package OperacoesBasicas.Exercicio2;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> listItens;

    public CarrinhoDeCompras() {
        this.listItens = new ArrayList<>();
    }

    public void adicionarItem(String name, double price, int quantity){
        listItens.add(new Item(name, price, quantity));
    }

    public void removerItem(String name){
        List<Item> itensParaRemover= new ArrayList<>();
        for(Item i : listItens){
            if (i.getName().equalsIgnoreCase(name)){
                itensParaRemover.add(i);
            }
        }
        listItens.removeAll(itensParaRemover);
    }

    public double calcularValorTotal(){
        double valorTotal = 0d;
        if(!listItens.isEmpty()){
            for (Item i : listItens){
                double valorItemPelaQuantidade = i.getPrice() * i.getQuantity();
                valorTotal += valorItemPelaQuantidade;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens(){
        System.out.println(listItens);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();


        carrinhoDeCompras.adicionarItem("Tomate", 2.50, 4);
        carrinhoDeCompras.adicionarItem("Azeite", 17.00, 2);
        carrinhoDeCompras.adicionarItem("Macarrão", 4.50, 1);

        System.out.println("O valor total do carrinho é de R$" + carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("Macarrão");

        System.out.println("O valor total do carrinho é de R$" + carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.exibirItens();
    }
}
