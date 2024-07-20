import java.util.Scanner;

public class ex15 {
//    Bài tập 15(*):
//
//    Viết chương trình cho phép người dùng nhập vào 5 mã số, lưu 5 mã số này vào một mảng.
//    Chương trình sẽ kiểm tra xem trong 5 mã số này có mã số nào sai định dạng hay không (định dạng là “00yLxxxx” với y là số nguyên từ 2 - 5, x là số nguyên từ 0-9).
//    Nếu có bất kỳ mã số nào sai định dạng thì chương trình in ra “Sai rồi” rồi kết thúc chương trình, ngược lại thì in ra “Đúng rồi”. (Sử dụng biểu thức chính quy để ràng buộc định dạng)
    public static void main(String[] args) {
        String[] code = new String[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập vào mã thứ " + (i + 1));
            code[i] = sc.nextLine();
            if (!code[i].matches("00[2-5]L\\d{4}")) {
                System.out.println("Sai rồi!");
                return;
            }
        }
        System.out.println("Đúng rồi!");
    }
}
