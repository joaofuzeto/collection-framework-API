package OperacoesBasicas.Exercicio1;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        if(!convidadosSet.isEmpty()){
            for(Convidado c : convidadosSet){
                if(c.getCodigoConvite() == codigoConvite){
                    convidadoParaRemover = c;
                    break;
                }
            }
            convidadosSet.remove(convidadoParaRemover);
        } else{
            throw new RuntimeException("Conjunto está vazio!");
        }
    }

    public void contarConvidados(){
        System.out.println("O número total de convidados é de: " + convidadosSet.size() +
                                " pessoas.");
    }

    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.contarConvidados();

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1236);

        conjuntoConvidados.contarConvidados();

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
        conjuntoConvidados.exibirConvidados();
    }
}
