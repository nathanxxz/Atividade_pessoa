package br.com.projeto.pessoa.model;

public class Pessoa {
    public String nome;
    public String profissao;
    public int horasTrab;
    public int cpf;
    public double salario;

    public Pessoa(String nome,String profissao, int horasTrab,int cpf ){
        this.nome=nome;
        this.profissao=profissao;
        this.cpf=cpf;
        this.horasTrab=horasTrab;
    }
    public void calcularHoras(double valorhor){
        this.salario=this.horasTrab*valorhor;
        System.out.printf("O salario é %f",this.salario);
    }
    public void apresentar(){
        System.out.printf("Meu nome é %s, meu cpf é %d, minha profissao é %s , e a quantidade de horas que trabalho é %d, e meu salario %.2f",this.nome,this.cpf,this.profissao,this.horasTrab,this.salario);
    }

    }
