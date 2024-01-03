package com.srilearning.Splitwise.Repositories;

import com.srilearning.Splitwise.Models.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
