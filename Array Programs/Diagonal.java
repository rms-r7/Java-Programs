import java.util.Scanner;

public class Diagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                System.out.print("Please enter the size of the square matrix: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        int sum = 0;

                System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

                for (int i = 0; i < n; i++) {
            sum += matrix[i][i]; 
        }

                System.out.println("Displaying the sum of diagonal elements: " + sum);
    }
}
