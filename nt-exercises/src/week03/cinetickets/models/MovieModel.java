package week03.cinetickets.models;

import week03.cinetickets.models.enums.MovieAgeRatingEnum;
import week03.cinetickets.models.enums.MovieGenderEnum;
import week03.cinetickets.models.enums.MovieRole;

public class MovieModel {
    private int movieId;
    private String movieTitle;
    private MovieGenderEnum movieGender;
    private MovieAgeRatingEnum ageRating;
    private double movieDuration;
    private double ticketValue;
    private MovieRole movieRole;
    private int seatNumber;

    public MovieModel(int movieId, String movieTitle, MovieGenderEnum movieGender, MovieAgeRatingEnum ageRating, double movieDuration, double ticketValue, MovieRole movieRole, int seatNumber) {
        this.movieId = movieId;
        this.movieTitle = movieTitle;
        this.movieGender = movieGender;
        this.ageRating = ageRating;
        this.movieDuration = movieDuration;
        this.ticketValue = ticketValue;
        this.movieRole = movieRole;
        this.seatNumber = seatNumber;
    }

    public MovieModel() {
    }

    @Override
    public String toString() {
        return "Movie{" +
                "Id: " + movieId +
                "\n Título: " + movieTitle +
                "\n Gênero: " + movieGender +
                "\n Classificação Etária: " + ageRating +
                "\n Duração: " + movieDuration +
                "\n Valor do Ingresso: " + ticketValue +
                "\n Tipo de Tecnologia: " + movieRole +
                "\n Poltrona Número: " + seatNumber +
                '}';
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public MovieGenderEnum getMovieGender() {
        return movieGender;
    }

    public void setMovieGender(MovieGenderEnum movieGender) {
        this.movieGender = movieGender;
    }

    public MovieAgeRatingEnum getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(MovieAgeRatingEnum ageRating) {
        this.ageRating = ageRating;
    }

    public double getMovieDuration() {
        return movieDuration;
    }

    public void setMovieDuration(double movieDuration) {
        this.movieDuration = movieDuration;
    }

    public double getTicketValue() {
        return ticketValue;
    }

    public void setTicketValue(double ticketValue) {
        this.ticketValue = ticketValue;
    }

    public MovieRole getMovieRole() {
        return movieRole;
    }

    public void setMovieRole(MovieRole movieRole) {
        this.movieRole = movieRole;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
}
