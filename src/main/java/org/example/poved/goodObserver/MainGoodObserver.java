package org.example.poved.goodObserver;

import org.example.poved.goodObserver.Editor;

public class MainGoodObserver {
    public static void main(String[] args) {
        EventManager eventManager = new EventManager();
        eventManager.subscribe(new EmailAlertListener());
        eventManager.subscribe(new LoggingListener());

        Editor editor = new Editor(eventManager);
        editor.openFile();
        editor.saveFile();
    }
}
