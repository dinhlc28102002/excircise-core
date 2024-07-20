import java.util.Scanner;

public class ex16 {
//    Bài tập 16:
//
//    Viết chương trình cho phép người dùng nhập vào một chuỗi, sau đó nhập vào một ký tự.
//    Kiểm tra xem ký tự đó có xuất hiện trong chuỗi hay không? Nếu có in ra “Có”, ngược lại in ra “Không”.
    public static void main(String[] args) {
        String chuoi;
        char kiTu;
        boolean tonTai = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào một chuỗi: ");
        chuoi = sc.nextLine();
        System.out.println("Nhập vào ký tự muốn kiểm tra:");
        kiTu = sc.nextLine().charAt(0);

        char mangKiTu[] = chuoi.toCharArray();
        for (int i = 0; i < mangKiTu.length; i++) {
            if (kiTu == mangKiTu[i]) {
                System.out.println("Có");
                tonTai = true;
            }
        }
        if (tonTai == false)
            System.out.println("Không");
    }
}
