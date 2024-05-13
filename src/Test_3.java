import java.io.StringReader;
import java.util.Scanner;

public class Test_3 {
    private int Pin;
    private String Soan_Tin;
    private String Nhan_Tin;
    private String Xem_tin;
    private boolean TTHĐ;

    public Test_3() {
        this.Pin = 100;
        this.Soan_Tin = "";
        this.Nhan_Tin = "";
        this.Xem_tin = "";
        this.TTHĐ = true;
    }

    public boolean isTTHĐ() {
        return TTHĐ;
    }

    public void turnOn() {
        TTHĐ = true;
        Pin_giam();
    }
    public void turnOf(){
        TTHĐ = false;
    }
    public void Soan_Tin(String mess){
        if (TTHĐ){
            Soan_Tin = mess;
            Pin_giam();
        }else{
            System.out.println("Vui lòng bật điện thoại để soạn tin !");
        }
    }
    public void Gui_Tin(Test_3 id_tin){
        if (TTHĐ){
            id_tin.Nhan_Tin_Nhan(Soan_Tin);
            Xem_tin = Soan_Tin;
            Soan_Tin = "";
            Pin_giam();
        }
        else{
            System.out.println("Vui lòng bật điện thoại để soạn tin !");
        }
    }
    public void Nhan_Tin_Nhan(String mess){
        if (TTHĐ){
            Nhan_Tin = mess;
            Pin_giam();
        }else{
            System.out.println("Vui lòng bật điện thoại để soạn tin !");
        }
    }
    public void Xem_Tin_Nhan(){
        if (TTHĐ){
            System.out.println("Tin nhắn đã gửi : " +Nhan_Tin );
            Pin_giam();
        }else{
            System.out.println("Vui lòng bật điện thoại để soạn tin !");
        }
    }
    public void Tin_da_gui(){
        if (TTHĐ){
            System.out.println("Tin đã gửi : " + Xem_tin);
            Pin_giam();
        }else{
            System.out.println("Vui lòng bật điện thoại để soạn tin !");
        }
    }

    public void Pin() {
        Pin = 100;
    }
    public void Pin_giam(){
        if (Pin > 0){
            Pin--;
        }
    }
}
class Mobile{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Test_3 nokia = new Test_3();
        Test_3 ipone = new Test_3();

        while (true){
            System.out.println("\nMenu:");
            System.out.println("1. Bật điện thoại");
            System.out.println("2. Tắt điện thoại");

            System.out.println("3. Soạn và gửi tin nhắn từ Nokia tới iPhone");
            System.out.println("4. Xem hộp thư đến trên iPhone");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn của bạn: ");
            int choice = input.nextInt();

            switch (choice){
                case 1:
                    nokia.turnOn();
                    System.out.println("Đã mở máy");
                    break;
                case 2:
                    nokia.turnOf();
                    System.out.println("Điện thoại đã tắt");
                    break;
                case 3:
                    if (nokia.isTTHĐ()){
                        input.nextLine();
                        System.out.println("Nhập tin nắn từ nokia : ");
                        String mess = input.nextLine();
                        nokia.Soan_Tin(mess);
                        nokia.Gui_Tin(ipone);
                    }else {
                        System.out.println("Vui lòng bật điện thoại trước khi gửi tin nhắn.");
                    }
                    break;
                case 4:
                    ipone.Xem_Tin_Nhan();
                    break;
                case 0:
                    System.out.println("Đã Thoát");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn của bạn không hợp lệ. Vui lòng chọn lại");
                    break;
            }
        }
    }
}