/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



package org.yourcompany.yourproject;
import java.util.Scanner;
/**
 *
 * @author misterfran
 */ 
public class ContaTerminal {

    public static void main(String[] args) {
        try (Scanner Sc = new Scanner(System.in)) {
            System.out.println("Olá, bem vindo ao banco Flarinthias, digite os dados da sua conta abaixo:");
            System.out.println("Agência:");
            String agencia = Sc.next();
            System.out.println("Número da conta:");
            int numero = Sc.nextInt();
            System.out.println("Nome do cliente:");
            String nomeCliente = Sc.next();
            System.out.println("Saldo:");
            double saldo = Sc.nextDouble();
            
            String texto = "Olá " + nomeCliente + " suas informações são: \n";
            String info = " agência:" + agencia + "\n conta: " + numero + "\n saldo: " + saldo;
            String resul = texto.concat(info);
            System.out.println(resul);
        }
    }


}
