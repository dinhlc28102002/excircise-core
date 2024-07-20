import java.util.Scanner;

public class ex18 {
//    Bài tập 18:
//
//    Viết chương trình cho phép nhập vào một chuỗi, kiểm tra xem chuỗi này có xuất hiện số hay không.
//    Nếu có tin ra “Có”, ngược lại, in ra “Không”.
    public static void main(String[] args) {
        String chuoi;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào một chuỗi: ");
        chuoi = sc.nextLine();

        if (chuoi.matches(".*\\d.*"))
            System.out.println("Có");
        else
            System.out.println("Không");
    }
}
