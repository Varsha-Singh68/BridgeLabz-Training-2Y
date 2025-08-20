package Programming_Elements;

public class DividePens {

	public static void main(String[] args) {
		int students=3;
		int penQuantity=14;
		int distributedPen=penQuantity/students;
		int undistributedPen=penQuantity%students;
		System.out.printf("Then pen per student is %d and the remainder pen not distributed is %d",distributedPen,undistributedPen);
		
		

	}

}
