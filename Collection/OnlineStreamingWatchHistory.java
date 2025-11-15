package collection;

import java.util.*;

class Movie {
    String name;
    String genre;

    Movie(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    public String toString() {
        return name + " (" + genre + ")";
    }
}

public class OnlineStreamingWatchHistory {
    public static void main(String[] args) {

        List<Movie> allMovies = Arrays.asList(
                new Movie("Inception", "Sci-Fi"),
                new Movie("Interstellar", "Sci-Fi"),
                new Movie("3 Idiots", "Comedy"),
                new Movie("Dangal", "Sports"),
                new Movie("Hera Pheri", "Comedy"),
                new Movie("Gravity", "Sci-Fi"),
                new Movie("Sultan", "Sports")
        );

        Stack<Movie> watchHistory = new Stack<>();
        Set<String> watchedGenres = new HashSet<>();
        Queue<Movie> upNext = new LinkedList<>();

        upNext.add(new Movie("Inception", "Sci-Fi"));
        upNext.add(new Movie("3 Idiots", "Comedy"));
        upNext.add(new Movie("Dangal", "Sports"));

        while (!upNext.isEmpty()) {
            Movie current = upNext.poll();
            watchHistory.push(current);
            watchedGenres.add(current.genre);
        }

        System.out.println("Watch History:");
        for (Movie m : watchHistory) System.out.println(m);

        System.out.println("\nGenres Watched: " + watchedGenres);

        System.out.println("\nRecommended Movies:");
        for (Movie m : allMovies) {
            if (watchedGenres.contains(m.genre) && !watchHistory.contains(m))
                System.out.println(m);
        }
    }
}

