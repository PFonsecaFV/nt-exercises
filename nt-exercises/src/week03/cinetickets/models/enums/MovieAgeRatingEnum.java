package week03.cinetickets.models.enums;

public enum MovieAgeRatingEnum {
    AL(0),
    A10(10),
    A12(12),
    A14(14),
    A16(16),
    A18(18);

    int movieAgeRating;

    MovieAgeRatingEnum(int movieAgeRating) {
        this.movieAgeRating = movieAgeRating;
    }

    public static MovieAgeRatingEnum movieAgeRatingSelect(int movieAgeRating) {
        MovieAgeRatingEnum[] var1 = values();
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            MovieAgeRatingEnum movie = var1[var3];
            if (movie.getMovieAgeRating() == movieAgeRating) {
                return movie;
            }
        }

        return null;
    }

    public int getMovieAgeRating() {
        return movieAgeRating;
    }

    public void setMovieAgeRating(int movieAgeRating) {
        this.movieAgeRating = movieAgeRating;
    }
}
