package Capture00;

public class CompLogicDemo {
    public static void main(String[] args) {
        int x = 0, y = 1;
        System.out.println((x < 1) || (y-- < 1));
        System.out.println("x = " + x + ", y = " + y);

        x = 0;
        y = 1;
        System.out.println((x < 1) | (y-- < 1));
        System.out.println("x = " + x + ", y = " + y);

        // < 비트 - 시프트 연산자 >
        // & : 두 비트가 모두 1일 때만 1이며 나머지는 모두 0이다.
        // | : 두 비트가 모두 0일 때만 0이며, 나머지는 모두 1이다.
        // ^ : 두 비트가 서로 다를 떄는 1, 동일할 때는 0이다.
        // ~ : 1을 0으로, 0을 1로 바꾼다.
    }
}
