package com.flywell.registration.controller;

import com.flywell.registration.dto.RegistrationDto;
import com.flywell.registration.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class RegistrationController {

    /*
    Validation for mobile number, email and username.
    Encrypt password before saving.
    exceptions
     */

    @Autowired
    private RegistrationService registrationService;

    @PostMapping("/register")
    public void register(@RequestBody RegistrationDto registrationDto) {
        registrationService.register(registrationDto);
    }
}
