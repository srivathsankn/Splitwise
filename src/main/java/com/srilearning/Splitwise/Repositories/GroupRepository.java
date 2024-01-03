package com.srilearning.Splitwise.Repositories;

import com.srilearning.Splitwise.Models.Group;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GroupRepository extends JpaRepository<Group, Long> {
}
