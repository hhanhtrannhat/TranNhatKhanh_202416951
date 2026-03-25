import java.util.Scanner;

public class addmatrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows: "); int r = sc.nextInt();
        System.out.print("Cols: "); int c = sc.nextInt();
        int[][] m1 = new int[r][c], m2 = new int[r][c];

        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) m1[i][j] = sc.nextInt();
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) m2[i][j] = sc.nextInt();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) System.out.print((m1[i][j] + m2[i][j]) + " ");
            System.out.println();
        }
    }
}