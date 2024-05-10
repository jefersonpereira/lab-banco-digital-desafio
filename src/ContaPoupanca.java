public class ContaPoupanca extends ContaBancaria {
    private double rendimento;

    public ContaPoupanca(String titular, int numero,double rendimento) {
        super(titular,numero);
        this.rendimento = rendimento;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double porcentagem) {
        if (porcentagem >= 0 &&  porcentagem <= 100) this.rendimento = porcentagem;
        else porcentagem = 0;
    }

    public void processar(){
        super.depositar(rendimento / 100 * super.getSaldo());
    }

}
