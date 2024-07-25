
import java.util.Scanner;
public class _array {
    public static void main(String[] args) {


                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the size of the Row\n");
                int n = sc.nextInt();
                System.out.println("Enter the size of the Column\n");
                int m = sc.nextInt();
                int[][] arr = new int[n][m];
                System.out.println("Enter the array of the elements");

                int sum;
                int i;
                for(sum = 0; sum < n; ++sum) {
                    for(i = 0; i < m; ++i) {
                        arr[sum][i] = sc.nextInt();
                    }
                }

                System.out.println("elements of the array are:\n");

                for(sum = 0; sum < n; ++sum) {
                    for(i = 0; i < m; ++i) {
                        System.out.print(arr[sum][i] + "  ");
                    }

                    System.out.println();
                }

                sum = 0;

                for(i = 0; i < n; ++i) {
                    for(int j = 0; j < m; ++j) {
                        sum += arr[i][j];
                    }
                }

                System.out.println("Sum of the 2-D array are:" + sum);
                i = sum / n;
                System.out.println("Average of 2-D Array =" + i);
            }
        }



