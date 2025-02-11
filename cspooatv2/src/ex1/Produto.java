package ex1;

public class Produto {
    private String nome;
    private Double preco;
    private int quantestoque;

    public String getNome() {
        return nome;
    }

    public String setNome(String nome) {
        this.nome = nome;
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public Double setPreco(Double preco) {
        this.preco = preco;
        return preco;
    }

    public int getQuantestoque() {
        return quantestoque;
    }

    public int setQuantestoque(int quantestoque) {
        this.quantestoque = quantestoque;
        return quantestoque;
    }

    public void exibirProduto(String nome,Double preco, int quantestoque) {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade de estoque" + quantestoque);
    }

    public void addestoque(){
        this.quantestoque++;
    }

    public void removerestoque(){
        if(quantestoque >= 0){
            this.quantestoque--;
        }
    }
}
