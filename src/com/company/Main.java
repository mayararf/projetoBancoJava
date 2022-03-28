package com.company;

public class Main {

    public static void main(String[] args) {
    Conta cc = new ContaCorrente();
    cc.depositar(100);

    Conta poupanca = new ContaPoupanca();
    cc.transferir(100, poupanca);

    cc.imprimirExtrato();
    poupanca.imprimirExtrato();


        Cliente cliente = new Cliente("Juliano", "1236","10","M");

        System.out.println(cliente.toString());





    }
}
