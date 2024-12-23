package com.secor.loxauthservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthtokenRepository extends JpaRepository<Authtoken, String> {
}