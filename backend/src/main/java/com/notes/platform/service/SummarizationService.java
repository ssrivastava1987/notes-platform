package com.notes.platform.service;

import org.springframework.stereotype.Service;

/**
 * Author: shubhamsrivastava
 *
 **/
@Service
public class SummarizationService {
    public String summarize(String text) {
        return "Summary:\n" + text.substring(0, Math.min(300, text.length()));
    }
}
