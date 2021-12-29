package com.example.cleancode.chapter_thirteen;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
public class ChapterThirteen{
    public int getLastIdUsed() {
        return lastIdUsed;
    }

    private int lastIdUsed;

    public ChapterThirteen(int lastIdUsed) {
        this.lastIdUsed = lastIdUsed;
    }

    public int getNextId() {
        return ++lastIdUsed;
    }

    public static void main(String[] args) {
//       MyRunnable r1 = new MyRunnable();
//
//        Thread t1 = new Thread(r1);
//        Thread t2 = new Thread(r1);
//
//        t1.start();
//        t2.start();

        final ChapterThirteen chapterThirteen = new ChapterThirteen(42);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
                System.out.println("chapterThirteen = " + chapterThirteen.getNextId());
                System.out.println("chapterThirteen = " + chapterThirteen.lastIdUsed);
                StringBuilder str = new StringBuilder();
                str.append("thread").append(Thread.currentThread().getName())
                        .append(", id: ").append(chapterThirteen.getNextId())
                        .append(", lastIdUsed: ").append(chapterThirteen.lastIdUsed);
                log.info(str.toString());
            }
        };
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t1.start();
        t2.start();
    }
}
