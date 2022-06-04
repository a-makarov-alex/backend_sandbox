package my.sandbox.entity;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {
    private static final Logger userLogger = Logger.getLogger(UserTest.class);

    @Test
    public void userTest() {
        userLogger.info("--- test started ---");
        String name = "Aleksei";
        User user = new User(name, 30);
        String result = user.getHelloForUser();
        userLogger.info("result string: " + result);
        Assertions.assertEquals("Hello, Aleksei!", result, "incorrect greeting!");
    }
}
