package Capture01;
import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float num = in.nextInt();
        float res = (num - 32) * (float)5 / 9;

        System.out.println(res+"C");
    }
}
