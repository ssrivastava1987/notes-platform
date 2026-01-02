package com.notes.platform.service;

import com.notes.platform.entity.Discussion;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * Author: shubhamsrivastava
 *
 **/
@Service
public class DiscussionService {


    private final PasswordEncoder encoder;

    public DiscussionService(PasswordEncoder encoder) {
        this.encoder = encoder;
    }


    public void lock(Discussion d, String password) {
        d.setLocked(true);
        d.setLockPasswordHash(encoder.encode(password));
    }


    public boolean unlock(Discussion d, String password) {
        if (encoder.matches(password, d.getLockPasswordHash())) {
            d.setLocked(false);
            return true;
        }
        return false;
    }
}
