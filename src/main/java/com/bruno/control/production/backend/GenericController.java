package com.bruno.control.production.backend;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class GenericController {

    @GetMapping("/hello")
    public String hello() {
        return "Hola , Bruno";
    }

    @GetMapping("/generic-response")
    public ResponseEntity<Map<String, Object>> getGenericResponse() {
        Map<String, Object> response = new HashMap<>();
        response.put("message", "This is a generic response");
        response.put("status", "success");
        return ResponseEntity.ok(response);
    }
}
