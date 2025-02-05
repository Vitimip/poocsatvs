public class Gerente extends Funcionario{
    private String departamento;

    public Gerente(String departamento){
        super();
        this.departamento = "Gerente";
    }

    public Gerente(){}

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
