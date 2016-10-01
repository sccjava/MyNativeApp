package com.harman.mylib;

public class MyLib {

    public static MyLib myLib;

    public static MyLib getInstance(){
        if(myLib == null){
            myLib = new MyLib();
        }
        return myLib;
    }

    static{
        System.loadLibrary("mylib-jni");
    }

    public native int create();
}
