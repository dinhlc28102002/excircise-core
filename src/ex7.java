import java.util.Scanner;

public class ex7 {
//    Bài tập 7:
//
//    Viết chương trình để nhập nhập một số nguyên, tìm kết quả phép nhân của số đó với các số từ 1 - 20 , sau đó in kết quả ra màn hình.

    public static void main(String[] args) {
        int n;
        int sum = 0;
        System.out.println("Nhập vào số nguyên:");
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for (int i = 1; i <= 20; i++)
        {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}
