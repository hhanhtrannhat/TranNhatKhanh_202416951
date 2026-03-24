import java.util.Arrays;
import java.util.Scanner;

public class my_array1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        double[] arr = new double[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }
        Arrays.sort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr));
        System.out.println("Sum: " + sum + ", Avg: " + (sum / n));
    }
}