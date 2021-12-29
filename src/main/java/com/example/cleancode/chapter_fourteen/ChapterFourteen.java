package com.example.cleancode.chapter_fourteen;

public class ChapterFourteen {
    public static void main(String[] args) {
        try {
            Args arg = new Args("l,p#,d*", args);
            Boolean logging = arg.getBoolean('l');
            int port = arg.getInt('d');
            String directory = arg.getString('d');
        } catch (ArgsException e) {
            System.out.println("e = " + e.errorMessage());
        }
    }
}
