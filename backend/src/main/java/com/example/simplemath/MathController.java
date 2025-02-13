package com.example.simplemath;

import org.springframework.web.bind.annotation.*;

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
