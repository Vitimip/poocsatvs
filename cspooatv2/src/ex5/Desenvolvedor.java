package ex5;

public class Desenvolvedor extends Funcionario{
    public String nomedesenvolvedor = "Desmond bane";
    public double salariodesenvolvedor = 2000;

    @Override
    public void exibirDetalhes(){
        System.out.println("Nome: " + nomedesenvolvedor);
        System.out.println("Salario: " + salariodesenvolvedor);
    }

    @Override
    public void calcularBonus(){
        bonus = salario * 0.15;
        System.out.println("Bonus do Desenvolvedor: " + bonus);
    }
}
