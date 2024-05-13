import java.util.Scanner;

class Student{
    String name;
    int age;
    boolean isScienceMajor;
    char gender;

}
class Test{
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("name ? " + student.name);
        System.out.println("age ? " + student.age);
        System.out.println("isScienceMajor ? " + student.isScienceMajor);
        System.out.println("gender ? " + student.gender);

    }
}
class Name{
    int x;
    boolean y;
}
class Test_a{
    public static void main(String[] args) {
        System.out.println("Hãy nhập giá trị cho x : ");
        Name name = new Name();
        System.out.println("x is " + name.x );
        System.out.println("y is " + name.y);
    }
}