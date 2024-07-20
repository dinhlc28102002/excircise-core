import java.util.Scanner;

public class ex17 {
//    Bài tập 17:
//
//    Viết chương trình cho phép người dùng nhập vào một chuỗi, sau đó nhập vào một ký tự.
//    Kiểm tra xem ký tự nhập vào đó nằm ở vị trí thứ mấy trong chuỗi(nếu có, số đếm bắt đầu từ 0).
//    Nếu nó có xuất hiện trong chuỗi thì in ra vị trí của nó trong chuỗi, nếu không thì in ra “Không tồn tại trong chuỗi”.
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
                System.out.println((i + 1));
                tonTai = true;
            }
        }
        if (tonTai == false)
            System.out.println("Không tồn tại trong chuỗi");
    }
}
