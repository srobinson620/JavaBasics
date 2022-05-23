package com.sparta.sr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    @DisplayName("check that 5==5")
    void simpleTest(){
        Assertions.assertEquals(true,5==5);
    }
    @Test
    @DisplayName("check that we return Good Morning")
    void checkWeCanWriteGoodMorning(){
        Assertions.assertEquals("Good Morning!",App.greeting(6));
    }
    @Test
    @DisplayName("check that we return Good Afternoon")
    void checkWeCanWriteGoodAfternoon(){
        Assertions.assertEquals("Good Afternoon!",App.greeting(15));
    }
    @Test
    @DisplayName("check that we return Good Evening")
    void checkWeCanWriteGoodEvening(){
        Assertions.assertEquals("Good Evening!",App.greeting(20));
    }
    @Test
    @DisplayName("check that we return Good Night")
    void checkWeCanWriteGoodNight(){
        Assertions.assertEquals("Good Night!",App.greeting(2));
    }

}
