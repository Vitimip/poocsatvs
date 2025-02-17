import java.util.Date;

public class Biblioteca {
    public static void main(String[] args) {
        Livro liv = new Livro();
        liv.setIdLivro(1);
        liv.setTitulo("Cavalo na chuva");
        liv.setAutor("Jose bautista");
        liv.setAno(2004);
        liv.setQuantidade(1);
        liv.exibirLivro();
        Usuario usu = new Usuario();
        usu.setIdUsuario(1);
        usu.setNome("Jose Rivaldo");
        usu.setCpf_cnpj("123.123.123-45");
        usu.setTelefone("(62)97536-8054");
        usu.setEmail("kingrv12@hotmail.com");
        usu.exibirDados();
        Emprestimo emp = new Emprestimo();
        emp.setIdEmprestimo(1);
        emp.setDataEmprestimo(String.valueOf(new Date()));
        emp.setIdLivro(1);
        emp.setIdUsuario(1);
        emp.setQuantidadeEmprestimo(1);
        System.out.println(emp.exibirEmprestimo());
    }
}
