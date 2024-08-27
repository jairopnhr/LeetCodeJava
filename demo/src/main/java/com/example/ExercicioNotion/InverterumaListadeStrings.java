package com.example.ExercicioNotion;

import java.util.Arrays;

public class InverterumaListadeStrings {
    public static String[] inverterUmaListaDeStrings(String[] listaDeString) {
        int tamanho= listaDeString.length;
        
        String[] novaListaDeString = new String[tamanho];
        
        for (int i=0; i < tamanho; i++) {
            novaListaDeString[i] = listaDeString[tamanho - 1 - i];
        }
        
        return novaListaDeString;
    }
    public static void main(String[] args) {
        String[] lista = new String[]{"Ola","Meu","Amigo"};
        System.out.println(Arrays.toString(inverterUmaListaDeStrings(lista)));
    
    }


}
