package objectarray;
import java.util.Arrays;
import java.util.Comparator;
public class Movie {
    private int yearReleased;
    private double rating;
    private double budget;
    private double collectionAmount;

    public Movie(int yearReleased, double rating, double budget, double collectionAmount) {
        this.yearReleased = yearReleased;
        this.rating = rating;
        this.budget = budget;
        this.collectionAmount = collectionAmount;
    }
    public static class RatingProfitComparator implements Comparator<Movie> {
        @Override
        public int compare(Movie movie1, Movie movie2) {
            if (movie1.rating != movie2.rating) {
                // Sort by rating in descending order
                return Double.compare(movie2.rating, movie1.rating);
            } else {
                return Double.compare(movie2.collectionAmount - movie2.budget, movie1.collectionAmount - movie1.budget);
            }
        }
    }
    public static class YearRatingComparator implements Comparator<Movie> {
        @Override
        public int compare(Movie movie1, Movie movie2) {
            if (movie1.yearReleased != movie2.yearReleased) {
                // Sort by year released in ascending order
                return Integer.compare(movie1.yearReleased, movie2.yearReleased);
            } else {
                // If years are equal, sort by rating in descending order
                return Double.compare(movie2.rating, movie1.rating);
            }
        }
    }

    public static void main(String[] args) {
        // Create an array of movies
        Movie[] movies = {
                new Movie(2020, 8.5, 100000000, 200000000),
                new Movie(2022, 7.8, 80000000, 150000000),

        };
        Arrays.sort(movies, new RatingProfitComparator());
        System.out.println("Sorted by rating and profit:");
        for (Movie movie : movies) {
            System.out.println(movie.yearReleased + " - Rating: " + movie.rating + " - Profit: " +
                    (movie.collectionAmount - movie.budget));
        }

        Arrays.sort(movies, new YearRatingComparator());
        System.out.println("\nSorted by year released and rating:");
        for (Movie movie : movies) {
            System.out.println(movie.yearReleased + " - Rating: " + movie.rating);
        }
    }
}