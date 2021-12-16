package com.brian.belajarspringboot.dao;

/**
 * @author Brian.kristianto
 * @created 15/12/2021 - 10:00 PM
 **/
public class Greeting {
    private final String content;

    public Greeting(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
