package org.example;

import java.util.ArrayList;
import java.util.List;
public class CinemaApplicationRun {
    public static void main(String[] args) {
        List<Viewer> viewers = new ArrayList<>();
        viewers.add(new Viewer("User1", 25, 10));
        viewers.add(new Viewer("User2", 30, 8));
        viewers.add(new Viewer("User3", 20, 12));
        viewers.add(new Viewer("User4", 35, 6));
        viewers.add(new Viewer("User5", 28, 9));

        double averageAge = ViewerStatistics.averageAge(viewers);
        System.out.println("Average age of viewers: " + averageAge);
    }
}