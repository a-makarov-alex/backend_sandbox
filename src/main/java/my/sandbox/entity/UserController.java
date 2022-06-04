package my.sandbox.entity;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private static final Logger userLogger = Logger.getLogger(UserController.class);

    @GetMapping("/greeting")
    public String getGreeting() {
        User user = new User("Aleksei", 30);
        return user.getHelloForUser();
    }
}
