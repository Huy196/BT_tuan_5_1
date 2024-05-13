import java.util.Scanner;

public class Rectangle {
    double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return " có  { " + "width = " + width + ", height = " + height + " }";
    }
}


class Rectangle1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều rộng: ");
        double width = scanner.nextDouble();
        System.out.print("Nhập chiều cao: ");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("\nHình chữ nhật của bạn : " + rectangle.display());
        System.out.println("\nChu vi của hình chữ nhật : " + rectangle.getPerimeter());
        System.out.println("\nDiện tích hình chữ nhật : " + rectangle.getArea());
    }
}