package com.harman.mynativeapp.api;

/**
 * Created by Sunny.Sun on 7/5/16.
 */
public class PlayerAPI {
    private static PlayerAPI playerAPI;

    public static PlayerAPI getInstance(){
        if(playerAPI == null){
            playerAPI = new PlayerAPI();
        }
        return playerAPI;
    }

    static{
        System.loadLibrary("player-jni");
    }

    public native int create();
}
