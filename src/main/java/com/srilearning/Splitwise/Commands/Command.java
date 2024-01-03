package com.srilearning.Splitwise.Commands;

public interface Command {

    void execute(String input);

    // validate
    boolean matches(String input);
}
