package Classes;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nomeInstituicao;
    private List<Conta> contas;


    public Banco() {
        this.contas = new ArrayList<>();
        this.nomeInstituicao = "Center-Banck";
    }


    public void adicionarContas(Conta conta){
        contas.add(conta);
    }


    public List<Conta> listarContas(){
        return contas;
    }


    @Override
    public String toString() {
        return "Banco{" +
                "nomeInstituicao='" + nomeInstituicao + '\'' +
                ", contas=" + contas +
                '}';
    }
}

