package wrapper_class;

public class StudentMarksReport {
    public static void main(String[] args) {
        Object[] marks = {"85", 95, Integer.valueOf(88), "null", "abc", 76};

        int sum = 0;
        int count = 0;

        for (Object m : marks) {
            Integer mark = convertToInteger(m);
            if (mark != null) {
                sum += mark;
                count++;
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average Marks: " + average);
        } else {
            System.out.println("No valid marks available.");
        }
    }

    public static Integer convertToInteger(Object input) {
        if (input == null) return null;

        if (input instanceof Integer) {
            return (Integer) input;
        } else if (input instanceof String) {
            String str = (String) input;
            if (str.equalsIgnoreCase("null")) return null;
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException e) {
                return null;
            }
        } else {
            return null;
        }
    }
}

