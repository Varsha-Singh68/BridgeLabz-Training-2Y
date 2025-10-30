package wrapper_class;

public class ConvertWrapperToPrimitive {
	public static void main(String[] args) {
	
	Double obj = 45.67; 
	double d = obj;  
    int i = (int) obj.doubleValue(); 
    System.out.println("Wrapper Object (Double): " + obj);
    System.out.println("Primitive double: " + d);
    System.out.println("Primitive int (after casting): " + i);

}
}

