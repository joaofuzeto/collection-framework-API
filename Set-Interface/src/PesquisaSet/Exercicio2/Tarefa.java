package PesquisaSet.Exercicio2;

import java.util.Objects;

public class Tarefa {

    private String descricao;
    private boolean isConluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.isConluida = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setConluida(boolean conluida) {
        isConluida = conluida;
    }

    public boolean isConluida() {
        return isConluida;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", isConluida=" + isConluida +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return Objects.equals(getDescricao(), tarefa.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getDescricao());
    }
}
