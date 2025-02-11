package ex4;

public class Triangulo implements IForma {
    public int base = 9;
    public int altura = 10;
    public double area;

    @Override
    public void calcularArea() {
        area = base*altura/2;
    }

    public void exibirArea(){
        System.out.println("Area do triangulo: " + area);
    }
}
