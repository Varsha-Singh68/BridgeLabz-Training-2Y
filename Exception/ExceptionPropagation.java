package exception_handling;

public class ExceptionPropagation {

    
    public void methodB(String value) {
        try {
            
            int num = Integer.parseInt(value);
            System.out.println("Converted number: " + num);

           
            String str = null;
            System.out.println(str.length()); 

        } catch (NumberFormatException e) {
            System.out.println("Caught in methodB: Invalid number format.");
        }
        
    }

    
    public void methodA(String value) {
        try {
            methodB(value);
        } catch (NullPointerException e) {
            System.out.println("Caught in methodA: Null value encountered.");
        } catch (Exception e) {
            System.out.println("Caught in methodA: Some other exception occurred.");
        }
    }

    public static void main(String[] args) {
        ExceptionPropagation demo = new ExceptionPropagation();

        System.out.println("Case 1: Invalid number format");
        demo.methodA("abc");  
        System.out.println("\nCase 2: NullPointerException propagation");
        demo.methodA("123");  
    }
}

