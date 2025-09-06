package Methods;
import java.util.Scanner;

public class MatrixManipulation {

    public static int[][] generateMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        return matrix;
    }

    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    public static int determinant2x2(int[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    public static int determinant3x3(int[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    public static int[][] inverse2x2(int[][] m) {
        int det = determinant2x2(m);
        if (det == 0) return null;
        int[][] inv = new int[2][2];
        inv[0][0] = m[1][1];
        inv[0][1] = -m[0][1];
        inv[1][0] = -m[1][0];
        inv[1][1] = m[0][0];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                inv[i][j] = Math.round((float) inv[i][j] / det);
            }
        }
        return inv;
    }

    public static int[][] inverse3x3(int[][] m) {
        int det = determinant3x3(m);
        if (det == 0) return null;
        int[][] inv = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int[][] minor = new int[2][2];
                int r = 0, c = 0;
                for (int row = 0; row < 3; row++) {
                    if (row == i) continue;
                    c = 0;
                    for (int col = 0; col < 3; col++) {
                        if (col == j) continue;
                        minor[r][c] = m[row][col];
                        c++;
                    }
                    r++;
                }
                int cofactor = (int) (Math.pow(-1, i + j) * determinant2x2(minor));
                inv[j][i] = Math.round((float) cofactor / det);
            }
        }
        return inv;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.printf("%5d", val);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix (2 or 3): ");
        int n = sc.nextInt();
        int[][] M = generateMatrix(n, n);

        System.out.println("Matrix:");
        printMatrix(M);

        System.out.println("Transpose:");
        printMatrix(transpose(M));

        if (n == 2) {
            int det = determinant2x2(M);
            System.out.println("Determinant: " + det);
            int[][] inv = inverse2x2(M);
            if (inv != null) {
                System.out.println("Inverse:");
                printMatrix(inv);
            } else {
                System.out.println("Inverse does not exist (det=0)");
            }
        } else if (n == 3) {
            int det = determinant3x3(M);
            System.out.println("Determinant: " + det);
            int[][] inv = inverse3x3(M);
            if (inv != null) {
                System.out.println("Inverse:");
                printMatrix(inv);
            } else {
                System.out.println("Inverse does not exist (det=0)");
            }
        }

        sc.close();
    }
}

