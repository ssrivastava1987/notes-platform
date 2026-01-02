package com.notes.platform.config;

import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Author: shubhamsrivastava
 *
 **/
@Component
public class JwtUtil {
    private final String SECRET = "dev-secret-key";


//    public String generateToken(String email) {
//        return Jwts.builder()
//                .setSubject(email)
//                .setIssuedAt(new Date())
//                .setExpiration(new Date(System.currentTimeMillis() + 86400000))
//                .signWith(SignatureAlgorithm.HS256, SECRET)
//                .compact();
//    }
}
