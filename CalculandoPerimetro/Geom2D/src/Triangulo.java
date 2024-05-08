public class Triangulo extends Geom2D {

    double ladoA = 3;
    double ladoB = 25;
    double ladoC = 26; 

    @Override
    double calcPerimetro() {
        super.perimetro = this.ladoA + this.ladoB + this.ladoC;
        return super.perimetro;
    }

    public static void main(String[] args) {
        Triangulo trian = new Triangulo();
        System.out.println("Perimetro: " + trian.calcPerimetro());
    }
}
