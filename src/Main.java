public class Main {

    public static void main(String[] args) {
        // Criando cliente do banco
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Venilton");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Maria");

        Cliente cliente3 = new Cliente();
        cliente3.setNome("José");

        // Criando contas para Venilton
        Conta ccVenilton = new ContaCorrente(cliente1);
        Conta poupancaVenilton = new ContaPoupanca(cliente1);

        // Criando contas para Maria
        Conta ccMaria = new ContaCorrente(cliente2);
        Conta poupancaMaria = new ContaPoupanca(cliente2);

        // Criando contas para José
        Conta ccJose = new ContaCorrente(cliente3);
        Conta poupancaJose = new ContaPoupanca(cliente3);

        // Operações na conta de Venilton
        System.out.println("Realizando operações na Conta Corrente de " + cliente1.getNome() + "...");
        ccVenilton.depositar(100);
        System.out.println("Depositado: R$100,00 na Conta Corrente de Venilton.");
        
        System.out.println("Tentando transferir R$50,00 para a Conta Poupança de Venilton...");
        ccVenilton.transferir(50, poupancaVenilton);
        
        System.out.println("Extrato da Conta Corrente de Venilton:");
        ccVenilton.imprimirExtrato();
        
        System.out.println("Extrato da Conta Poupança de Venilton:");
        poupancaVenilton.imprimirExtrato();
        
        // Operações na conta de Maria
        System.out.println("Maria depositando R$200 na Conta Corrente...");
        ccMaria.depositar(200);
        System.out.println("Maria transferindo R$100 para José...");
        ccMaria.transferir(100, ccJose);
        
        System.out.println("Extrato da Conta Corrente de Maria:");
        ccMaria.imprimirExtrato();
        
        System.out.println("Extrato da Conta Corrente de José após receber transferência:");
        ccJose.imprimirExtrato();

        // Saques de José
        System.out.println("José sacando R$50,00 da Conta Poupança...");
        poupancaJose.sacar(50);
        System.out.println("Extrato da Conta Poupança de José após saque:");
        poupancaJose.imprimirExtrato();
    }
}


