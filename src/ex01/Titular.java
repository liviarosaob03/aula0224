package ex01;

import java.util.Random;
import java.util.Scanner;

public class Titular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        double valor;
        Conta conta = new Conta();

        System.out.printf("Nome do titular: ");
        conta.titular = sc.next();
        conta.numeroConta = rd.nextInt(1000, 9999);

        System.out.println("Saldo inicial: R$ " + conta.saldo);

        System.out.printf("Informe o valor para depósito: R$ ");
        valor = sc.nextDouble();
        conta.depositar(valor);

        System.out.printf("Informe o valor para saque: R$ ");
        valor = sc.nextDouble();
        conta.sacar(valor);

        System.out.println("Saldo atual: R$ " + conta.saldo);
    }
}