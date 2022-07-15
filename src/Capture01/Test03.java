package Capture01;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sec = in.nextInt();
        int min;
        int hour;

        min = sec / 60;
        hour = min / 60;

        System.out.println(hour+"시간"+min+"분"+sec % 60+"초");
    }
}
