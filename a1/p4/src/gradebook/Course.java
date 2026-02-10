package gradebook;

public class Course {

    private String name;
    private int credits;
    private String description;

    public Course(String name, int credits, String description) {
        this.name = name;
        this.credits = credits;
        this.description = description;
    }

    @Override
    public String toString() {
        return name + " (" + credits + " credits) - " + description;
    }
}
