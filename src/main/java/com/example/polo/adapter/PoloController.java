package com.example.polo.adapter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class PoloController {

    @GetMapping
    public String polo() {
        return "polo";
    }
}
