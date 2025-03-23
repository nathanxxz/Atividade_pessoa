package br.com.projeto.pessoa.main;

import br.com.projeto.pessoa.model.Pessoa;

public class Main {
    public static void main(String[]args) {
        Pessoa pessoa = new Pessoa("Nathan", "Policial", 35, 1821821828);
        Pessoa pessoa2=new Pessoa("Erlon","Eng softw",32,1234567890);
        Pessoa pessoa3=new Pessoa("Eren","Solador",25,292992929);
        Pessoa pessoa4=new Pessoa("Ichigo","Espirito",100,292919191);
        pessoa.calcularHoras(32);
        pessoa2.calcularHoras(25);
        pessoa3.calcularHoras(37);
        pessoa4.calcularHoras(100);
        System.out.println();
        System.out.println();
        System.out.println("APRESENTACAO");
        System.out.println();
        pessoa.apresentar();
        System.out.println();
        pessoa2.apresentar();
        System.out.println();
        pessoa3.apresentar();
        System.out.println();
        pessoa4.apresentar();

    }}