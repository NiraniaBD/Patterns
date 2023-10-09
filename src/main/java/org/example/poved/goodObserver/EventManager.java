package org.example.poved.goodObserver;

import java.util.HashSet;
import java.util.Set;

public class EventManager {
    private Set<EventListeners> listenerSet = new HashSet<>();

    void subscribe(EventListeners listener){
        listenerSet.add(listener);

    }

    void unsubscribe(EventListeners listener){
        listenerSet.remove(listener);

    }

    void notifyListener( eventType, data){

    }
}
