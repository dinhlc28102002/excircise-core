import java.util.Scanner;

public class ex4 {
//    Bài tập 4:
//
//    Viết chương trình cho phép nhập vào 3 số
//    Chương trình sẽ kiểm tra 3 số này có phải là 3 cạnh của một tam giác vuông hay không.

    public static void main(String[] args)
    {
        float a, b, c;
        System.out.println("Nhập vào 3 số:");
        Scanner sc = new Scanner(System.in);

        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();

        if(a*a+b*b==c*c || b*b+c*c==a*a || c*c+a*a==b*b)
            System.out.println("Ba số đúng là 3 cạnh của 1 tam giác vuông");
        else
            System.out.println("Ba số không phải là cạnh của 1 tam giác vuông");
    }
}
