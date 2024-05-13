import java.util.Enumeration;
import java.util.Scanner;

public class Temperature {
    double Do_C;

    public Temperature(double Do_C) {
        this.Do_C = Do_C;
    }

    public double Do_F() {
        return (Do_C * 9 / 5 + 32);
    }

    public double Do_K() {
        return (Do_C + 373.15);
    }
}

class Temperature_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Máy hoán đổi độ C sang F và Kenvin");
        double number;
        do {
            System.out.print("Hãy nhập giá trị Độ C = ");
            number = sc.nextInt();

            Temperature temperature = new Temperature(number);
            System.out.println("-------------------");

            if (number < -273) {
                System.out.println("Vượt quá giới hạn cho phép ! ");
            } else {
                System.out.println("Sang độ C");
                System.out.println(number + " độ C = " + temperature.Do_F() + " F");
                System.out.println("-------------------");
                System.out.println("Sang độ Kenvin");
                System.out.println(number + " độ C = " + temperature.Do_K() + " K");
            }
        } while (number < -273);
    }
}

