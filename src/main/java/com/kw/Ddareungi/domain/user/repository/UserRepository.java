package com.kw.Ddareungi.domain.user.repository;

import com.kw.Ddareungi.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
