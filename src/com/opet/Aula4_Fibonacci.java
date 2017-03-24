package com.opet;

public class Aula4_Fibonacci
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int numeroAnterior = 0;
        int numeroAtual = 1;
        int somaAtual = 0;
        while ((numeroAtual+numeroAnterior) < 10000) {
            somaAtual = numeroAtual+numeroAnterior;
            numeroAnterior = numeroAtual;
            numeroAtual = somaAtual;
            System.out.print(somaAtual+"-");
        }
    }

}
