package Methods;
import java.util.*;

public class SpringSeason {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter month (1-12)=");
        int month=sc.nextInt();
        System.out.print("Enter day=");
        int day=sc.nextInt();
        if(isSpringSeason(month,day))
            System.out.println("Its a Spring Season");
        else
            System.out.println("Not a Spring Season");
        
    }

    public static boolean isSpringSeason(int month,int day){
        if(month==3 && day>=20 && day<=31) 
            return true;
        else if(month==4 && day>=1 && day<=30) 
            return true;
        else if(month==5 && day>=1 && day<=31) 
            return true;
        else if(month==6 && day>=1 && day<=20) 
            return true;
        
        return false;

	}

}
