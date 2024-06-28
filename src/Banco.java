import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas = new ArrayList<>();

    public void adicionarConta(Conta novaConta) {
        contas.add(novaConta);
    }

    public boolean removerConta(Conta conta) {
        return contas.remove(conta);
    }

    public Conta encontrarConta(int numeroConta) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numeroConta) {
                return conta;
            }
        }
        return null;
    }
}
