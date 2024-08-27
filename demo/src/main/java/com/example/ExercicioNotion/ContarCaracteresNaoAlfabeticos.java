package com.example.ExercicioNotion;

public class ContarCaracteresNaoAlfabeticos {
      public int contarCaracteresNaoAlfabeticos(String frase) {
        int contador=0;

        for (int i=0; i < frase.length(); i++) {
            
            char c= frase.charAt(i);
            if (!Character.isLetter(c)) {
                contador++;
            }
        }

        return contador;
    }


}
