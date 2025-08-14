package oi;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        //Scanner é a entrada do usuário
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o seu nome");
        var nome = entrada.next();
        System.out.println("Digite seu sobrenome");
        var sobrenome = entrada.next();
        System.out.printf("Seu nome é: %s %s", nome, sobrenome );
        //Na função Scanner, voce deve fechar utilizando close
        entrada.close();
    }
}
