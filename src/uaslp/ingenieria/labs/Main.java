package uaslp.ingenieria.labs;

import uaslp.ingenieria.labs.list.ArrayList;
import uaslp.ingenieria.labs.list.Iterator;
import uaslp.ingenieria.labs.list.List;

public class Main {

    // Inner classes
    // Outer classes

    public static void main(String[] args) {
        // Wrapper classes -> Integer, Float, Character, Boolean
        //Las wrapper classes son "Inmutables"

        List<Integer> lista1 = new ArrayList<>();
        List<String> lista2 = new ArrayList<>();

        lista1.add(1);
        lista1.add(4);
        lista1.add(3);
        lista1.add(7);

        lista2.add("Azul");
        lista2.add("Rojo");
        lista2.add("Morado");
        lista2.add("Verde");

        lista1.delete(2);

        System.out.println("---------------------");

        System.out.println("El tamaño es:" + lista1.getSize());

        for (int i=0;i<lista1.getSize();i++) {

            System.out.println(lista1.get(i));
        }

        System.out.println("---------------------");

        System.out.println("---------------------");

        for (int i=0;i<lista2.getSize();i++) {

            System.out.println(lista2.get(i));
        }

    }
}