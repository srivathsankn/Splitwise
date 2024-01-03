package com.srilearning.Splitwise.Strategies;

import com.srilearning.Splitwise.Models.Expense;

import java.util.List;

public interface SettleUpStrategy {
    public List<Expense> settleUp(List<Expense> expenses);
}
