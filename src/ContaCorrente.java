public class ContaCorrente extends ContaBancaria {
    private double tarifa;


    public ContaCorrente(String titular, int numero, double tarifa) {
        super(titular, numero);
        this.tarifa = tarifa;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
    public void processar(){
        if(tarifa > 0){
            sacar(tarifa);
        }
    }
}