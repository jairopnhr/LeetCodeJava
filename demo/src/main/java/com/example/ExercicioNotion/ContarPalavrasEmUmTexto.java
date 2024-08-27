package com.example.ExercicioNotion;

public class ContarPalavrasEmUmTexto {

        public int contarQuantidadesDePalavras(String frase) {
            if (frase == null || frase.trim().isEmpty()) {
                return 0;
            }
            String[] palavras = frase.trim().split("\\s+"); 
            return palavras.length;
        }
    
    }
    
    
            
    
    
