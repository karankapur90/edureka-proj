package com.egov.loxanalyticsservice;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SocialeventRepository extends JpaRepository<Socialevent, UUID>
{

    Socialevent findByCitizenid(UUID citizenid);
}