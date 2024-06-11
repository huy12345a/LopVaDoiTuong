package PhuongTrinhBac2;

public class PhuongTrinhBacHai {
    double a, b ,c;
    public PhuongTrinhBacHai() {}
    public PhuongTrinhBacHai(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double delta() {
        return (b*b - 4*a*c);
    }
    public double nghiem1() {
        return (-b + Math.sqrt(delta()))/(2*a);
    }
    public double nghiem2() {
        return (-b - Math.sqrt(delta()))/(2*a);
    }
}
