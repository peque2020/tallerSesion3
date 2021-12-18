package basicJunit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BasicJunit {
    @BeforeEach
    public void before(){
        System.out.println("Before");
    }

    @AfterEach
    public void after(){
        System.out.println("After");
    }

    @Test
    public void verifyMyApp(){
        System.out.println("Test");
    }

}
