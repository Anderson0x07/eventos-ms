package com.email.implement;

import com.email.service.EmailService;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

    @Override
    public String envioEmail() {
        return "Bienvenido usuario";
    }
}
