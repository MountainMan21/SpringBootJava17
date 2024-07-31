package SpringApi_001.SpringApi.api.controller;

import SpringApi_001.SpringApi.api.model.User;
import SpringApi_001.SpringApi.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    @GetMapping("/user")
    public User getUser(@RequestParam Integer id){

        Optional<User> user = userService.getuser(id);
        if(user.isPresent()) {
            return (User) user.get();
        }

        return null;
    }

}
