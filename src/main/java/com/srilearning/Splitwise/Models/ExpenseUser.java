package com.srilearning.Splitwise.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ExpenseUser extends BaseModel {
    @ManyToOne
    private User user;

    @ManyToOne
    private Expense expense;

    private int amount;

    @Enumerated(EnumType.STRING)
    private ExpenseUserType expenseUserType;
}
