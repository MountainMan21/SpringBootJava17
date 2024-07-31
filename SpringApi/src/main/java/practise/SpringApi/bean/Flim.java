package practise.SpringApi.bean;

public class Flim {
    private int id;
    private String name;
    private int release_year;
    private String director_name;

    public Flim(int id, String name, int release_year, String director_name) {
        this.id = id;
        this.name = name;
        this.release_year = release_year;
        this.director_name = director_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRelease_year() {
        return release_year;
    }

    public void setRelease_year(int release_year) {
        this.release_year = release_year;
    }

    public String getDirector_name() {
        return director_name;
    }

    public void setDirector_name(String director_name) {
        this.director_name = director_name;
    }
}





