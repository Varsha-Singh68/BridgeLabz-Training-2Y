package generic;

import java.util.*;

class ListUtil {
    public static void copyList(List<? super Number> dest, List<? extends Number> src) {
        for (Number n : src) {
            dest.add(n);
        }
    }
}

public class CopyListElements {
    public static void main(String[] args) {
        List<Number> dest = new ArrayList<>();
        List<Integer> src = Arrays.asList(10, 20, 30);

        ListUtil.copyList(dest, src);

        System.out.println(dest);
    }
}

