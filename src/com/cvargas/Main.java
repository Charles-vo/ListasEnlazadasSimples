package com.cvargas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Escribe los elementos de tu lsita (entre cada elemento presiona enter)" +
                ", escribe fin al final y presiona enter:");
        Lista list = new Lista();
        String dato = "";
        Scanner sc= new Scanner(System.in);
        while (!dato.equalsIgnoreCase("fin")) {
            dato = sc.nextLine();
            if (!dato.equalsIgnoreCase("fin"))
                list.insertar(dato);
        }
        list.visualizar();

    }

}