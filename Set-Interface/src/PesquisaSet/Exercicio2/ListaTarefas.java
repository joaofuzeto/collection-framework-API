package PesquisaSet.Exercicio2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefasSet;

    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefasSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaParaSerRemovida = null;
        if(!tarefasSet.isEmpty()){
            for(Tarefa t : tarefasSet){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaParaSerRemovida = t;
                    tarefasSet.remove(tarefaParaSerRemovida);
                    break;
                }
            }
        } else{
            throw new RuntimeException("O set está vazio");
        }
    }

    public void exibirTarefas(){
        System.out.println(tarefasSet);
    }

    public void contarTarefas(){
        System.out.println("O número total de tarefas na lista de tarefas é de: " +
                            tarefasSet.size() + " tarefas.");
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if(!tarefasSet.isEmpty()){
            for(Tarefa t : tarefasSet){
                if(t.isConluida()){
                    tarefasConcluidas.add(t);
                }
            }
            return tarefasConcluidas;
        } else {
            throw new RuntimeException("O set está vazio!");
        }
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if(!tarefasSet.isEmpty()){
            for(Tarefa t : tarefasSet){
                if(!t.isConluida()){
                    tarefasPendentes.add(t);
                }
            }
            return tarefasPendentes;
        } else {
            throw new RuntimeException("O set está vazio!");
        }
    }

    public void marcarTarefaConcluida(String descricao){
        Tarefa tarefaConcluida = null;
        if(!tarefasSet.isEmpty()){
            for(Tarefa t : tarefasSet){
                if(t.getDescricao().equalsIgnoreCase(descricao) && !t.isConluida()){
                    tarefaConcluida = t;
                    tarefaConcluida.setConluida(true);
                    break;
                }
            }
        } else{
            System.out.println("O set está vazio");
        }
    }

    public void marcarTarefaPendente(String descricao){
        Tarefa tarefaPendente = null;
        if(!tarefasSet.isEmpty()){
            for(Tarefa t : tarefasSet){
                if(t.getDescricao().equalsIgnoreCase(descricao) && t.isConluida()){
                    tarefaPendente = t;
                    tarefaPendente.setConluida(false);
                    break;
                }
            }
        } else{
            System.out.println("O set está vazio");
        }
    }

    public void limparListaTarefas(){
        if(tarefasSet.isEmpty()){
            System.out.println("A lista já está vazia!");
        }else {
            tarefasSet.clear();
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefas
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");

        // Exibindo as tarefas na lista
        listaTarefas.exibirTarefas();

        // Removendo uma tarefa
        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();

        // Contando o número de tarefas na lista
        listaTarefas.contarTarefas();

        // Obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPendentes());

        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");

        // Obtendo tarefas concluídas
        System.out.println(listaTarefas.obterTarefasConcluidas());

        // Marcando tarefas como pendentes
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();

        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }

}
