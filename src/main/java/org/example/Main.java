package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Matriz t = new Matriz();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("De que tamaño desea el triangulo?");
        n=sc.nextInt();
        t.generarTriangulo(n);
        System.out.println("De que tamaño desea el triangulo invertido?");
        n=sc.nextInt();
        t.generarTrianguloInvertido(n);
    }
}