package org.example.poved.observer;

import java.util.Observable;
import java.util.Observer;

public class EmailAlertListener implements Observer {
    public String phrase;

    public EmailAlertListener() {
        phrase = "Сообщение";
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(phrase + " " + arg);
    }
}
