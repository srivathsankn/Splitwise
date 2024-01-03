package com.srilearning.Splitwise.Controllers;

import com.srilearning.Splitwise.DTOs.SettleUpGroupRequestDto;
import com.srilearning.Splitwise.DTOs.SettleUpGroupResponseDto;
import com.srilearning.Splitwise.DTOs.SettleUpUserRequestDto;
import com.srilearning.Splitwise.DTOs.SettleUpUserResponseDto;
import com.srilearning.Splitwise.Models.Expense;
import com.srilearning.Splitwise.Services.SettleUpService;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class SettleUpController {

    private SettleUpService settleUpService;
    public SettleUpGroupResponseDto settleUpGroup(
            SettleUpGroupRequestDto settleUpGroupRequestDto
    ) {
        // settleup service -> settleup strategy
        settleUpService.settleUpGroup(settleUpGroupRequestDto.getGroupId());

        return null;
    }

    public SettleUpUserResponseDto settleUpUser(
            SettleUpUserRequestDto settleUpUserRequestDto)
    {
        return null;
    }
}

// Deepak -> Hitesh : 500
