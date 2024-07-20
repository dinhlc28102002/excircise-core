import java.util.Scanner;

public class ex8 {
//    Bài tập 8:
//
//    Viết chương trình cho phép nhập vào một số nguyên n ( n < 1000 )
//    In ra tất cả số nguyên tố trong khoảng từ 0 - n.

    public static void main(String[] args) {
        int n;
        boolean SNT = false;
        System.out.println("Nhập vào số nguyên:");
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        System.out.print("1 2 ");
        for (int i = 3; i <= n; i++) {
            SNT = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    SNT = false;
                    break;
                }
            }
            if (SNT)
                System.out.print(i + " ");
        }
    }
}
