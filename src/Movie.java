import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Movie {
    private int movieID;
    private int views;
    private double rating;
    private int relYear;
    private String title;

    public Movie() {
    }

    public Movie(int movieID, int views, double rating, int relYear, String title) {
        this.movieID = movieID;
        this.views = views;
        this.rating = rating;
        this.relYear = relYear;
        this.title = title;
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getRelYear() {
        return relYear;
    }

    public void setRelYear(int relYear) {
        this.relYear = relYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return movieID + " " + views + " " + rating + " " + relYear + " " + title + '\n';
    }

    public static Movie[] readData(Movie[] movies) throws FileNotFoundException {
        java.io.File file = new java.io.File("src/movies.txt");

        Scanner input = new Scanner(file);

        int i = 0;
        while (input.hasNext()) {
            int movieID = input.nextInt();
            int views = input.nextInt();
            double rating = input.nextDouble();
            int relYear = input.nextInt();
            String title = input.nextLine();
            //  System.out.println(movieID + " " + views + " " + rating + " " + relYear + " " + title + " ");
            movies[i] = new Movie(movieID, views, rating, relYear, title);
            i++;
        }
        input.close();
        return movies;
    }

    public static List<Movie> readData(List<Movie> movies) throws FileNotFoundException {
        java.io.File file = new java.io.File("src/movies.txt");

        Scanner input = new Scanner(file);

        int i = 0;
        while (input.hasNext()) {
            int movieID = input.nextInt();
            int views = input.nextInt();
            double rating = input.nextDouble();
            int relYear = input.nextInt();
            String title = input.nextLine();
            //  System.out.println(movieID + " " + views + " " + rating + " " + relYear + " " + title + " ");
            movies.add(new Movie(movieID, views, rating, relYear, title));
            i++;
        }
        input.close();
        return movies;
    }


    public static void main(String[] args) throws FileNotFoundException {
        Movie[] moviesArr = new Movie[100];
        readData(moviesArr);
        //        for (Movie m : moviesArr) {
        //            System.out.print(m);
        //        }

        List<Movie> moviesList = new ArrayList<>();
        readData(moviesList);
        System.out.println(moviesList);
    }
}
