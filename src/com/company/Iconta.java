package com.company;

public interface Iconta {

    void sacar (double valor);

    void depositar (double valor);

    void transferir (double valor, Conta contadestino);

     void imprimirExtrato();
}
