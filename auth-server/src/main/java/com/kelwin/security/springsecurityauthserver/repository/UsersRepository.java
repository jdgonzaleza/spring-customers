package com.kelwin.security.springsecurityauthserver.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kelwin.security.springsecurityauthserver.model.Users;

import java.util.Optional;

@Repository
public interface UsersRepository extends CrudRepository<Users, String> {
    Optional<Users> findByUsername(String username);
}
