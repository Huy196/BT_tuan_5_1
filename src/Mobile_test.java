import java.util.Scanner;

public class Mobile_test {
    private int pin;
    private String  Soan_tin;
    private String Nhan_tin;
    private String Xem_tin;
    private boolean trang_thai_HD;

    public Mobile_test() {
        this.pin = 100;
        this.Nhan_tin = "";
        this.Xem_tin = "";
        this.Soan_tin = "";
        this.trang_thai_HD = true;
    }

    public boolean isTrang_thai_HD(){
        return trang_thai_HD;
    }
    public void turnOn(){
        trang_thai_HD = true;
        pin_giam();
    }
    public void  turnOff(){
        trang_thai_HD = false;
        pin_giam();
    }
    public void pin(){
        pin = 100;
    }

    public void Soan_tin(String message){
        if (trang_thai_HD){
            Soan_tin = message;
            pin_giam();
        }else {
            System.out.println("Vui lòng bật điện thoại để soạn tin nhắn");
        }
    }

    public void Gui_tin(Mobile_test id_nhan){
        if (trang_thai_HD){
            id_nhan.Nhan_tin_nhan(Soan_tin);
            Xem_tin = Soan_tin;
            Soan_tin = "";
            pin_giam();
        }else {
            System.out.println("VUi lòng bật điện thoại để gửi tin nhăn");
        }
    }
    public void Nhan_tin_nhan(String message){
        if (trang_thai_HD){
            Nhan_tin = message;
            pin_giam();
        }else {
            System.out.println("Điện thoại đã tắt. Không thể nhận tin nhắn.");
        }
    }
    public void Xem_tin_nhan(){
        if (trang_thai_HD){
            System.out.println("Tin nhắn trong hộp thư đến :  " + Nhan_tin);
            pin_giam();
        }else {
            System.out.println("Vui lòng bật điện thoại để xem hộp thư đến.");
        }
    }
    public void Tin_da_gui(){
        if (trang_thai_HD){
            System.out.println("Tin nhắn đã gửi : " + Xem_tin);
            pin_giam();
        }else {
            System.out.println("Vui lòng bật điện thoại để xem tin nhắn đã gửi.");
        }
    }
    public void pin_giam(){
        if (pin > 0){
            pin--;
        }
    }
}
class Mobile_test_1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mobile_test nokia = new Mobile_test();
        Mobile_test iphone = new Mobile_test();

        while (true){
            System.out.println("\nMenu:");
            System.out.println("1. Bật điện thoại");
            System.out.println("2. Tắt điện thoại");

            System.out.println("3. Soạn và gửi tin nhắn từ Nokia tới iPhone");
            System.out.println("4. Xem hộp thư đến trên iPhone");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn của bạn: ");
            int choice = input.nextInt();
            System.out.println("----------------------------------------------");

            switch (choice) {
                case 1:
                    nokia.turnOn();
                    System.out.println("Đã mở máy");
                    break;
                case 2:
                    nokia.turnOff();
                    System.out.println("Đã tắt máy");

                    break;
                case 3:
                    if (nokia.isTrang_thai_HD()) {
                        input.nextLine(); // Consume newline character
                        System.out.print("Nhập tin nhắn từ Nokia: ");
                        String message = input.nextLine();
                        nokia.Soan_tin(message);
                        nokia.Gui_tin(iphone);
                    } else {
                        System.out.println("Vui lòng bật điện thoại trước khi gửi tin nhắn.");
                    }
                    break;
                case 4:
                    iphone.Xem_tin_nhan();
                    break;
                case 0:
                    System.out.println("Đã thoát.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }

        }
    }
}