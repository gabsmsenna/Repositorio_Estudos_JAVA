package academy.nelioalves.cursojava.domain.OrientaçãoObjetos;



public class Retangulo {
    public double width;
    public double height;

    public double calculoArea() {
        return width * height;
    }

    public double calculoPerimetro() {
        return 2 * (width + height);
    }

    public double calculoDiagonal() {
        return (width * width) + (height * height);
    }


}
