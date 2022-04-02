import java.util.Scanner;

public class SDToanTu {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài hình chữ nhật");
        a = scanner.nextDouble();
        System.out.println("Nhập chiều rộng hình chữ nhật");
        b = scanner.nextDouble();
        c = a*b;
        System.out.println("Diện tích hình chữ nhật là:" + c);
    }
}
