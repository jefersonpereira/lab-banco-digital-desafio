package Classes;

import java.time.LocalDate;

public class Cliente {

    private String nome;
    private LocalDate dateNascimento;


    public Cliente(String nome, LocalDate date) {
        this.nome = nome;
        this.dateNascimento = dateNascimento;
    }

    @Override
    public String toString() {
        return  this.nome  +
                ", Data de Nascimento=" + this.dateNascimento;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDateNascimento() {
        return dateNascimento;
    }
}
