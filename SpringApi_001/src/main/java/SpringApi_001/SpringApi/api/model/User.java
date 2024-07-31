package SpringApi_001.SpringApi.api.model;




public class User {

    private String movie_name ;
    private int movie_year;
    private String movie_director;
    private String id;






   public User(String ser) {
       this.movie_director = movie_director;
        this.movie_year = movie_year;
        this.movie_name = movie_name;
        this.id = id;
    }



    public String getMovie_director() {
        return movie_director;
    }

    public void setMovie_director(String movie_director) {
        this.movie_director = movie_director;
    }

    public int getMovie_year() {
        return movie_year;
    }

    public void setMovie_year(int movie_year) {
        this.movie_year = movie_year;
    }


    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
