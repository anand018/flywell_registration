package com.flywell.registration.repo;

import com.flywell.registration.entities.RegistrationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepo extends JpaRepository<RegistrationEntity, Integer> {
}
