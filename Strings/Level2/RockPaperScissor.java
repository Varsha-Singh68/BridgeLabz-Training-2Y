package Strings;
import java.util.*;

public class RockPaperScissor {
	 static String getComputerChoice() {
	        int choice = (int)(Math.random() * 3); 
	        if (choice == 0) return "Rock";
	        else if (choice == 1) return "Paper";
	        else return "Scissors";
	    }

	    static String findWinner(String user, String computer) {
	        if (user.equals(computer)) return "Draw";
	        if (user.equals("Rock") && computer.equals("Scissors")) return "User";
	        if (user.equals("Scissors") && computer.equals("Paper")) return "User";
	        if (user.equals("Paper") && computer.equals("Rock")) return "User";
	        return "Computer";
	    }

	    static String[][] calculateStats(String[] results) {
	        int userWins = 0, computerWins = 0, draws = 0;
	        for (String r : results) {
	            if (r.equals("User")) userWins++;
	            else if (r.equals("Computer")) computerWins++;
	            else draws++;
	        }
	        int totalGames = results.length;
	        double userPercent = (userWins * 100.0) / totalGames;
	        double computerPercent = (computerWins * 100.0) / totalGames;

	        String[][] stats = new String[5][2];
	        stats[0][0] = "Total Games"; stats[0][1] = String.valueOf(totalGames);
	        stats[1][0] = "User Wins"; stats[1][1] = String.valueOf(userWins);
	        stats[2][0] = "Computer Wins"; stats[2][1] = String.valueOf(computerWins);
	        stats[3][0] = "Draws"; stats[3][1] = String.valueOf(draws);
	        stats[4][0] = "Win %"; stats[4][1] = "User: " + String.format("%.2f", userPercent) + 
	                                       "%, Computer: " + String.format("%.2f", computerPercent) + "%";
	        return stats;
	    }

	    static void displayResults(String[] userChoices, String[] compChoices, String[] winners, String[][] stats) {
	        System.out.println("Game\tUser\tComputer\tWinner");
	        for (int i = 0; i < userChoices.length; i++) {
	            System.out.println((i+1) + "\t" + userChoices[i] + "\t" + compChoices[i] + "\t\t" + winners[i]);
	        }
	        System.out.println("\nStats:");
	        for (String[] row : stats) {
	            System.out.println(row[0] + "\t" + row[1]);
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of games: ");
	        int n = sc.nextInt();
	        sc.nextLine();
	        String[] userChoices = new String[n];
	        String[] compChoices = new String[n];
	        String[] winners = new String[n];

	        for (int i = 0; i < n; i++) {
	            System.out.print("Game " + (i+1) + " - Enter your choice (Rock/Paper/Scissors): ");
	            String user = sc.nextLine();
	            String computer = getComputerChoice();
	            String winner = findWinner(user, computer);
	            userChoices[i] = user;
	            compChoices[i] = computer;
	            winners[i] = winner;
	        }

	        String[][] stats = calculateStats(winners);
	        displayResults(userChoices, compChoices, winners, stats);

	
	}

}
