import java.util.Scanner;

public class ex5 {
//    Bài tập 5*:
//
//    Viết chương trình cho phép người dùng nhập vào mã số sinh viên
//    Sau đó kiểm tra xem mã số này có đúng với định dạng đã cho hay không.
//    Định dạng mã số sinh viên là “Bxxxxxxx” với x là số nguyên từ 1-9. (Sử dụng biểu thức chính quy để ràng buộc định dạng)

    public static void main(String[] args)
    {
        String MSSV;
        System.out.println("Nhập vào MSSV:");
        Scanner sc = new Scanner(System.in);

        MSSV = sc.nextLine();

        if (MSSV.matches("B\\d{7}"))
            System.out.println("Phù hợp");
        else
            System.out.println("Không phù hợp");

    }
}
