import java.util.Scanner;

public class ex10 {
//    Bài tập 10*:
//
//    Viết chương trình cho phép người dùng nhập vào 5 mã số sinh viên.
//    Kiểm tra xem mã số sinh viên này có đúng với định dạng hay chưa.
//    Với định dạng mã số sinh viên là “B170xxxx” với x là số nguyên từ 1-9. (Sử dụng biểu thức chính quy để ràng buộc định dạng)

    public static void main(String[] args) {
        {
            String[] MSSV = new String[5];
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < 5; i++) {
                System.out.println("Nhập vào MSSV thứ " + (i + 1) + ":");
                MSSV[i] = sc.nextLine();
            }

            for (int i = 0; i < 5; i++) {
                if (!MSSV[i].matches("B170[1-9]{4}"))
                    System.out.println("MSSV thứ " + (i + 1) + " sai định dạng!");
            }
        }
    }
}