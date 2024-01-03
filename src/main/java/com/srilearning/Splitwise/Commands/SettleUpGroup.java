package com.srilearning.Splitwise.Commands;

import com.srilearning.Splitwise.Controllers.SettleUpController;
import com.srilearning.Splitwise.DTOs.SettleUpGroupRequestDto;
import com.srilearning.Splitwise.DTOs.SettleUpGroupResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SettleUpGroup implements Command{
    /*
    Expected Input :- SettleUpGroup <group_id>

    settleUpGroup 1234
     */
    private SettleUpController settleUpController;

    @Autowired
    public SettleUpGroup(SettleUpController settleUpController) {
        this.settleUpController = settleUpController;
    }

    @Override
    public void execute(String input) {
        List<String> words = List.of(input.split(" "));

        Long groupId = Long.valueOf(words.get(1));

        SettleUpGroupRequestDto settleUpGroupRequestDto =
                new SettleUpGroupRequestDto();
        settleUpGroupRequestDto.setGroupId(groupId);

        SettleUpGroupResponseDto responseDto =
                settleUpController.settleUpGroup(settleUpGroupRequestDto);
    }

    @Override
    public boolean matches(String input) {
        List<String> words = List.of(input.split(" "));

        return words.size() == 2 && words.get(0).equals(CommandKeywords.SettleUpGroup);
        //return false;
    }
}
