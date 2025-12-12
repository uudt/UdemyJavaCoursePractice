public class NextMain {

    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();

        Object o = Movie.getMovie("S", "Stars");
        if (o.getClass().getSimpleName() == "Comedy") {
            Comedy c = (Comedy) o;
            c.watchComedy();
        } else if (o instanceof Adventure) {
            Adventure a = (Adventure) o;
            a.watchAdventure();
        } else if (o instanceof ScienceFiction sf) {
            ScienceFiction s = (ScienceFiction) o;
            sf.watchScienceFiction();
        }

    }

}
