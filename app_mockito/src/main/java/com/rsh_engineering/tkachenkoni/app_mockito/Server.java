package com.rsh_engineering.tkachenkoni.app_mockito;

/**
 * Created by Nikolay Tkachenko on 13, October, 2020
 */
public class Server {

    public static boolean sendToServer(){
        boolean didSendToServer = false;
        if (isSuccessful()){
            didSendToServer = true;
        }
        return didSendToServer;
    }

    public static boolean isSuccessful() {
        return false;
    }

}
