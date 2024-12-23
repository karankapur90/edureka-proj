package com.egov.loxanalyticsservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SocialRepository extends JpaRepository<Social, String> {
}