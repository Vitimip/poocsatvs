package ex5;

public class TesteFuncionarios {
    public static void main(String[] args) {
        Funcionario ger = new Gerente();
        Funcionario fun = new Funcionario();
        Funcionario des = new Desenvolvedor();
        fun.exibirDetalhes();
        fun.calcularBonus();
        des.exibirDetalhes();
        des.calcularBonus();
        ger.exibirDetalhes();
        ger.calcularBonus();
    }
}
