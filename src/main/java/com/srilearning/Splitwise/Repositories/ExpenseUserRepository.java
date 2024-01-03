package com.srilearning.Splitwise.Repositories;

import com.srilearning.Splitwise.Models.ExpenseUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ExpenseUserRepository extends JpaRepository<ExpenseUser, Long> {
}
