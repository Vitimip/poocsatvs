public class Gerente extends Funcionario{
    private String departamento;

    public Gerente(String departamento){
        this.departamento = departamento;
    }

    public Gerente(){}

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
