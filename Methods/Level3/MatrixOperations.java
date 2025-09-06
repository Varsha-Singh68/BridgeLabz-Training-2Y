package Methods;
import java.util.Scanner;

public class MatrixOperations {

    public static int[][] generateMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        return matrix;
    }

    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = B[0].length, common = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.printf("%4d", val);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows for first matrix: ");
        int r1 = sc.nextInt();
        System.out.print("Enter cols for first matrix: ");
        int c1 = sc.nextInt();
        System.out.print("Enter rows for second matrix: ");
        int r2 = sc.nextInt();
        System.out.print("Enter cols for second matrix: ");
        int c2 = sc.nextInt();

        int[][] A = generateMatrix(r1, c1);
        int[][] B = generateMatrix(r2, c2);

        System.out.println("Matrix A:");
        printMatrix(A);
        System.out.println("Matrix B:");
        printMatrix(B);

        if (r1 == r2 && c1 == c2) {
            System.out.println("A + B:");
            printMatrix(addMatrices(A, B));
            System.out.println("A - B:");
            printMatrix(subtractMatrices(A, B));
        } else {
            System.out.println("Addition/Subtraction not possible (different dimensions)");
        }

        if (c1 == r2) {
            System.out.println("A x B:");
            printMatrix(multiplyMatrices(A, B));
        } else {
            System.out.println("Multiplication not possible (incompatible dimensions)");
        }

        sc.close();
    }
}

