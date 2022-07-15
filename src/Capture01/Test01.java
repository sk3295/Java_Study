package Capture01;
import java.util.Scanner;


public class Test01 {
    public static void main(String[] args) {

        int res = 0;

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        res = num * num;

        System.out.print(num+"의 제곱은 "+res);


    }
}
