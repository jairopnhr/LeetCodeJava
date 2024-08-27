package com.example.linkedin.Lambda;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo {
    public static void main(String[] args) {
    List<Pessoa> pessoas = new ArrayList<>();
    Pessoa jairo = new Pessoa("Jairo",25);
    Pessoa joao = new Pessoa("João",48);
    Pessoa jasmine = new Pessoa("Jasmine",10);
    Pessoa jessica = new Pessoa("Jessica",9);

    Pessoa carlos = new Pessoa("Carlos",25);
    Pessoa pedro = new Pessoa("Pedro",65);
    Pessoa thiago = new Pessoa("Thiago",15);
    Pessoa mathias = new Pessoa("Maathias",30);
    
    pessoas.add(mathias);
    pessoas.add(pedro);
    pessoas.add(carlos);
    pessoas.add(thiago);
    pessoas.add(jairo);
    pessoas.add(jasmine);
    pessoas.add(jessica);
    pessoas.add(joao);
    //Com Lambda
    List<String> pessoasComALetraJ = pessoas.
    stream().
    map(Pessoa::getNome).
    filter(p -> p.startsWith("J")).
    collect(Collectors.toList());
    System.out.println("Com Lambda");
    pessoasComALetraJ.
    stream().
    forEach(System.out::println);

    //Sem Lambda
    List<String> pessoasComALetraJSLambda = new ArrayList<>();
    for (Pessoa pessoa : pessoas){
        String nomePessoa = pessoa.getNome();
        Integer idade = pessoa.getIdade();
        if (nomePessoa.startsWith("J") && idade<= 18){

        }
        
    }
    System.out.println("Sem lambda");
    for(String nome :pessoasComALetraJSLambda)
    {
        System.out.println(nome);
    }
}
}
class Pessoa  {
    private String nome;
    private Integer idade ; 

    public Pessoa(String nome,Integer idade)
    {
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome(){return this.nome;}
    public Integer getIdade(){return this.idade;}
}