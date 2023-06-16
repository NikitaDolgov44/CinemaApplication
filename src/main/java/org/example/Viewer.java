package org.example;

import java.util.ArrayList;
import java.util.List;
class Viewer {
    private String nickname;
    private int age;
    private List<Cinema> watchedMovies;

    public Viewer(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
        this.watchedMovies = new ArrayList<>();
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public void addWatchedMovie(Cinema movie) {
        watchedMovies.add(movie);
    }

    public int getMoviesWatched() {
        return watchedMovies.size();
    }
}