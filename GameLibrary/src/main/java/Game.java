public class Game {
    String title;
    String platforms;
    boolean isDigital;
    String description;
    double rating;
    String location;

    // Constructor
    public Game(String title, String platforms, boolean isDigital, String description, double rating, String location) {
        this.title = title;
        this.platforms = platforms;
        this.isDigital = isDigital;
        this.description = description;
        this.rating = rating;
        this.location = location;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getPlatforms() {
        return platforms;
    }

    public boolean isDigital(boolean b) {
        return isDigital;
    }

    public String getDescription() {
        return description;
    }

    public double getRating() {
        return rating;
    }

    public String getRegion() {
        return location;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public void setDigital(boolean digital) {
        isDigital = digital;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setRegion(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        String outputText = "\n Game: " +
                "\n title='" + title + '\'' +
                ",\n platforms='" + platforms + '\'' +
                ",\n isDigital=" + isDigital +
                ",\n description='" + description + '\'' +
                ",\n rating=" + rating +
                ",\n location='" + location + '\'' +" ";;

        return outputText;
    }
}