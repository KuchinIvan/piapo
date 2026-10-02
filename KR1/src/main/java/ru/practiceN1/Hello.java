package ru.practiceN1;

import java.io.PrintStream;

public class Hello {
    static void printHelloWorld(PrintStream stream) {
        Hello_impl.print(stream);
    }
}
