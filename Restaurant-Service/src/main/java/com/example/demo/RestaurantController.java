
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaurantController {

    @GetMapping("/")
    public String home() {
        return "Restaurant Service is running!";
    }

    @GetMapping("/restaurants")
    public String getRestaurants() {
        return "Restaurant 1: Pizza Palace, Restaurant 2: Burger Hub";
    }
}
