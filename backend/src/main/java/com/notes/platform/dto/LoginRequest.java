package com.notes.platform.dto;

/**
 * Author: shubhamsrivastava
 *
 **/
public record LoginRequest(
        String email,
        String password
) {}