package com.kinkyjalepeno.observer.pattern;

public class YouTube {

    public static void main(String[] args) {

        Subscriber s1 = new Subscriber("Dave");
        Subscriber s2 = new Subscriber("Bev");
        Subscriber s3 = new Subscriber("Nige");
        Subscriber s4 = new Subscriber("Matt");
        Subscriber s5 = new Subscriber("Mark");

        Channel kinkyJalepeno = new Channel();

        s1.subscribeToChannel(kinkyJalepeno);
        s2.subscribeToChannel(kinkyJalepeno);
        s3.subscribeToChannel(kinkyJalepeno);
        s4.subscribeToChannel(kinkyJalepeno);
        s5.subscribeToChannel(kinkyJalepeno);

        kinkyJalepeno.registerForUpdates(s1);
        kinkyJalepeno.registerForUpdates(s2);
        kinkyJalepeno.registerForUpdates(s3);
        kinkyJalepeno.registerForUpdates(s4);
        kinkyJalepeno.registerForUpdates(s5);

        kinkyJalepeno.unSubscribe(s3);


        kinkyJalepeno.upload("The Day the Earth Stood Still");


    }

}
