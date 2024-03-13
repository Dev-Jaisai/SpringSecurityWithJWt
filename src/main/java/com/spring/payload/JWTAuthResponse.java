package com.spring.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JWTAuthResponse {
    private String accessToken;
    private String tokenType = "Bearer";

    // Add this constructor
    public JWTAuthResponse(String accessToken) {
        this.accessToken = accessToken;
    }

}