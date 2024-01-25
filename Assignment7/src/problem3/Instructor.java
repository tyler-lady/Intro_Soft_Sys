package problem3;

public class Instructor implements Performance {

    final String name;
    String rating;

    public Instructor(String name, String rating){
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public double getPerformance() {
        return switch (getRating()) {
            case "Excellent" -> 5.0;
            case "Good" -> 4.0;
            case "Average" -> 3.0;
            case "Bad" -> 2.0;
            case "Worst" -> 1.0;
            default -> 0;
        };
    }
}
