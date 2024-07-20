import java.util.Scanner;

public class ex9 {
//    Bài tập 9:
//
//    Viết chương trình cho phép nhập vào số nguyên n( n <= 20 ), in ra số Fibonacci ứng với nó.
//    Số Fibonacci là số mà nó bằng tổng của 2 số Fibonacci trước nó.
//    Với giả thuyết là Fi(0) = 1, Fi(1) = 1.
//
//    Ta có ví dụ: Fi(2) = Fi(0) + Fi(1) = 1+1 = 2, Fi(3) =Fi(2) + Fi(1) = 2+1 = 3, Fi(4) = Fi(3) + Fi(2) = 3+2 = 5, … Giả sử n = 4, đầu ra sẽ là 5.

    public static void main(String[] args) {
        int n;
        int Fi;
        System.out.println("Nhập vào số nguyên:");
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        Fi = CalculateFi(n);

        System.out.println("Fi(" + n + ") = " + Fi);
    }

    public static int CalculateFi(int n)
    {
        if (n == 0 || n == 1){
            return 1;
        }
        return CalculateFi(n-1) + CalculateFi(n-2);
    }
}
