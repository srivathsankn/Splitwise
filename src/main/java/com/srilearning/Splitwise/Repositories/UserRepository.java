package com.srilearning.Splitwise.Repositories;

import com.srilearning.Splitwise.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
}
