package ex3;

public abstract class Pagamento {

    public abstract void calcularValor();

    public void exibirDetalhes() {
        System.out.println("Pagamento concluido");
    }

}
