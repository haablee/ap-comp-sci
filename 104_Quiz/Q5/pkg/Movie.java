package pkg;

public class Movie{
    String movieName;
    double rating;
    int numRatings;
    int revenue;
    
    public Movie() {
        movieName = "Avengers";
        rating = 8.0;
        numRatings = 33;
        revenue = 623357910;
    }
    
    public Movie(String n, double r, int nr, int rev) {
        movieName = n;
        rating = r;
        numRatings = nr;
        revenue = rev;
    }
    
    public void movieToString() {
        System.out.println("Movie: " + movieName);
        System.out.println("Rating: " + rating);
        System.out.println("Number of Ratings: " + numRatings);
        System.out.println("Revenue: " + revenue);
    }
    
    public String getMovieName() {
        return movieName;
    }
    public int getRevenue() {
        return revenue;
    }
    
    public double addRating(double a) {
        double total = ((rating * numRatings) + a);
        numRatings = numRatings + 1;
        rating = total/numRatings;
        return rating;
    }
    
    public boolean compareRatings(Movie x) {
        return rating > x.rating;
    }
    
    
    
}
