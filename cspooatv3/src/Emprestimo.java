import org.w3c.dom.ls.LSOutput;

public class Emprestimo {
    private int idEmprestimo;
    private String dataEmprestimo;
    private int idLivro;
    private int idUsuario;
    private int quantidadeEmprestimo;

    public Emprestimo(int idEmprestimo, String dataEmprestimo,int idLivro,int idUsuario, int quantidadeEmprestimo) {
        this.idEmprestimo = idEmprestimo;
        this.dataEmprestimo = dataEmprestimo;
        this.idLivro = idLivro;
        this.idUsuario = idUsuario;
        this.quantidadeEmprestimo = quantidadeEmprestimo;
    }

    public Emprestimo(){}

    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getQuantidadeEmprestimo() {
        return quantidadeEmprestimo;
    }

    public void setQuantidadeEmprestimo(int quantidadeEmprestimo) {
        this.quantidadeEmprestimo = quantidadeEmprestimo;
    }

    public String exibirEmprestimo(){
        System.out.println("Dados do Emprestimo:");
        System.out.println("idEmprestimo: " + idEmprestimo);
        System.out.println("dataEmprestimo: " + dataEmprestimo);
        System.out.println("idLivro: " + idLivro);
        System.out.println("idUsuario: " + idUsuario);
        System.out.println("quantidadeEmprestimo: " + quantidadeEmprestimo);
        return "\n";
    }
}
