package com.srilearning.Splitwise.Commands;

import org.springframework.stereotype.Component;

@Component
public class UpdateProfileCommand implements Command {
    @Override
    public void execute(String input) {

    }

    @Override
    public boolean matches(String input) {
        return false;
    }
}
