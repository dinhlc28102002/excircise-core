import java.util.Scanner;

public class ex1 {
//    Bài tập 1:
//
//    Viết chương trình Java mà khi chạy, màn hình console sẽ cho phép ta nhập vào một số nguyên, in ra màn hình “Đây là số nguyên dương”
//    Nếu số vừa nhập vào là một số lớn hơn hoặc bằng 0, ngược lại in ra “Đây là số nguyên âm”.

    public static void main(String[] args) {
        int n;
        System.out.println("Nhap so nguyen: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n > 0) {
            System.out.println("n la so nguyen duong");
        }else {
            System.out.println("n la so nguyen am");
        }
    }
}
