package ex4;

public class TesteForma {
    public static void main(String[] args) {
         Forma circ = new Circulo();
         circ.calcularArea();
         ((Circulo) circ).exibirArea();
         Forma tri = new Triangulo();
         tri.calcularArea();
         ((Triangulo) tri).exibirArea();
         Forma ret = new Retangulo();
         ret.calcularArea();
         ((Retangulo) ret).exibirArea();
    }
}
