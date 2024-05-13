import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;
    double x1, x2, delta;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.delta = delta();
    }

    public double delta() {
        return (b * b) - (4 * a * c);
    }

    public void CalculateRoots() {
        if (delta > 0) {
            x1 = (-b + Math.pow((b * b - 4 * a * c), 0.5)) / 2 * a;
            x2 = (-b - Math.pow((b * b - 4 * a * c), 0.5)) / 2 * a;
        } else if (delta == 0) {
            x1 = -b / (2 * a);
            x2 = x1;
        } else {
            System.out.println("No real roots exist.");
        }
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }
}

class QuadraticEquation_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập giá trị của a = ");
        double a = sc.nextDouble();
        System.out.print("Nhập giá trị của b = ");
        double b = sc.nextDouble();
        System.out.print("Nhập giá trị của c = ");
        double c = sc.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        quadraticEquation.CalculateRoots();
        System.out.println("---------------------");
        System.out.println("Delta = " + quadraticEquation.delta);
        System.out.println("---------------------");
        System.out.println("Phương trình có nghiệm X1 =  " + quadraticEquation.getX1());
        System.out.println("Phương trình có nghiệm X2 =  " + quadraticEquation.getX2());

    }
}