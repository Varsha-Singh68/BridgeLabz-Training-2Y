package control_flow;
import java.util.*;

public class YoungestFriends {

	public static void main(String[] args) {
		int ageAmar,ageAkbar,ageAnthony;
		double heightAmar,heightAkbar,heightAnthony;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Amar's age: ");
        ageAmar=sc.nextInt();
        System.out.print("Enter Akbar's age: ");
        ageAkbar=sc.nextInt();
        System.out.print("Enter Anthony's age: ");
        ageAnthony=sc.nextInt();
        System.out.print("Enter Amar's height: ");
        heightAmar=sc.nextDouble();
        System.out.print("Enter Akbar's height: ");
        heightAkbar=sc.nextDouble();
        System.out.print("Enter Anthony's height: ");
        heightAnthony=sc.nextDouble();
        if(ageAmar<ageAkbar && ageAmar<ageAnthony)
            System.out.printf("youngest friend is Amar ,age : %d%n",ageAmar);
        else if(ageAkbar<ageAmar && ageAkbar<ageAnthony)
            System.out.printf("youngest friend is Akbar ,age : %d%n",ageAkbar);
        else
            System.out.printf("youngest friend is Anthony ,age : %d%n",ageAnthony);
        if(heightAmar>heightAkbar && heightAmar>heightAnthony)
            System.out.printf("tallest friend is Amar ,height : %.2f%n",heightAmar);
        else if(heightAkbar>heightAmar && heightAkbar>heightAnthony)
            System.out.printf("tallest friend is Akbar ,height : %.2f%n",heightAkbar);
        else
            System.out.printf("tallest friend is Anthony ,height : %.2f%n",heightAnthony);
        

	}

}

