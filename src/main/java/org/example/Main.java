package org.example;

import org.example.por.singleton.DatabaseConnectionManager;
import org.example.poved.strategy.*;

import java.util.ArrayList;
import java.util.Iterator;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        DatabaseConnectionManager abc = DatabaseConnectionManager.getInstance();
        System.out.println(abc);

        DatabaseConnectionManager def = DatabaseConnectionManager.getInstance();
        System.out.println(def);

        ArrayList <Integer> arr = new ArrayList<>();

        arr.add(5);
        arr.add(15);
        arr.add(25);
        arr.add(35);
        arr.add(45);

        Iterator<Integer> it = arr.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        NaMashine mashina = new NaMashine();
        Peshkom peshkom = new Peshkom();
        ObscheePolzovanie marshrutka = new ObscheePolzovanie();
        marshrutka.postroitMarshrut();
        peshkom.postroitMarshrut();
        mashina.postroitMarshrut();

        Strategy strategy = new Strategy();
        strategy.marshrut(new NaMashine());
        strategy.marshrut(new Peshkom());
        strategy.marshrut(new ObscheePolzovanie());




    }
}