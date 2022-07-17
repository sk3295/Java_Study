package Capture01;
import java.util.Scanner;

public class Test08 {
    public static void main (String[]args) {
        int num = 0;
        int sum=0;

        System.out.print("숫자를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();

        while(num != 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println("각 자리 수의 합은 "+sum+" 입니다.");

        sc.close(); // 키보드 입력 시엔 필수가 아니나 사용 권장
    }
}