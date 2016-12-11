package com.example.sayla.messages;

/**
 * Created by sayla on 11/12/2016.
 */
public class getmethods {
    
    String message;
    String nodekey;


    public getmethods(String name, String nodekey) {
        this.message = name;
        this.nodekey = nodekey;
    }

    public String getName() {
        return message;
    }

    public String getNodekey() {
        return nodekey;
    }
}
