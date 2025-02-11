package ex5;

public class Gerente extends Funcionario{
    public String nomeGerente = "Gerente";
    public double salarioGerente = 12000;

    @Override
    public void exibirDetalhes(){
        System.out.println("Nome: " + nomeGerente);
        System.out.println("Salario: " + salarioGerente);
    }

    @Override
    public void calcularBonus(){
        bonus = salario * 0.2;
        System.out.println("Bonus do Chefe: " + bonus);
    }
}
