import java.util.Scanner;
class Transpose {
    public static void main(String[] args) {	
	int i,j;
	Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of rows:");
        int r= sc.nextInt();
	System.out.println("Enter the number of columns:");
        int c= sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println("Enter the elements:");
        for ( i = 0; i < r; i++) {
            for ( j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
System.out.println("Displaying the original matrix:");
        for ( i = 0; i < r; i++) {
            for ( j = 0; j < c; j++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
int [][]transpose=new int[r][c];
for ( i = 0; i < r; i++) {
            for ( j = 0; j < c; j++) {
transpose[j][i]=matrix[i][j];}}
	 System.out.print("Displaying the transposed matrix:\n");
        for ( i = 0; i < r; i++) {
            for ( j = 0; j < c; j++) {
                System.out.print(transpose[i][j] +" ");
            }
            System.out.println();
        }
}
}


