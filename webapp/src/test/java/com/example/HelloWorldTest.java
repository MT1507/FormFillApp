package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelloWorldTest {
    @Test
    public void testGreet() {
        HelloWorld hw = new HelloWorld();
        assertEquals("Hello, Mangesh", hw.greet("Mangesh"));
    }
}



