package org.example.poved.observer;

import java.util.Observer;

public class MainObserver {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.addObserver(new EmailAlertListener());
        editor.addObserver(new LoggingListener());

    }
}
