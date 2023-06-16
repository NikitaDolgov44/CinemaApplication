package org.example;

import java.util.ArrayList;
import java.util.List;
public class CinemaApplicationRun {
    public static void main(String[] args) {
        List<Viewer> viewers = new ArrayList<>();
        viewers.add(new Viewer("User1", 25));
        viewers.add(new Viewer("User2", 30));
        viewers.add(new Viewer("User3", 20));
        viewers.add(new Viewer("User4", 35));
        viewers.add(new Viewer("User5", 28));

        Cinema movie1 = new Cinema("Movie 1", "Genre 1", 120);
        Cinema movie2 = new Cinema("Movie 2", "Genre 2", 90);
        Cinema movie3 = new Cinema("Movie 3", "Genre 3", 105);
        Cinema movie4 = new Cinema("Movie 4", "Genre 1", 135);
        Cinema movie5 = new Cinema("Movie 5", "Genre 2", 100);

        viewers.get(0).addWatchedMovie(movie1);
        viewers.get(0).addWatchedMovie(movie2);
        viewers.get(1).addWatchedMovie(movie1);
        viewers.get(1).addWatchedMovie(movie3);
        viewers.get(2).addWatchedMovie(movie2);
        viewers.get(2).addWatchedMovie(movie4);
        viewers.get(3).addWatchedMovie(movie3);
        viewers.get(3).addWatchedMovie(movie5);
        viewers.get(4).addWatchedMovie(movie1);
        viewers.get(4).addWatchedMovie(movie2);
        viewers.get(4).addWatchedMovie(movie3);

        double averageAge = ViewerStatistics.averageAge(viewers);
        System.out.println("Average age of viewers: " + averageAge);
    }
}