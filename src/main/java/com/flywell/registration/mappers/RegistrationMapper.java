package com.flywell.registration.mappers;

import com.flywell.registration.dto.RegistrationDto;
import com.flywell.registration.entities.RegistrationEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class RegistrationMapper {

    public RegistrationEntity dtoToEntity(RegistrationDto registrationDto) {
        RegistrationEntity registrationEntity = new RegistrationEntity();
        registrationEntity.setEmail(registrationDto.getEmail());
        registrationEntity.setFirstName(registrationDto.getFirstName());
        registrationEntity.setLastName(registrationDto.getLastName());
        registrationEntity.setUsername(registrationDto.getUsername());
        registrationEntity.setMobileNo(registrationDto.getMobileNo());
        registrationEntity.setPassword(new BCryptPasswordEncoder().encode(registrationDto.getPassword()));
        return registrationEntity;
    }
}
