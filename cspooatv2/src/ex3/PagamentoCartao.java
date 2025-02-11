package ex3;

public class PagamentoCartao extends Pagamento{

    @Override
    public void calcularValor() {
        double valorinicial = 23;
        double valorfinal =  valorinicial + valorinicial * 0.02;
        System.out.println("Valor do pagamento com cartao: " + valorfinal);
    }
}
