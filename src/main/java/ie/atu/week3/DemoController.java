package ie.atu.week3;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DemoController {
    @PostMapping("registerUserBody")
    @ResponseStatus(HttpStatus.CREATED)
    public User registerUserCredential(@RequestBody User user){
        System.out.println("User ID: "+user.getName());
        System.out.println("User ID: "+user.getEmail());
        return user;
    }
}
