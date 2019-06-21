package com.kelwin.security.springsecurityauthserver.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends CrudRepository<Users, String> {
    Optional<Users> findByUsername(String username);
}
