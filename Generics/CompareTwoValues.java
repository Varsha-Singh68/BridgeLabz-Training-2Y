package generic;

class CompareUtil {
    public static <T> boolean isEqual(T a, T b) {
        return a.equals(b);
    }
}

public class CompareTwoValues {
    public static void main(String[] args) {
        System.out.println(CompareUtil.isEqual(10, 10));
        System.out.println(CompareUtil.isEqual("Hello", "Hello"));
        System.out.println(CompareUtil.isEqual(5.5, 4.4));
    }
}

