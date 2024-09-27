package week03.cinetickets.models.enums;

public enum MovieGenderEnum {
    ACTION("1 - AÇÃ0"),
    ADVENTURE("2 - AVENTURA"),
    HORROR("3 - TERROR"),
    ANIMATION("4 - ANIMAÇÃO"),
    COMEDY("4 - COMÉDIA"),
    DRAMA("6 - DRAMA"),
    SCIFI("7 - FICÇÃO");

    String movieGender;

    MovieGenderEnum(String movieGender) {
        this.movieGender = movieGender;
    }

    public static MovieGenderEnum movieGenderSelect(String movieGender) {
        MovieGenderEnum[] var1 = values();
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            MovieGenderEnum movie = var1[var3];
            if (movie.getMovieGender().equals(movieGender)) {
                return movie;
            }
        }

        return null;
    }

    public String getMovieGender() {
        return movieGender;
    }

    public void setMovieGender(String movieGender) {
        this.movieGender = movieGender;
    }
}
