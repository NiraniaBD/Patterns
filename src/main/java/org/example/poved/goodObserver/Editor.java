package org.example.poved.goodObserver;

import java.util.Observable;

public class Editor {

    private EventManager eventManager;

    public Editor(EventManager eventManager) {
        this.eventManager = eventManager;
    }

    void openFile(){
        eventManager.notifyListener("Открыт файл");
    }

    void saveFile(){
        eventManager.notifyListener("Сохранен файл");
    }
}