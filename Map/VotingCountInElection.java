package map;

import java.util.*;

public class VotingCountInElection {
    public static void main(String[] args) {

        Map<String, Integer> votes = new HashMap<>();

        String[] castVotes = {
            "Aman", "Riya", "Karan", "Aman", "Riya",
            "Aman", "Karan", "Riya", "Aman", "Riya"
        };

        for (String candidate : castVotes) {
            votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
        }

        String winner = "";
        int maxVotes = 0;

        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            if (entry.getValue() > maxVotes) {
                winner = entry.getKey();
                maxVotes = entry.getValue();
            }
        }

        System.out.println("Total Votes:");
        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        System.out.println("\nWinner: " + winner + " with " + maxVotes + " votes");
    }
}

