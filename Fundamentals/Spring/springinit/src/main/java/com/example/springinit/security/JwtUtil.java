package com.example.springinit.security;

import java.util.Date;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtUtil {
    // Secret key used for signing and verifying JWT tokens
    // Note: Change this to a more secure key and store it safely in production (e.g., environment variables)
    private static final String SECRET_KEY = "secret123";  

    // Token expiration time (1 day = 86400000 milliseconds)
    private static final long EXPIRATION_TIME = 86400000;  

    /**
     * Generates a JWT token for the given username.
     *
     * @param username The username for which the token is generated.
     * @return A signed JWT token.
     */
    public String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username)  // Set the subject as the username
                .setIssuedAt(new Date())  // Set the issued date (current time)
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME)) // Set expiration time
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)  // Sign the token with HS256 algorithm and secret key
                .compact();  // Compact and return the token as a string
    }

    /**
     * Extracts the username from the given JWT token.
     *
     * @param token The JWT token.
     * @return The username (subject) from the token.
     */
    public String extractUsername(String token) {
        return getClaims(token).getSubject();  // Extract and return the subject (username)
    }

    /**
     * Retrieves the claims (payload data) from the given JWT token.
     *
     * @param token The JWT token.
     * @return The claims extracted from the token.
     */
    private Claims getClaims(String token) {
        return Jwts.parser()
                .setSigningKey(SECRET_KEY)  // Set the secret key for verification
                .parseClaimsJws(token)  // Parse the token and verify the signature
                .getBody();  // Extract the body (claims)
    }

    /**
     * Validates a JWT token by checking the username and expiration.
     *
     * @param token The JWT token to validate.
     * @param username The expected username.
     * @return true if the token is valid, false otherwise.
     */
    public boolean validateToken(String token, String username) {
        return (username.equals(extractUsername(token)) && !isTokenExpired(token));
    }

    /**
     * Checks if the given token is expired.
     *
     * @param token The JWT token.
     * @return true if the token is expired, false otherwise.
     */
    private boolean isTokenExpired(String token) {
        return getClaims(token).getExpiration().before(new Date());  // Check if expiration date is before the current time
    }
}
