import java.util.Scanner;

public class Bai6_NA {
    public static void main(String[] args) {
        int a;
        int b;
        int c = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số a");
        a = scanner.nextInt();
        System.out.println("Nhập số b");
        b = scanner.nextInt();
        for (int i=a; i<=b; i++) {
            c = c + i;
        }
        System.out.println("Tổng các số từ a đến b là:" + c);
    }
}
