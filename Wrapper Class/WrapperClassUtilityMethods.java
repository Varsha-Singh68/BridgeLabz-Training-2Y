package wrapper_class;

public class WrapperClassUtilityMethods {

	public static void main(String[] args) {
		
		int num = Integer.parseInt("123");
        System.out.println("Integer.parseInt(\"123\") = " + num);

        double d = Double.parseDouble("3.14");
        System.out.println("Double.parseDouble(\"3.14\") = " + d);

        boolean b = Boolean.parseBoolean("true");
        System.out.println("Boolean.parseBoolean(\"true\") = " + b);

        String binary = Integer.toBinaryString(10);
        System.out.println("Integer.toBinaryString(10) = " + binary);

        boolean isDigit = Character.isDigit('5');
        System.out.println("Character.isDigit('5') = " + isDigit);

        char upper = Character.toUpperCase('a');
        System.out.println("Character.toUpperCase('a') = " + upper);

	}

}
