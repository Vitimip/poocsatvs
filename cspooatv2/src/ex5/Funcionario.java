package ex5;

public class Funcionario {
    public String nome = "Fernando";
    public double salario = 1200;
    public double bonus;

    public void exibirDetalhes(){
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + salario);
    }

    public void calcularBonus(){
        bonus = salario * 0.1;
        System.out.println("Bonus do Funcionario base: " + bonus);
    }
}
