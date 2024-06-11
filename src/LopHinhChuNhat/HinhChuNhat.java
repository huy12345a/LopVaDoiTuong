package LopHinhChuNhat;

public class HinhChuNhat {
    double width, height;

    public HinhChuNhat() {
    }

    public HinhChuNhat(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return this.width * this.height;
    }

    public double perimeter() {
        return ((this.width + this.height) * 2);
    }
    public void hienthi(){
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

