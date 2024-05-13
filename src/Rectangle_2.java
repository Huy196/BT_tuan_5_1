import java.util.Scanner;

public class Rectangle_2 {
    double dai, rong, rectangle, chuvi;

    public Rectangle_2(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
        this.chuvi = getChuvi();
        this.rectangle = getRectangle();
    }

    public double getChuvi() {
        return (dai + rong) * 2;
    }

    public double getRectangle() {
        return dai * rong;
    }
}

class Rectangle_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài : ");
        double number_1 = sc.nextDouble();

        System.out.print("Nhập chiều rộng : ");
        double number_2 = sc.nextDouble();

        Rectangle_2 rectangle_2 = new Rectangle_2(number_1, number_2);
        System.out.println("Chu vi hình HCN : " + rectangle_2.getChuvi());
        System.out.print("Diện tích HCN bằng : " + rectangle_2.getRectangle());
    }
}
