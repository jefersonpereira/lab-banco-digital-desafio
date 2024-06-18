package Classes;

public abstract class Conta {

    private int numero;
    private int agencia;
    private double saldo = 0.0 ;
    private Cliente cliente;
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;


    public Conta(Cliente cliente) {
        this.numero = SEQUENCIAL++;
        this.agencia = AGENCIA_PADRAO;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void sacar(double saque){

          saldo -= saque;

    }


    public void depositar(double valorDeposito){

              saldo  += valorDeposito;

    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta:" +
                "numero=" + numero +
                ", agencia=" + agencia +
                ", saldo=" + saldo +
                ", cliente=" + cliente;
    }

    public void transferir(double valor, Conta destino){

        if (valor > 0 && this.getSaldo() >= valor) {
            this.setSaldo(this.getSaldo() - valor);
            destino.setSaldo(destino.getSaldo() + valor);
        }

    }


    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }


    public abstract void imprimirExtrato();

}
