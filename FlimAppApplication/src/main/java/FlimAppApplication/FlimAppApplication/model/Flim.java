package FlimAppApplication.FlimAppApplication.model;



public class Flim {


    private String name;
    private String description;
    private int year;

    public Flim() {}

    public Flim(String name, String description, int year) {
        this.name = name;
        this.description = description;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

