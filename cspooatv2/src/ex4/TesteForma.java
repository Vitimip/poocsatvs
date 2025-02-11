package ex4;

public class TesteForma {
    public static void main(String[] args) {
         IForma circ = new Circulo();
         circ.calcularArea();
         ((Circulo) circ).exibirArea();
         IForma tri = new Triangulo();
         tri.calcularArea();
         ((Triangulo) tri).exibirArea();
         IForma ret = new Retangulo();
         ret.calcularArea();
         ((Retangulo) ret).exibirArea();
    }
}
