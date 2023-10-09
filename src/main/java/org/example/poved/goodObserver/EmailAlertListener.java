package org.example.poved.goodObserver;

import java.util.Observable;
import java.util.Observer;

public class EmailAlertListener implements EventListeners {
    public String message;

    public EmailAlertListener() {
        message = "Updated";
    }

  /*  @Override
    public void update(Observable o, Object arg) {
        System.out.println(phrase + " " + arg);
    } */

    @Override
    public void update(String message) {
        System.out.println(message);
    }
}
