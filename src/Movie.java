import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

    public static Movie[] readData(Movie[] movies) {
        return movies;
    }

    public static List<Movie> readData(List<Movie> movies) {
        return movies;
    }

    // Used to write movieID, views, and rating to txt file
    //    ALL NAMES AND YEARS WILL BE LOST IF RAN AGAIN!
    /*    private static void writeMovies() throws FileNotFoundException {
        PrintWriter outputFile = new PrintWriter("src/movies.txt");

        outputFile.print("movieID views rating relYear title\n");
        for (int i = 1; i <= 100; i++) {
            outputFile.print(new Movie(i, ((int) (Math.random() * 1000) + 1),
                                       (Double.parseDouble(String.format("%.1f", (Math.random() * 9) + 1))), 0,
                                       "name"));
        }
        outputFile.close();
    }*/

    public static void main(String[] args) throws IOException {
        List<Movie> moviesList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("src/movies.txt"));
        String line = br.readLine();
        String[] columns = line.split(" | \" \" ");

        //        while ((br.readLine()) != null) {
        moviesList.add(
                new Movie(Integer.parseInt(columns[0]), Integer.parseInt(columns[1]), Double.parseDouble(columns[2]),
                          Integer.parseInt(columns[3]), columns[4]));
        //        }
        //        moviesList.add(new Movie(1, 89, 9.7, 1994, "The Shawshank Redemption")); // for testing
        //        moviesList.add(new Movie(2, 505, 1.4, 1972, "The Godfather")); // for testing
        System.out.println(readData(moviesList));

        // for testing
        /*
                Movie[] moviesArr = new Movie[2];
                moviesArr[0] = new Movie(3, 542, 9.8, 2008, "The Dark Knight");
                moviesArr[1] = new Movie(4, 140, 8.7, 1974, "The Godfather Part II");
                for (Movie m : moviesArr) {
                    System.out.println(m);
                }
        */
    }
}
