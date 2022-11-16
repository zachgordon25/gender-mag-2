import java.io.*;
import java.util.*;

public class Movie {
    static File file = new File("src/movies.txt");

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

    public static void readData(Movie[] movies) throws FileNotFoundException {
        Scanner input = new Scanner(file);

        int i = 0;
        while (input.hasNext()) {
            int movieID = input.nextInt();
            int views = input.nextInt();
            double rating = input.nextDouble();
            int relYear = input.nextInt();
            String title = input.nextLine();
            movies[i] = new Movie(movieID, views, rating, relYear, title);
            i++;
        }
        input.close();
    }

    public static void readData(List<Movie> movies) throws FileNotFoundException {
        Scanner input = new Scanner(file);

        while (input.hasNext()) {
            int movieID = input.nextInt();
            int views = input.nextInt();
            double rating = input.nextDouble();
            int relYear = input.nextInt();
            String title = input.nextLine();

            movies.add(new Movie(movieID, views, rating, relYear, title));
        }
        input.close();
    }

    public static void search(Movie[] movies, double rating) {
        for (Movie movie : movies) {
            if (movie.getRating() == rating) {
                System.out.println(movie);
            }
        }
    }

    public static void search(List<Movie> movies, int year, double rating) {
        for (Movie movie : movies) {
            if (movie.getRelYear() == year && movie.getRating() == rating) {
                System.out.println(movie);
            }
        }
    }

    public static void compareMovies(Movie[] movies) {
        Arrays.sort(movies, Comparator.comparing(Movie::getRating));
        for (Movie m : movies) {
            System.out.println(m);
        }
    }

    public static void compareMovies(List<Movie> movies) {
        movies.sort(Comparator.comparing(Movie::getRelYear).thenComparing(Movie::getRating));
        movies.forEach(System.out::println);
    }

    public static void main(String[] args) throws FileNotFoundException {
        Movie[] moviesArr = new Movie[100];
        readData(moviesArr);
        search(moviesArr, 1.2);
        compareMovies(moviesArr);

        List<Movie> moviesList = new ArrayList<>();
        readData(moviesList);
        search(moviesList, 1985, 9.7);
        compareMovies(moviesList);

        System.out.println("-----Part2-----");
        //creates heap
        MyHeap moList= new MyHeap();
        for(int i=0; i<20; i++) {
            moList.addMovie(i);
        }
        System.out.println("Arraylist "+moList.size());
        moList.removeMovie(5);
        moList.removeMovie(10);
        moList.removeMovie(15);

        for(int i=0; i < 8;i++){
            moList.heapSort(i);
        }
        moList.pushMovie();
    }
}

