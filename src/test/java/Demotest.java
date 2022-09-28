import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

public class Demotest {
    @BeforeAll
    static void  setup(){
        System.out.println( "### @BeforeAll !");
    }
    @Test
    void simpleTestFirst() {
        Assertions.assertTrue(3 > 2);
    }

    @Test
    void simpleTestSecond() {

        Assertions.assertTrue(3 > 2);
    }
}