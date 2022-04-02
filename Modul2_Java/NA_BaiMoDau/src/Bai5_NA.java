import java.util.Scanner;

public class Bai5_NA {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập số");
        a = scanner.nextInt();
        System.out.println("Các số chẵn từ 1 đến:" + a);
        for (int i=1; i<=a; i++) {
            if (i%2 == 0) {
                System.out.println(i);
            }
        }
    }
}
