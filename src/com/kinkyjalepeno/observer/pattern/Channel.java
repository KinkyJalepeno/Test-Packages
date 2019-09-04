package com.kinkyjalepeno.observer.pattern;

import java.util.ArrayList;
import java.util.List;

public class Channel {

    private List<Subscriber> subs = new ArrayList<>();
    public String title;

    public void registerForUpdates(Subscriber sub){

        subs.add(sub);
    }

    public void unSubscribe(Subscriber sub){

        subs.remove(sub);
    }

    public void notifySubscribers(){

        for(Subscriber sub : subs){

            sub.update();
        }
    }

    public void upload(String title){

        this.title = title;
        notifySubscribers();
    }
}
