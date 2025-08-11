import java.util.Scanner;
class MatSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int r= sc.nextInt();
	System.out.println("Enter the number of columns:");
        int c= sc.nextInt();
        int[][] matrix1 = new int[r][c];
        System.out.println("Enter the elements for 1st matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
System.out.println("Displaying 1st matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix1[i][j] +" ");
            }
            System.out.println();
        }
    
	int[][] matrix2 = new int[r][c];
  	System.out.println("Enter the elements for 2nd matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
System.out.println("Displaying 2nd matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix2[i][j] +" ");
            }
            System.out.println();
        }
    
        int[][] sum = new int[r][c];
	for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
       }
        System.out.println("Displaying sum of the two matrices:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(sum[i][j] +" ");
            }
            System.out.println();
        }
    }
}
