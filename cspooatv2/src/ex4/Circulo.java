package ex4;

public class Circulo implements Forma{
    public double raio = 2;
    public double area;

    @Override
    public void calcularArea() {
       area = Math.PI * Math.pow(raio, 2);
    }

    public void exibirArea(){
        System.out.println("Area do Circulo: " + area);
    }
}
