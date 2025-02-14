package com.example.simplemath;

import org.springframework.web.bind.annotation.*;

// A controller handles incoming HTTP requests(GET, POST, etc.)
// It processes request parameters or JSON data
// Calls the service layer or business logic (e.g., SimpleMath class)
// Returns the response to the client (JSON, text, etc.)

@RestController
@RequestMapping("/api")
public class MathController {
    private final SimpleMath simpleMath = new SimpleMath();

    @PostMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return simpleMath.add(a, b);
    }

    //Add a root endpoint
    @GetMapping("/")
    public String home() {
        return "Welcome to the Simple Math API! Use /api/add to add two numbers.";
    }
}
