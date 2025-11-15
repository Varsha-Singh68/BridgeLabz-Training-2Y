package collection;

import java.util.*;


class Player {
 int id;
 String name;

 Player(int id, String name) {
     this.id = id;
     this.name = name;
 }

 
 @Override
 public boolean equals(Object o) {
     if (this == o) return true;
     Player p = (Player) o;
     return this.id == p.id;
 }

 @Override
 public int hashCode() {
     return Objects.hash(id);
 }

 @Override
 public String toString() {
     return name + "(ID:" + id + ")";
 }
}


class Match {
 Player p1;
 Player p2;

 Match(Player p1, Player p2) {
     this.p1 = p1;
     this.p2 = p2;
 }

 @Override
 public String toString() {
     return p1.name + " vs " + p2.name;
 }
}


class Result {
 Player winner;
 Player loser;
 int score;

 Result(Player winner, Player loser, int score) {
     this.winner = winner;
     this.loser = loser;
     this.score = score;
 }

 @Override
 public String toString() {
     return winner.name + " defeated " + loser.name + " | Score: " + score;
 }
}

class Score implements Comparable<Score> {
 Player player;
 int points;

 Score(Player player, int points) {
     this.player = player;
     this.points = points;
 }

 
 @Override
 public int compareTo(Score s) {
     return Integer.compare(s.points, this.points);
 }

 @Override
 public String toString() {
     return player.name + " → " + points + " pts";
 }
}


public class OnlineGamingTournamentTracker {
 public static void main(String[] args) {

     
     Set<Player> players = new HashSet<>();

     Player p1 = new Player(1, "Amit");
     Player p2 = new Player(2, "Varun");
     Player p3 = new Player(3, "Neha");
     Player p4 = new Player(4, "Riya");

     players.add(p1);
     players.add(p2);
     players.add(p3);
     players.add(p4);

     System.out.println("Registered Players:");
     players.forEach(System.out::println);

     System.out.println("----------------------------------");

     
     Queue<Match> matchQueue = new LinkedList<>();
     matchQueue.add(new Match(p1, p2));
     matchQueue.add(new Match(p3, p4));
     matchQueue.add(new Match(p1, p3));

     System.out.println("Match Queue:");
     matchQueue.forEach(System.out::println);

     System.out.println("----------------------------------");

    
     List<Result> results = new ArrayList<>();
     Map<Player, Integer> scoreMap = new HashMap<>();  // store points per player

     while (!matchQueue.isEmpty()) {
         Match m = matchQueue.poll();
         System.out.println("Processing Match: " + m);

         
         Player winner = Math.random() > 0.5 ? m.p1 : m.p2;
         Player loser = (winner == m.p1) ? m.p2 : m.p1;

         int points = (int) (Math.random() * 20) + 1; // random score 1–20

         results.add(new Result(winner, loser, points));

         
         scoreMap.put(winner, scoreMap.getOrDefault(winner, 0) + points);

         System.out.println("Winner: " + winner.name + " (+" + points + " pts)");
     }

     System.out.println("----------------------------------");

     
     TreeSet<Score> leaderboard = new TreeSet<>();

     for (Player p : players) {
         leaderboard.add(new Score(p, scoreMap.getOrDefault(p, 0)));
     }

     
     System.out.println("Match Results:");
     results.forEach(System.out::println);

     System.out.println("----------------------------------");

     
     System.out.println("LIVE LEADERBOARD (Highest First):");
     leaderboard.forEach(System.out::println);
 }
}

