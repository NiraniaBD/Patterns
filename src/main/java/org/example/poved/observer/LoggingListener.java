package org.example.poved.observer;

import java.util.Observable;
import java.util.Observer;

public class LoggingListener implements Observer {

    public String phrase_1;

    public LoggingListener() {
        phrase_1 = "Сообщение";
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(phrase_1 + " " + arg);
    }
}
