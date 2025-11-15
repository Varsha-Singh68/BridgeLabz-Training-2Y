package collection;

import java.util.*;

class Team implements Comparable<Team> {
    String name;
    int points;

    Team(String name) {
        this.name = name;
        this.points = 0;
    }

    public int compareTo(Team other) {
        return other.points - this.points;
    }

    public String toString() {
        return name + " | Points: " + points;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Team)) return false;
        Team t = (Team) o;
        return this.name.equals(t.name);
    }

    public int hashCode() {
        return name.hashCode();
    }
}

class Matchi {
    Team teamA;
    Team teamB;

    Matchi(Team a, Team b) {
        this.teamA = a;
        this.teamB = b;
    }

    public String toString() {
        return teamA.name + " vs " + teamB.name;
    }
}

class Resulti {
    Team winner;
    Team loser;

    Resulti(Team w, Team l) {
        this.winner = w;
        this.loser = l;
    }

    public String toString() {
        return winner.name + " defeated " + loser.name;
    }
}

public class SportsTournamentScheduler {
    public static void main(String[] args) {

        Set<Team> teams = new HashSet<>();
        Queue<Matchi> matchQueue = new LinkedList<>();
        List<Resulti> resultList = new ArrayList<>();
        TreeSet<Team> leaderboard = new TreeSet<>();

        Team t1 = new Team("Lions");
        Team t2 = new Team("Tigers");
        Team t3 = new Team("Eagles");
        Team t4 = new Team("Sharks");

        teams.add(t1);
        teams.add(t2);
        teams.add(t3);
        teams.add(t4);

        matchQueue.add(new Matchi(t1, t2));
        matchQueue.add(new Matchi(t3, t4));
        matchQueue.add(new Matchi(t1, t3));
        matchQueue.add(new Matchi(t2, t4));

        Random rand = new Random();

        while (!matchQueue.isEmpty()) {
            Matchi match = matchQueue.poll();
            Team winner = rand.nextBoolean() ? match.teamA : match.teamB;
            Team loser = (winner == match.teamA) ? match.teamB : match.teamA;
            winner.points += 3;
            resultList.add(new Resulti(winner, loser));
        }

        leaderboard.addAll(teams);

        System.out.println("Match Results:");
        for (Resulti r : resultList) System.out.println(r);

        System.out.println("\nLeaderboard:");
        for (Team t : leaderboard) System.out.println(t);
    }
}

