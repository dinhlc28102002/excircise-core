import java.util.Scanner;

public class ex13 {
//    Bài tập 13:
//
//    Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên (có thể dương hoặc âm).
//    Cuối cùng, chương trình sẽ xuất ra phần tử có giá trị nhỏ nhất.

    public static void main(String[] args) {
        int n;
        int[] soNguyen;
        int min = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào n:");
        n = sc.nextInt();
        soNguyen = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập vào số nguyên:");
            soNguyen[i] = sc.nextInt();
        }

        min = soNguyen[0];

        for (int i = 0; i < n; i++) {
            if (soNguyen[i] < min)
                min = soNguyen[i];
        }

        System.out.println("Phần tử có giá trị nhỏ nhất là: " + min);
    }
}
