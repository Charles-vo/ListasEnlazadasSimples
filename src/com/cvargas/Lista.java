package com.cvargas;

public class Lista {
    Nodo primero;

    public Lista (){
        primero = null;

    }
    public void insertar (String dato){
        Nodo temp = new Nodo (dato);
        temp.next=primero;
        primero=temp;
    }
    public void visualizar (){
        Nodo n;
        n= primero;
        while (n!=null){
            System.out.println(n.info);
            n= n.next;
        }

    }

}

