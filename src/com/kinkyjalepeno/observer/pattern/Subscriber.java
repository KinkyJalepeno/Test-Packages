package com.kinkyjalepeno.observer.pattern;

public class Subscriber {

    private String name;
    private Channel channel = new Channel();


    public Subscriber(String name) {
        this.name = name;
    }

    public void update(){

        System.out.println(name + " New Upload: " + channel.title);
    }

    public void subscribeToChannel(Channel ch){
        channel = ch;
    }
}
