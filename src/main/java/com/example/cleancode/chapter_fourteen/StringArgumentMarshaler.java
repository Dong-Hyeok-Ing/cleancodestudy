package com.example.cleancode.chapter_fourteen;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static com.example.cleancode.chapter_fourteen.ArgsException.ErrorCode.MISSING_STRING;

public class StringArgumentMarshaler implements ArgumentMarshaler {
    private String stringVale = "";

    public void set(Iterator<String> currentArgument) throws ArgsException {
        try {
            stringVale = currentArgument.next();
        } catch (NoSuchElementException e) {
            throw new ArgsException(MISSING_STRING);
        }
    }

    public static String getValue(ArgumentMarshaler am) {
        if (am != null && am instanceof StringArgumentMarshaler)
            return ((StringArgumentMarshaler) am).stringVale;
        else
            return "";
    }
}
