public class Livro extends Emprestimo{
    private int idLivro;
    private String titulo;
    private String autor;
    private int ano;
    private int quantidade;

    public Livro(int idLivro,String titulo, String autor, int ano, int quantidade) {
        this.idLivro = idLivro;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.quantidade = quantidade;
    }

    public Livro(){}

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void exibirLivro(){
        System.out.println("Dados do livro: ");
        System.out.println("Livro ID: " + idLivro);
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
        System.out.println("Quantidade: " + quantidade);
        System.out.println();
    }
}
