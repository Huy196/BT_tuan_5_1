import java.util.Scanner;

public class MyDate {
    int day, month, year;
    String name;

    public MyDate(int day, int month, int year, String name) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.name = name;
    }

    public String name() {
        return this.name;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }
}

class MyDate_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập tên của bạn : ");
        String name1 = sc.nextLine();
        System.out.println("Xin vui lòng nhập ngày sinh của bạn !");

        System.out.print("Vui lòng nhập ngày : ");
        int day1 = sc.nextInt();
        System.out.print("Vui lòng nhập tháng : ");
        int mouth1 = sc.nextInt();
        System.out.print("Vui lòng nhập năm : ");
        int year1 = sc.nextInt();

        MyDate myDate = new MyDate(day1, mouth1, year1, name1);
        System.out.println(name1 + " - Ngày sinh : " + myDate.day + "/" + myDate.month + "/" + myDate.year);
    }
}
