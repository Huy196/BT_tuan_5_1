import java.util.Scanner;

public class Circle {
    double radius, area;

    public Circle(double radius) {
        this.radius = radius;
        this.area = getArea();
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return (Math.PI * radius * radius);
    }
}

class Circle_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập bán kính :");
        double number = sc.nextInt();

        Circle circle = new Circle(number);
        System.out.println("Bán kính : " + circle.radius);

        System.out.println("Diện tích : " + circle.area);
    }
}