package com.startup.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class CommandInvoker {
    private List<Command> history = new ArrayList<>();

    public void executeCommand(Command command) {
        command.execute();
        history.add(command);
    }

    public void undoLast() {
        if (!history.isEmpty()) {
            Command last = history.remove(history.size() - 1);
            last.undo();
        } else {
            System.out.println("No commands to undo.");
        }
    }

    public void undo(Command command) {
        if (!history.isEmpty()) {
            history.remove(command);
            command.undo();
        } else {
            System.out.println("No commands to undo.");
        }
    }
}
