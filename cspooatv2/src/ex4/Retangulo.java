package ex4;

public class Retangulo implements IForma {
    public int base = 4;
    public int altura = 6;
    public double area;

    @Override
    public void calcularArea() {
      area = base*altura;
    }

    public void exibirArea(){
        System.out.println("Area do Retangulo: " + area);
    }
}
