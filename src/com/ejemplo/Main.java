package com.ejemplo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String textoEntrada;

        //para el asunto de las vocales
        String[] vocales = {"a", "e", "i", "o", "u"};
        int cantVocales = 0;

        //Tomamos el texto desde la consola
        System.out.println("Introduce un texto de entrada");
        textoEntrada = in.nextLine();

        String letraMasRepetida = "";
        int cantidadRepetida = 0;

        //Transformamos la frase a una lista,
        //así podremos buscar las letras duplicadas con Collections
        List<String> textoList = Arrays.asList(textoEntrada.split(""));

        //contamos las vocales
        for (String v : vocales) {
            cantVocales += Collections.frequency(textoList, v);
        }
        System.out.println("Hay " + cantVocales + " vocales");

        //Recorremos y contamos todo
        for (String item : textoList) {
            //pasamos como primer parámetro la lista
            // y como segundo la letra que queremos contar
            int cantidad = Collections.frequency(textoList, item);
            // con esto comprobamos que no sea un espacio en blanco
            if (cantidadRepetida < cantidad && !item.equals(" ")) {
                letraMasRepetida = item;
                cantidadRepetida = cantidad;
            }
            System.out.println("La letra " + item + " se repite  " + cantidad);
        }
        //imprimimos la letra que más se repite
        System.out.println(String.format("La letra %s es la que mayor se repite, con %o veces", letraMasRepetida, cantidadRepetida));
    }
}