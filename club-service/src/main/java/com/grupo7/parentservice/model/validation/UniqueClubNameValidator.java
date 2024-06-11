package com.grupo7.parentservice.model.validation;

import org.springframework.beans.factory.annotation.Autowired;

import com.grupo7.parentservice.repository.ClubRepository;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class UniqueClubNameValidator implements ConstraintValidator<UniqueClubName, String> {

    private final ClubRepository clubRepository;

    @Autowired
    public UniqueClubNameValidator(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }

    @Override
    public boolean isValid(String clubName, ConstraintValidatorContext context) {
        return clubRepository.
                findByName(clubName).
                isEmpty();
    }
}
