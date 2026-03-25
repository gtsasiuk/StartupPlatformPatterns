package com.startup.patterns.behavioral.memento;

import java.util.Stack;

public class ConfigHistory {
    private Stack<LaunchConfigMemento> history = new Stack<>();

    public void save(LaunchConfigMemento memento) {
        history.push(memento);
    }

    public LaunchConfigMemento undo() {
        if (!history.isEmpty()) {
            return history.pop();
        }
        return null;
    }
}
