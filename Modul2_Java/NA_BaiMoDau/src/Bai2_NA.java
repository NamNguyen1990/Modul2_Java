import java.util.Scanner;

public class Bai2_NA {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập số");
        a = scanner.nextInt();
        if (a%2 ==0) {
            System.out.println("Đây là số chẵn");
        }else
        {
            System.out.println("Đây là số lẻ");
        }
    }
}
