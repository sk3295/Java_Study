package Capture01;
import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a >= 70) {
            if (b >= 30 && c >= 30) {
                if (b >= 80 || c >= 80) {
                    if (a + b + c >= 140) {
                        System.out.println("졸업 가능");
                    }
                }
            }
        }
    }
}
