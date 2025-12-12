import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Movie movie = new Movie("Star Wars");
//        movie.watchMovie();
//
//        Movie adventure = new Adventure("Star Wars");
//        adventure.watchMovie();
//
//        Movie comedy = new Comedy("Star Wars");
//        comedy.watchMovie();
//
//        Movie scienceFiction = new ScienceFiction("Star Wars");
//        scienceFiction.watchMovie();
//
//        Movie theMovie = Movie.getMovie("Science Fiction", "Star Wars");
//        theMovie.watchMovie();

        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Type (A for Adventure, C for Comedy, S for Science Fiction, or Q for Quit): ");
            String type = s.nextLine();
            if ("Qq".contains(type)) {
                break;
            }
            System.out.println("Enter Movie Title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}
