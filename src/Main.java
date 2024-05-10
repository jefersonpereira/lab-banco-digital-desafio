public class Main {
    public static void main(String[] args){
        ContaPoupanca  c1 = new ContaPoupanca("CAIO", 102, 0.5);
        c1.depositar(100);
        c1.processar();
        System.out.println(c1.getSaldo());

        ContaCorrente c2 = new ContaCorrente("caio", 102, 5);
        c2.depositar(100);
        c2.processar();
        System.out.println(c2.getSaldo());
    }
}
