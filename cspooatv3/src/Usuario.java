public class Usuario extends Emprestimo{
    private int idUsuario;
    private String nome;
    private String cpf_cnpj;
    private String telefone;
    private String email;

    public Usuario(int idUsuario,String nome, String cpf_cnpj, String telefone, String email) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.cpf_cnpj = cpf_cnpj;
        this.telefone = telefone;
        this.email = email;
    }

    public Usuario() {}

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void exibirDados() {
        System.out.println("Dados do usuario: ");
        System.out.println("ID: " + idUsuario);
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf_cnpj);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
        System.out.println();
    }

}
