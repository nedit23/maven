package com.example.vvce.candidate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    App app=new App();
    @Test
    void testadd()
    {
    	assertEquals(25,app.add(20, 5));
    }
    public void testSubtract() {
        assertEquals(15,app.sub(20,5));
    }
}
