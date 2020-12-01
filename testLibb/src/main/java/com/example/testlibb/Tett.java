package com.example.testlibb;

public class Tett {

    private static Tett mTett;

    public static Tett getInstance() {
        mTett = new Tett();
        return mTett;
    }

    private String getTTTT() {
        return "ttt";
    }
}
