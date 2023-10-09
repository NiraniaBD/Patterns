package org.example.poved.goodObserver;

import java.util.Observable;

public class Editor {

    private EventManager eventManager;
    void openFile(){
        System.out.println("Файл открыт");
    }

    void saveFile(){
        System.out.println("Файл сохранен");
    }
}