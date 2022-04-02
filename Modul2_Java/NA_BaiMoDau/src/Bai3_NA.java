import java.util.Scanner;

public class Bai3_NA {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập điểm số");
        a = scanner.nextInt();
        if (a<5) {
            System.out.println("Học lực kém");
        }
        else if (a<8) {
            System.out.println("Học lực khá");
        }
        else {
            System.out.println("Học lực giỏi");
        }
    }
}
