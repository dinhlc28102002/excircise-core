import java.util.Scanner;

public class ex14 {
//    Bài tập 14:
//
//    Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên.
//    Sắp xếp các phần tử trong mảng theo thứ tự ngược lại.
    public static void main(String[] args) {
        //Khai báo các biến cần thiết
        int n;
        int[] soNguyen;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào n:");
        n = sc.nextInt();
        soNguyen = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập vào số nguyên:");
            soNguyen[i] = sc.nextInt();
        }

        System.out.println("Mảng trước khi đảo ngược: ");
        for (int i = 0; i < n; i++)
            System.out.print(soNguyen[i] + " ");

        for (int i = 0; i < n / 2; i++) {
            int empty;
            empty = soNguyen[i];
            soNguyen[i] = soNguyen[n - i - 1];
            soNguyen[n - i - 1] = empty;
        }

        System.out.println("\nMảng sau khi đảo ngược: ");
        for (int i = 0; i < n; i++)
            System.out.print(soNguyen[i] + " ");
    }
}
