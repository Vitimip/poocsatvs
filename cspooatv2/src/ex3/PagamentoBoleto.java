package ex3;

public class PagamentoBoleto extends Pagamento {

    @Override
    public void calcularValor() {
         double valor = 23;
        System.out.println("valor do pagamento com boleto: " + valor);
    }
}
