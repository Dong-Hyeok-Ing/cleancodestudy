package com.example.cleancode.chapter_thirteen;

public class MyRunnable implements Runnable{
   final X threadX = new X(42);
    @Override
    public void run() {
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
        System.out.println("threadNextId = " + threadX.getNextId());
        System.out.println("threadLastIdUsed = " + threadX.getLastIdUsed());
    }
}
