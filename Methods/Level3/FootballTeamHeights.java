package Methods;
import java.util.Random;

public class FootballTeamHeights {

	public static void main(String[] args) {
		int[] heights = new int[11];
        Random rand = new Random();
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150;
        }

        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.print("Heights of players: ");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println();
        System.out.println("Sum of heights: " + sum + " cm");
        System.out.println("Mean height: " + mean + " cm");
        System.out.println("Shortest player: " + shortest + " cm");
        System.out.println("Tallest player: " + tallest + " cm");
    }

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int h : arr) {
            sum += h;
        }
        return sum;
    }

    public static double findMean(int[] arr) {
        return (double) findSum(arr) / arr.length;
    }

    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int h : arr) {
            if (h < min) {
                min = h;
            }
        }
        return min;
    }

    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int h : arr) {
            if (h > max) {
                max = h;
            }
        }
        return max;
    }
}
		

	