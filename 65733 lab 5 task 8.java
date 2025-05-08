import java.util.Scanner;

public class TableDataExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter rows and columns: ");
        int rows = scanner.nextInt(), cols = scanner.nextInt();
        int[][] table_data = new int[rows][cols];

      
        System.out.println("Enter array elements:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                table_data[i][j] = scanner.nextInt();

      
        System.out.println("\nArray elements:");
        for (int[] row : table_data) {
            for (int elem : row) System.out.print(elem + " ");
            System.out.println();
        }

        System.out.println("\nReversed array elements:");
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 0; j--) {
                System.out.print(table_data[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
