package PesquisaEmList.Exercicio2;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    List<Integer> numerosInteirosList;

    public SomaNumeros() {
        this.numerosInteirosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numerosInteirosList.add(numero);
    }

    public int calcularSoma(){
        int somaDosNumeros = 0;
        if(!numerosInteirosList.isEmpty()){
            for(Integer i : numerosInteirosList){
                somaDosNumeros += i;
            }
        }
        return somaDosNumeros;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if(!numerosInteirosList.isEmpty()){
            for(Integer i : numerosInteirosList){
                if(i >= maiorNumero){
                    maiorNumero = i;
                }
            }
            return maiorNumero;
        } else{
            throw new RuntimeException("A lista está vazia");
        }
    }

    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if(!numerosInteirosList.isEmpty()){
            for(Integer i : numerosInteirosList){
                if(i <= menorNumero){
                    menorNumero = i;
                }
            }
            return menorNumero;
        } else{
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirNumeros(){
        if(!numerosInteirosList.isEmpty()){
            System.out.println(this.numerosInteirosList);
        } else{
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe SomaNumeros
        SomaNumeros somaNumeros = new SomaNumeros();

        // Adicionando números à lista
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);

        // Exibindo a lista de números adicionados
        System.out.println("Números adicionados:");
        somaNumeros.exibirNumeros();

        // Calculando e exibindo a soma dos números na lista
        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

        // Encontrando e exibindo o maior número na lista
        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

        // Encontrando e exibindo o menor número na lista
        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
    }
}
