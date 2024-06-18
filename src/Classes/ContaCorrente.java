package Classes;

public class ContaCorrente extends Conta {

    public int contador;
    private double chequeEspecial = 500;
    private double taxa = 0.1;

    public ContaCorrente(Cliente cliente) {
        super(cliente);

    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
        System.out.println("Cheque Especial Disponível: " + chequeEspecial);
        System.out.println("Saldo com Cheque Especial: " + (getSaldo() + chequeEspecial));
    }

    public boolean isUsandoChequeEspecial() {
        return getSaldo() <= 0;
    }


    public void aplicarJurosChequeEspecial() {
        if (isUsandoChequeEspecial()) {
            double saldoDevedor = -getSaldo(); // Saldo negativo
            double juros = saldoDevedor * taxa;
            setSaldo(getSaldo() - juros);
            System.out.println("Juros do cheque especial aplicados: " + juros);
        }
    }


    @Override
    public void sacar(double valor) {
        if (getSaldo() + chequeEspecial >= valor) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque de " + valor + " realizado com sucesso.");

        } else {
            System.out.println("Saldo insuficiente, incluindo o cheque especial.");

        }
    }



}
