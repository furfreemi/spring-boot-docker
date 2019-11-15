package com.springboot.controller;

import com.springboot.controller.HelloWorldController;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class HelloWorldControllerTest {

    @Test
    void shouldGetAllInStockItems() {
        HelloWorldController helloWorldController = new HelloWorldController();

        String response = helloWorldController.helloWorld();

        assertThat(response, is("hello world!"));
    }

}