package com.srilearning.Splitwise.Services;

import com.srilearning.Splitwise.Models.Expense;
import com.srilearning.Splitwise.Models.ExpenseUser;
import com.srilearning.Splitwise.Models.Group;
import com.srilearning.Splitwise.Models.User;
import com.srilearning.Splitwise.Repositories.ExpenseRepository;
import com.srilearning.Splitwise.Repositories.ExpenseUserRepository;
import com.srilearning.Splitwise.Repositories.GroupRepository;
import com.srilearning.Splitwise.Repositories.UserRepository;
import com.srilearning.Splitwise.Strategies.SettleUpStrategy;
import com.srilearning.Splitwise.Strategies.SettleUpStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SettleUpService {
    SettleUpStrategy settleUpStrategy;

    @Autowired
    public SettleUpService(SettleUpStrategy settleUpStrategy) {
        this.settleUpStrategy = settleUpStrategy;
    }

    public void settleUpGroup(Long groupId) {
        //get Expenses for the group and pass on to the function on the strategy.
    }
}
