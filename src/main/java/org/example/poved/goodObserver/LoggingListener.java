package org.example.poved.goodObserver;

import java.util.Observable;
import java.util.Observer;

public class LoggingListener implements EventListeners {

    //public String phrase_1;
    public String message;
    public LoggingListener() {
       // phrase_1 = "Сообщение";
        message = "Updated";
    }

   /* @Override
    public void update(Observable o, Object arg) {

        System.out.println(phrase_1 + " " + arg);
    } */

    @Override
    public void update(String message) {
        System.out.println(message);
    }
}
