package org.example.poved.observer;
import java.util.Observable;

public class Editor extends Observable {
    void openFile(){
        System.out.println("Файл открыт");
        super.setChanged();
        super.notifyObservers("Сообщили об открытии файла");
    }

    void saveFile(){
        System.out.println("Файл сохранен");
        super.setChanged();
        super.notifyObservers("Сохранили файл");
    }
}
