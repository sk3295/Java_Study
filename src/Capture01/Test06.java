package Capture01;
import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        System.out.println(num / 4 == 0 || num / 5 == 0);
        System.out.println(num / 4 == 0 && num / 5 == 0);
    }
}
