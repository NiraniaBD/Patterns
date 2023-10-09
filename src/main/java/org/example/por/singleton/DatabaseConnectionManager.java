package org.example.por.singleton;

public class DatabaseConnectionManager {
    private String a;
    private boolean b;

    private static DatabaseConnectionManager INSTANCE;

    public static DatabaseConnectionManager getInstance() {
        if (INSTANCE == null) {
           INSTANCE = new DatabaseConnectionManager();
        }
        return INSTANCE;

    }

    private DatabaseConnectionManager(String a) {
        this.a = a;
    }

    private DatabaseConnectionManager(boolean b) {
        this.b = b;
    }

    private DatabaseConnectionManager(String a, boolean b) {
        this.a = a;
        this.b = b;
    }

    private DatabaseConnectionManager() {
    }



}
