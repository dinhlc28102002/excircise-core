import java.util.Scanner;

public class ex6 {
//    Bài tập 6:
//
//    Viết chương trình cho phép nhập vào một số nguyên dương n, tính tổng tất cả số chẵn trong khoảng từ 0 - n.
    public static void main(String[] args)
    {
        int n;
        int sum = 0;
        System.out.println("Nhập vào số nguyên:");
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for (int i = 0; i <= n; i++)
            if (i % 2 == 0)
                sum += i;
        System.out.println(sum);
    }
}
