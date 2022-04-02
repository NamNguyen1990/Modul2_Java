import java.util.Scanner;

public class PT_BacNhat {
    public static void main(String[] args) {
        double a;
        double b;
        double x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào a");
        a = scanner.nextDouble();
        System.out.println("Nhập vào b");
        b = scanner.nextDouble();
        if (a == 0 && b == 0) {
            System.out.println("Phương trình vô số nghiệm");
        }
        else if (a != 0 && b == 0) {
            System.out.println("Phương trình có nghiệm: x = 0");
        }
        else if (a == 0 && b != 0) {
            System.out.println("Phương trình vô nghiệm");
        }
        else {
            x = -b/a;
            System.out.println("Phương trình có nghiệm:" + x);
        }
    }
}