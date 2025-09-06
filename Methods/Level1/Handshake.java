package Methods;
import java.util.*;

public class Handshake {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of students=");
        int numberOfStudents=sc.nextInt();

        int handshakes = calculateHandshake(numberOfStudents);
        System.out.println("The maximum no. of possible handshakes="+handshakes);
    }

    public static int calculateHandshake(int n){
        return (n*(n-1))/2;
		
		

	}

}
