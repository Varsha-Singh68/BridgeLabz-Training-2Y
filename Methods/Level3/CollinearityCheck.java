package Methods;

import java.util.Scanner;

class CollinearityChecker {

    public static boolean checkBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        int slopeAB_num = (y2 - y1) * (x3 - x2);
        int slopeBC_num = (y3 - y2) * (x2 - x1);
        int slopeAC_num = (y3 - y1) * (x2 - x1);

        return slopeAB_num == slopeBC_num;
    }

    public static boolean checkByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        return area == 0;
    }
}

public class CollinearityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1 and y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Enter x2 and y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.print("Enter x3 and y3: ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        boolean slopeCheck = CollinearityChecker.checkBySlope(x1, y1, x2, y2, x3, y3);
        boolean areaCheck = CollinearityChecker.checkByArea(x1, y1, x2, y2, x3, y3);

        System.out.println("Collinear by Slope Method? " + slopeCheck);
        System.out.println("Collinear by Area Method? " + areaCheck);

        sc.close();
    }
}
