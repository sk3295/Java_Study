package Capture01;
import java.util.Scanner;


public class Test02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double res = 0;

        int num = in.nextInt();
        int num2 = in.nextInt();

        res = num * num * 3.14 * num2;

        System.out.println("원기둥의 부피는 "+(int)res);
    }
}
