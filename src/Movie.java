import java.io.FileNotFoundException;
import java.io.PrintWriter;
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


    private static void writeMovies() throws FileNotFoundException {
        PrintWriter outputFile = new PrintWriter("src/movies.txt");

        outputFile.print("movieID views rating relYear title\n");
        for (int i = 1; i <= 100; i++) {
            outputFile.print(new Movie(i, ((int) (Math.random() * 1000) + 1),
                                       (Double.parseDouble(String.format("%.1f", (Math.random() * 9) + 1))), 0,
                                       "name"));
        }
        outputFile.close();
    }

    public static void main(String[] args) {

    }
}

