package com.flywell.registration.service.impl;

import com.flywell.registration.dto.RegistrationDto;
import com.flywell.registration.entities.RegistrationEntity;
import com.flywell.registration.mappers.RegistrationMapper;
import com.flywell.registration.repo.RegistrationRepo;
import com.flywell.registration.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    private RegistrationRepo registrationRepo;

    @Autowired
    private RegistrationMapper registrationMapper;

    @Override
    public void register(RegistrationDto registrationDto) {

        RegistrationEntity registrationEntity = registrationMapper.dtoToEntity(registrationDto);
        registrationRepo.save(registrationEntity);
    }
}
