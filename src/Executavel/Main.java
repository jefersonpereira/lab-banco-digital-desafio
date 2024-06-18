package Executavel;

import classes.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {



        LocalDate date = LocalDate.ofEpochDay(13 / 07 / 2003);
        LocalDate datee = LocalDate.ofEpochDay(13 / 97 / 2003);

        Cliente cliente = new Cliente("tata", date);
        Cliente client2 = new Cliente("jess", datee);

        Conta cc = new ContaCorrente(cliente);
        Conta cp = new ContaPoupanca(client2);

        cc.depositar(60);

        cc.sacar(60);
        cp.depositar(600);
        cp.transferir(300, cc);
        cc.imprimirExtrato();


        Banco guardarContaas = new Banco();
        guardarContaas.adicionarContas(cc);
        guardarContaas.adicionarContas(cp);

        System.out.println(guardarContaas.listarContas());

    }

}