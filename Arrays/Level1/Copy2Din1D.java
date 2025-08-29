package Arrays;
import java.util.*;

public class Copy2Din1D {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows=");
        int rows=sc.nextInt();
        System.out.print("Enter number of columns=");
        int column=sc.nextInt();

        int matrix[][]=new int[rows][column];
        System.out.println("Enter elements of matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        int arr[]=new int[rows*column];
        int index=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                arr[index]=matrix[i][j];
                index++;
            }
        }

        System.out.println("2D Array:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("1D Array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

	}

}
