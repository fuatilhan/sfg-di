package com.fuatilhan.sfgdi.controller;

import com.fuatilhan.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {
    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller=new PropertyInjectedController();
        controller.greetingService=new ConstructorGreetingService();
    }

    @Test
    void sayGreeting() {
        System.out.println(controller.sayGreeting());
    }
}