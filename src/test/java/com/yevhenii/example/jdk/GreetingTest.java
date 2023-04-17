package com.yevhenii.example.jdk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingTest {
    @Test
    void greeting() {
        assertEquals("Hello!", new Greeting().get());
    }
}
