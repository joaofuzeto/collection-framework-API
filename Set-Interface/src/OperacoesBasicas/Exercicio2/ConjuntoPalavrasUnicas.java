package OperacoesBasicas.Exercicio2;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasSet.add(palavra);
    }

    public void removerPalavra(String palavra){
        String palavraParaRemover = null;
        if(!palavrasSet.isEmpty()){
            if(palavrasSet.contains(palavra)){
                palavrasSet.remove(palavra);
            }else {
                System.out.println("Palavra não encontrada no conjunto!");
            }
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public void verificarPalavra(String palavra){
        String palavraPresente = null;
        if(!palavrasSet.isEmpty()){
            if(palavrasSet.contains(palavra)){
                System.out.println("A palavra " + palavra +
                                    " está no set");
            }else{
                System.out.println("A palavra não está no set");
            }
        } else{
            throw new RuntimeException("O set está vazio");
        }
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavrasSet);
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ConjuntoPalavrasUnicas
        ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

        // Adicionando linguagens únicas ao conjunto
        conjuntoLinguagens.adicionarPalavra("Java");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("JavaScript");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("C++");
        conjuntoLinguagens.adicionarPalavra("Ruby");

        // Exibindo as linguagens únicas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Removendo uma linguagem do conjunto
        conjuntoLinguagens.removerPalavra("Python");
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Removendo uma linguagem inexistente
        conjuntoLinguagens.removerPalavra("Swift");

        // Verificando se uma linguagem está no conjunto
        conjuntoLinguagens.verificarPalavra("Java");
        conjuntoLinguagens.verificarPalavra("Python");

        // Exibindo as linguagens únicas atualizadas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();
    }

}
