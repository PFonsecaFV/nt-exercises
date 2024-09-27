package week03.cinetickets.repositories;

import week03.cinetickets.models.MovieModel;
import week03.cinetickets.models.enums.MovieRole;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public interface MovieRepository {
    List<MovieModel> moviesList = new ArrayList<>();

    public static void movieRegister(int movieId, String movieTitle, String movieGender, int ageRating, int movieDuration, double ticketValue, MovieRole movieRole) {
        MovieModel newMovie = new MovieModel();
        moviesList.add(newMovie);

        MovieModel var10;
        for (Iterator var9 = moviesList.iterator(); var9.hasNext(); var10 = (MovieModel) var9.next()) {
        }
    }

    static String getAllMovies() {
        String movies = "";
        int var10000;
        MovieModel list;
        if (moviesList.isEmpty()) {
            movies = null;
        } else {
            for (Iterator var1 = moviesList.iterator(); var1.hasNext(); movies =
                    "Id: " + var10000 +
                            "\n Título: " + list.getMovieTitle() +
                            "\n Gênero: " + list.getMovieGender() +
                            "\n Classificação Etária: " + list.getAgeRating() +
                            "\n Duração: " + list.getMovieDuration() +
                            "\n Valor do Ingresso: " + list.getTicketValue() +
                            "\n Tipo de Tecnologia: " + list.getMovieRole() +
                            "\n Poltrona Número: " + list.getSeatNumber()) {
                list = (MovieModel) var1.next();
                var10000 = list.getMovieId();
            }
        }

        return movies;
    }

    static boolean removeMovie(int id) {
        Iterator var1 = moviesList.iterator();

        MovieModel list;
        do {
            if (!var1.hasNext()) {
                return false;
            }

            list = (MovieModel) var1.next();
        } while (list.getMovieId() != id);

        moviesList.remove(list);
        return true;
    }
}
