package week03.cinetickets.models.enums;

public enum MovieRole {
    D2MOVIE("1 - FILME 2D"),
    D3MOVIE("2 - FILME 3D");

    String movieTechnology;

    MovieRole(String movieTechnology) {
        this.movieTechnology = movieTechnology;
    }

    public static MovieRole movieTechnologySelect(String movieTechnology) {
        MovieRole[] var1 = values();
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            MovieRole movie = var1[var3];
            if (movie.getMovieTechnology().equals(movieTechnology)) {
                return movie;
            }
        }

        return null;
    }

    public String getMovieTechnology() {
        return movieTechnology;
    }

    public void setMovieTechnology(String movieTechnology) {
        this.movieTechnology = movieTechnology;
    }
}
