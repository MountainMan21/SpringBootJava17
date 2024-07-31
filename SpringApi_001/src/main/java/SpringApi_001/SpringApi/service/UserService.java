package SpringApi_001.SpringApi.service;

import SpringApi_001.SpringApi.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


@Service
public class UserService {

    private  List<User> userlist;


    public  User UserService(){

        userlist = new ArrayList<>();




        User user1 = new User(1,"unnk","drctvb",2022);


       // User user2 = new User( id:1 ,movie_name: "Django", movie_year: 2012, movie_director:"Steve");
       // User user3 = new User( id:1 ,movie_name: "Django", movie_year: 2012, movie_director:"Steve");
       // User user4 = new User( id:1 ,movie_name: "Django", movie_year: 2012, movie_director:"Steve");
        //User user5 = new User( id:1 ,movie_name: "Django", movie_year: 2012, movie_director:"Steve");


        userlist.addAll(Arrays.asList(user1,user2,user3,user4,user5));
    }



    public Optional<User> getuser(Integer id) {
        Optional optional = Optional.empty();
        for (User user : userlist){
            if(id == user.getId()){
                optional = Optional.of(user);
                return optional;

            }
        }
        return optional;
    }
}
