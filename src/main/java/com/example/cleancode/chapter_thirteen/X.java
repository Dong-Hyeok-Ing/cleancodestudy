package com.example.cleancode.chapter_thirteen;

public class X {
    private int lastIdUsed;

    public int getNextId() {
        return ++lastIdUsed;
    }

    public int getLastIdUsed() {
        return lastIdUsed;
    }

    public X(int lastIdUsed) {
        this.lastIdUsed = lastIdUsed;
    }
}

