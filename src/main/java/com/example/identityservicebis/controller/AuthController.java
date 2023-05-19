package com.example.identityservicebis.controller;

import com.example.identityservicebis.dto.AuthRequest;
import com.example.identityservicebis.service.AuthService;
import io.jsonwebtoken.ExpiredJwtException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private AuthService service;

    @PostMapping("/token")
    public String getToken(@RequestBody AuthRequest authRequest) {
                   return service.generateToken(authRequest.getUsername());
    }

    @GetMapping("/validate")
    public String validateToken(@RequestParam("token") String token) {
        try {
            service.validateToken(token);
            return "Token is valid";
        }
        catch(ExpiredJwtException eje){
          System.out.println(eje.getMessage());
          return eje.getMessage();
        }
    }
}
