package collection;

import java.util.*;

public class CustomerFeedbackAnalysis {
    public static void main(String[] args) {

        List<String> allFeedback = Arrays.asList(
                "Great service!",
                "Improve delivery time.",
                "Great service!",
                "Loved the packaging.",
                "Support team is helpful.",
                "Improve delivery time."
        );

        Set<String> uniqueFeedback = new HashSet<>();
        Queue<String> feedbackQueue = new LinkedList<>();
        Stack<String> recentFeedback = new Stack<>();

        for (String f : allFeedback) {
            if (uniqueFeedback.add(f)) feedbackQueue.add(f);
        }

        while (!feedbackQueue.isEmpty()) {
            String feedback = feedbackQueue.poll();
            recentFeedback.push(feedback);
        }

        System.out.println("Unique Feedback Processed:");
        for (String f : recentFeedback) System.out.println(f);

        System.out.println("\nMost Recent Feedbacks:");
        int count = 0;
        while (!recentFeedback.isEmpty() && count < 3) {
            System.out.println(recentFeedback.pop());
            count++;
        }
    }
}

