package ex3;

public abstract class TestePagamento {
    public static void main(String[] args) {
             Pagamento pgb = new PagamentoBoleto();
             pgb.calcularValor();
        Pagamento pgc = new PagamentoCartao();
             pgc.calcularValor();

    }
}
