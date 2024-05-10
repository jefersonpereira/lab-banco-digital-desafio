

class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;


    public ContaBancaria(String titular, int numero) {
        this.numero = numero;
        this.titular = titular;
    }

    public void sacar(double valor){
        if(valor <= saldo) saldo-= valor;
        else System.out.println("Saldo insuficiente");
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public String getInformacoes(){
        return "Titular=" + titular + " NumeroConta=" + numero + " Saldo=" + saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

}

